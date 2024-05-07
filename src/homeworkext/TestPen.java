package homeworkext;
public class TestPen {
public static void main(String[] args) {
	Pen p[] = new Pen[2];
	p[0]= new Pencil(100);
	p[1]= new InkBrush(150);
	for(int i=0;i<p.length;i++) {
		p[i].write();
		System.out.println("價格：" + p[i].getPrice()+"元");
	}
}
}
