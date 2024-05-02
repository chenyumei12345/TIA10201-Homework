package hw4;

public class EightPlanetsString {
	public static void main(String[] args) {
//有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String x[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int m = 0; m < x.length; m++) {
			for (int j = 0; j < x[m].length(); j++) {
				char s = x[m].charAt(j);
				if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
					count++;
				}

			}
		}
		System.out.println("陣列裡面共有" + count + "個母音~");
	}
}
