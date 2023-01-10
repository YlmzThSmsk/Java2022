
public class Product {

	public Product(int id, String name, String description, double price,int stockAmount) {
		System.out.println("Yapici blok çalisti");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		
	}
	
	public Product() {
		
	}

	// attributes / fields

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

	// Getter
	public int getId() {
		return id;
	}

	// Setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return description;
	}

	public void setDecription(String decription) {
		this.description = decription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
