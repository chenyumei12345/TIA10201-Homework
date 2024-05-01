package hw3;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入a長度:");
		int a = sc.nextInt();
		System.out.println("請輸入b長度:");
		int b = sc.nextInt();
		System.out.println("請輸入c長度:");
		int c = sc.nextInt();

		if ((a * b * c == 0 || a < 0 || b < 0 || c < 0)) {
			System.out.println("不是三角形");
		} else if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
				|| Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)
				|| Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))) {
			System.out.println("直角三角形");
		} else if ((a == b) && (a == c)) {
			System.out.println("正三角形");
		} else if (a == b || a == c || b == c) {
			System.out.println("等腰三角形");
		} else if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("其他三角形");
		} else {
			System.out.println("不是三角形");
		}
	}
}
