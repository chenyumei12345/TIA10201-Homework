package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle a = new MyRectangle();
		MyRectangle b = new MyRectangle(10, 20);
		System.out.println(a.getArea());
		System.out.println(b.getArea());
	}
}
