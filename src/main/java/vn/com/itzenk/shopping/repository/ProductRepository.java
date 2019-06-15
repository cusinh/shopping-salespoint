package vn.com.itzenk.shopping.repository;

import java.util.List;

import org.salespointframework.catalog.Catalog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vn.com.itzenk.shopping.entity.ProductEntity;
import vn.com.itzenk.shopping.entity.ProductEntity.ProductType;

@Repository
public interface ProductRepository extends Catalog<ProductEntity> {
	static final Sort DEFAULT_SORT = Sort.by("productIdentifier").descending();

	@Query("SELECT p FROM ProductEntity p ORDER BY p.id")
	List<ProductEntity> findNewProduct(Pageable pageable);

	@Query("SELECT COUNT(p) FROM ProductEntity p WHERE p.type=:type")
	long countByProductType(@Param("type") ProductType type);

	List<ProductEntity> findByType(ProductType type, Sort sort);

	@Query("SELECT p FROM ProductEntity p WHERE p.name LIKE '%' || :name || '%' ")
	List<ProductEntity> searchProductByProductName(@Param("name") String name);
}
