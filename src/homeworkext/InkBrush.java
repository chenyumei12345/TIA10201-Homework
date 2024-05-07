package homeworkext;

public class InkBrush extends Pen{
	public InkBrush() {
	}
	public InkBrush(double price) {
		super(price);
	}
	public double getPrice() {
		double price = super.getPrice();
		return price*0.9;
	}
	
	public void write() {
		System.out.println("InkBrush沾墨汁再寫");
	}
}
