//
//package vn.com.itzenk.shopping.datainit;
//
//import static org.salespointframework.core.Currencies.EURO;
//
//import org.javamoney.moneta.Money;
//import org.salespointframework.core.DataInitializer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import vn.com.itzenk.shopping.entity.ProductEntity;
//import vn.com.itzenk.shopping.entity.ProductEntity.ProductType;
//import vn.com.itzenk.shopping.service.ProductService;
//
//@Component
//
//@Order(20)
//public class ProductInit implements DataInitializer {
//
//	@Autowired
//	ProductService productService;
//
//	@Override
//	public void initialize() { // add product type Women
//		productService.CreateProduct(new ProductEntity("FLEXIMAA Women's Cotton Hoodie", Money.of(9.22, EURO),
//				"/images/81mKbpdBFDL._UL1500_.jpg", "Small", "Grey",
//				"Neck Style: Hoodies, Fit Type: Regular, Sleeve: Full Sleeves\n"
//						+ "Occasion: Casual, Material: Cotton\n" + "Wash Care Instructions: Wash in cold water",
//				ProductType.WOMEN));
//		productService.CreateProduct(new ProductEntity("Sfine Denim Solid Casual Dungaree for Women",
//				Money.of(9.5, EURO), "/images/618JlahFoZL._UL1500_.jpg", "Small", "Grey",
//				"Comfort To Wear With Body Hugging Fit, Making You Look Smart & Slim\n"
//						+ "Disclaimer: Product Color May Slightly Vary Due To Photographic Lighting Sources Or Your Monitor Settings.\n"
//						+ "Ready To Dispatch",
//				ProductType.WOMEN));
//
//		productService.CreateProduct(new ProductEntity("Miss Chase Women's Blue Denim Dungaree", Money.of(8.22, EURO),
//				"/images/81peIYei9RL._UL1500_.jpg", "Small", "Blue",
//				"Neck Style: Hoodies, Fit Type: Regular, Sleeve: Full Sleeves\n"
//						+ "Occasion: Casual, Material: Cotton\n" + "Wash Care Instructions: Wash in cold water",
//				ProductType.WOMEN));
//		productService.CreateProduct(new ProductEntity("Zombom Women's Western Wear Top", Money.of(11.22, EURO),
//				"/images/41RyU6JyiAL.jpg", "Small", "red",
//				"Guaranteed delivery to pincode 400001 - Mumbai by Tuesday, June 11 9pm with One-Day Delivery — Order in the next 23 hours and 50 minutes Details",
//				ProductType.WOMEN));
//		productService.CreateProduct(new ProductEntity("Bikini Wear Top", Money.of(20, EURO),
//				"/images/nt.jpg", "Small", "blue",
//				"Guaranteed delivery to pincode 400001 - Mumbai by Tuesday, June 11 9pm with One-Day Delivery — Order in the next 23 hours and 50 minutes Details",
//				ProductType.WOMEN));
//		productService.CreateProduct(new ProductEntity("Zombom Women's Full Sleeve Top", Money.of(9.22, EURO),
//				"/images/71wrxUuKN2L._UL1500_.jpg", "Small", "Gray",
//				"DEAR CUSTOMER YOU VAN VISIT OUR STORE(ZOMBOM) AT AMAZON FOR DIFFERENT TYPES OF VARIETY OF SAREES, DRESS, SHIRT AND etc.",
//				ProductType.WOMEN));
//		productService.CreateProduct(new ProductEntity("Zink London Blue Solid Stripe Plap Knitted Top for Women",
//				Money.of(9.22, EURO), "/images/717PaV4EhcL._UL1440_.jpg", "Small", "Blue",
//				"DEAR CUSTOMER YOU VAN VISIT OUR STORE(ZOMBOM) AT AMAZON FOR DIFFERENT TYPES OF VARIETY OF SAREES, DRESS, SHIRT AND etc.",
//				ProductType.WOMEN)); // add product type Men
//		productService.CreateProduct(new ProductEntity("VIMAL Navy Blue Printed Round Neck Tshirt for Men",
//				Money.of(10.22, EURO), "/images/71Plp3KMtdL._UL1500_.jpg", "Large", "Blue",
//				"Vimal Presents Range of Graphic 3D Printed Tshirts For Giving Tshirts A Premium Look . Made From Pure Cotton , You Match Them With Jeans , Trackpants , Shorts And So On.Feel Vimal",
//				ProductType.MEN));
//		productService.CreateProduct(new ProductEntity("Amazon Brand - Symbol Men's Regular Fit Casual Shirt",
//				Money.of(20.22, EURO), "/images/91rFUKUwrxL._UL1500_.jpg", "Large", "Blue",
//				"Semi cut away collar\n"
//						+ "Machine wash warm, wash dark colors separately, do not bleach, tumble dry low, warm iron\n"
//						+ "Made in India\n" + "Tape at inner neck band and button placket",
//				ProductType.MEN));
//		productService.CreateProduct(new ProductEntity("Campus Sutra Men's Stripes Casual Shirt", Money.of(12.22, EURO),
//				"/images/41tlH1aBMAL.jpg", "Large", "Blue",
//				"The maximum order quantity for this product is limited to 5 units per customer", ProductType.MEN));
//		productService.CreateProduct(new ProductEntity("Campus Sutra Men's Checkered Regular fit Casual Shirt",
//				Money.of(12.22, EURO), "/images/41BbIFc6kFL.jpg", "Large", "Blue",
//				"The maximum order quantity for this product is limited to 5 units per customer", ProductType.MEN));
//		productService.CreateProduct(new ProductEntity("Campus Sutra Men Self Design Casual Shirt",
//				Money.of(12.22, EURO), "/images/41cDMJDG86L.jpg", "Large", "Black",
//				"The maximum order quantity for this product is limited to 5 units per customer", ProductType.MEN));
//		productService.CreateProduct(new ProductEntity("Campus Sutra Men Casual Shirt", Money.of(12.22, EURO),
//				"/images/416qsgYxdqL.jpg", "Large", "Black",
//				"The maximum order quantity for this product is limited to 5 units per customer", ProductType.MEN));
//
//		// add product type shoes
//		productService.CreateProduct(new ProductEntity("KRAFTER Women's Canvas Boots", Money.of(30, EURO),
//				"/images/81SR8rwsXlL._AC_UL320_.jpg", "Large", "Blue",
//				"Closure: Lace-Up\n" + "Inner material- synthetic\n" + "Style-women casual\n"
//						+ "Upper material -synthetic leather\n" + "Long durable\n" + "Closure: women heel shoes",
//				ProductType.SHOES));
//		productService.CreateProduct(new ProductEntity("KRAFTER Boots for Women Highly Comfortable and Reasonable",
//				Money.of(30, EURO), "/images/71XRv4XLKtL._UL1500_.jpg", "Large", "Blue",
//				"Closure: Lace-Up\n" + "Inner material- synthetic\n" + "Style-women casual\n"
//						+ "Upper material -synthetic leather\n" + "Long durable\n" + "Closure: women heel shoes",
//				ProductType.SHOES));
//		productService.CreateProduct(new ProductEntity(
//				"Denill Latest Collection, Comfortable & Stylish Embroided Sneakers for Women's and Girl's",
//				Money.of(30, EURO), "/images/61kdA20wN+L._UL1500_.jpg", "Large", "Pink",
//				"Closure: Lace-Up\n" + "Inner material- synthetic\n" + "Style-women casual\n"
//						+ "Upper material -synthetic leather\n" + "Long durable\n" + "Closure: women heel shoes",
//				ProductType.SHOES));
//		productService.CreateProduct(new ProductEntity("Shoe Swagg Beautiful Synthetic metarial Boots for Womens from",
//				Money.of(10, EURO), "/images/71uaktt25+L._UL1500_.jpg", "Large", "Black",
//				"Closure: Lace-Up\n" + "Inner material- synthetic\n" + "Style-women casual\n"
//						+ "Upper material -synthetic leather\n" + "Long durable\n" + "Closure: women heel shoes",
//				ProductType.SHOES));
//		productService.CreateProduct(new ProductEntity("To Ong Shoes",
//				Money.of(100, EURO), "/images/toong.jpg", "Large", "White",
//				"The top shoes in the world",
//				ProductType.SHOES));
//
//		productService.CreateProduct(new ProductEntity("Bruno Manetti Women (AY-109) Brown Suede Leather Boots",
//				Money.of(13, EURO), "/images/612UPZt6EdL._UL1440_.jpg", "Large", "Black",
//				"Closure: Lace-Up\n" + "Inner material- synthetic\n" + "Style-women casual\n"
//						+ "Upper material -synthetic leather\n" + "Long durable\n" + "Closure: women heel shoes",
//				ProductType.SHOES));
//		productService.CreateProduct(new ProductEntity("DEEANNE LONDON Woman's Leather Boots (3532-A85)",
//				Money.of(50, EURO), "/images/71CGN1iecAL._UL1500_.jpg", "Large", "Black",
//				"Closure: Lace-Up\n" + "Inner material- synthetic\n" + "Style-women casual\n"
//						+ "Upper material -synthetic leather\n" + "Long durable\n" + "Closure: women heel shoes",
//				ProductType.SHOES));
//	}
//}
