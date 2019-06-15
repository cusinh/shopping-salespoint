package vn.com.itzenk.shopping.service;

import java.util.List;
import java.util.Optional;

import org.salespointframework.catalog.ProductIdentifier;

import vn.com.itzenk.shopping.entity.ProductEntity;
import vn.com.itzenk.shopping.entity.ProductEntity.ProductType;

public interface ProductService {
	void CreateProduct(ProductEntity productEntity);

	void UpdateProduct(ProductEntity productEntity);

	void DeleteProduct(ProductIdentifier id);

	List<ProductEntity> getAllProduct();

	List<ProductEntity> getAllByProductType(ProductType productType);

	Optional<ProductEntity> getProductByProductId(ProductIdentifier id);

	List<ProductEntity> findNewProduct();

	long countByProductType(ProductType type);

	List<ProductEntity> searchProductByProductName(String name);

}
