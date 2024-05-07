package homeworkext;
public abstract class Pen {
	private String brand;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Pen() {
		super();
	}
	public Pen(double price) {
		super();
		this.price = price;
	}
	public abstract void write();
}
