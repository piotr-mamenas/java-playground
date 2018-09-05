package company.simpleshop.domain;

public class Product {
	public int id;
	public String name;
	
	protected Product(String name) {
		this.name = name;
	}
	
	public static Product Build(String productName) {
		return new Product(productName);
	}
}
