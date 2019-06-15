package vn.com.itzenk.shopping.entity;

import javax.persistence.Entity;

import org.javamoney.moneta.Money;
import org.salespointframework.catalog.Product;

@Entity
public class ProductEntity extends Product {
	public static enum ProductType {
		MEN, WOMEN, SHOES;
	};
	private String image;
	private String size;
	private String color;
	private String description;
	private ProductType type;
	
	// Constructor
	public ProductEntity() {
		super();
	}
	// Constructor
	public ProductEntity(String name, Money price, String image, String size, String color, String description,
			ProductType type) {
		super(name, price);
		this.image = image;
		this.size = size;
		this.color = color;
		this.description = description;
		this.type = type;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + getType();
	}
	
	

}
