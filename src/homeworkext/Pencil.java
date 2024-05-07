package homeworkext;

public class Pencil extends Pen {
	public Pencil() {
	}
	public Pencil(double price) {
		super(price);
	}
	public double getPrice() {
		double pprice = super.getPrice();
		return pprice*0.8;
	}
	public void write() {
		System.out.println("Pencil削鉛筆再寫");
	}
}
