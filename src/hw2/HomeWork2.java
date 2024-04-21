package hw2;

public class HomeWork2 {
	public static void main(String[] args) {
////	計算1~1000的偶數和 (2+4+6+8+...+1000)
//		int sum = 0;
//		int i;
//		for (i = 2; i <= 1000; i++) {
//			if (i % 2 == 0)
//				sum += i;
//		}
//		System.out.println("1~1000 的偶數和是：" + sum);
//
//// 計算1~10的連乘積 (1*2*3*...*10)(用for迴圈)			
//		int result1 = 1;
//		for (int x = 1; x <= 10; x++)
//			result1 *= x;
//		System.out.println("1~10的連乘積是：" + result1);
//
////計算1~10的連乘積 (1*2*3*...*10)(用for迴圈)
//		int y = 1;
//		int result2 = 1;
//		while (y <= 10) {
//			result2 *= y;
//			y++;
//		}
//		System.out.println("1~10的連乘積是：" + result2);
//
//// 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100		
//		for (int a = 1; a <= 10; a++) {
//			System.out.print((int) Math.pow(a, 2) + " ");
//		}

// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?		

		
// 第 6 題
		for (int e = 10; e >= 1; e--) {
			for (int f = 1; f <= e; f++) {
				System.out.print(f + " ");
			}
			System.out.println();
		}
	}
}