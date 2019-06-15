//package vn.com.itzenk.shopping.datainit;
//
//import org.salespointframework.core.DataInitializer;
//import org.salespointframework.inventory.Inventory;
//import org.salespointframework.inventory.InventoryItem;
//import org.salespointframework.quantity.Quantity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.util.Assert;
//
//import vn.com.itzenk.shopping.entity.ProductEntity;
//import vn.com.itzenk.shopping.service.ProductService;
//
//@Component
//@Order(20)
//class InventoryInitializer implements DataInitializer {
//
//	private final Inventory<InventoryItem> inventory;
//	
//	@Autowired
//	ProductService productService;
//	
//	ProductEntity productEntity = new ProductEntity();;
//
//	InventoryInitializer(Inventory<InventoryItem> inventory) {
//		Assert.notNull(inventory, "Inventory must not be null!");
//		this.inventory = inventory;
//	}
//
//	@Override
//	public void initialize() {
//		productService.getAllProduct().forEach(productEntity -> {
//			inventory.findByProduct(productEntity)
//					.orElseGet(() -> inventory.save(new InventoryItem(productEntity, Quantity.of(100))));
//		});
//	}
//}
