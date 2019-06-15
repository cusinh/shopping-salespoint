package vn.com.itzenk.shopping.service.impl;

import java.util.List;
import java.util.Optional;

import org.salespointframework.catalog.ProductIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import vn.com.itzenk.shopping.entity.ProductEntity;
import vn.com.itzenk.shopping.entity.ProductEntity.ProductType;
import vn.com.itzenk.shopping.repository.ProductRepository;
import vn.com.itzenk.shopping.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void CreateProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
	}

	@Override
	public void UpdateProduct(ProductEntity productEntity) {

	}

	@Override
	public List<ProductEntity> getAllProduct() {
		return (List<ProductEntity>) productRepository.findAll();
	}

	@Override
	public void DeleteProduct(ProductIdentifier id) {
		productRepository.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ProductEntity> findNewProduct() {
		return productRepository.findNewProduct(new PageRequest(0, 6));
	}

	@Override
	public long countByProductType(ProductType type) {
		return productRepository.countByProductType(type);
	}

	@Override
	public Optional<ProductEntity> getProductByProductId(ProductIdentifier id) {
		return productRepository.findById(id);
	}

	@Override
	public List<ProductEntity> getAllByProductType(ProductType productType) {
		return productRepository.findByType(productType, ProductRepository.DEFAULT_SORT);
	}

	@Override
	public List<ProductEntity> searchProductByProductName(String name) {
		return productRepository.searchProductByProductName(name);
	}

}
