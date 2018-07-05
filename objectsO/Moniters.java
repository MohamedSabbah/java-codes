package objectsO;

public class Moniters {
	
	// Attributes.....................
	
	String brand;
	double size;
	String color;
	double price;
	
	// Methods .......................
	{
		System.out.println("Welcome To My World");
	}
	public Moniters() {
		this(null, 0.0, null, 0.0);
	}
	public Moniters(String brand) {
		this(brand, 0.0, null, 0.0);
	}
	public Moniters(String brand, double size) {
		this(brand, size, null, 0.0);
	}
	public Moniters(String brand, double size, String color) {
		this(brand, size, color, 0.0);
	}
	
	public Moniters(String brand, double size, String color, double price) {
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.price = price;
		
		
	}
	
	void printData() {
		System.out.printf("%s %.1f %s %.1f\n",brand, size, color, price);
	}
	
	void calNewPrice(double disc) {
		 double newPrice = price - price * disc; 
		 System.out.printf("%.1f\n", newPrice);
		
	}

}
