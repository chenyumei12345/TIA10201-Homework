package hw3;
import java.util.Scanner;
public class GuessNumber {
public static void main(String[]args) {
	//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
			Scanner sc = new Scanner(System.in);
			System.out.println("開始猜數字吧！");
			int i = (int) (Math.random() * 9) + 1;
			while (true) {
				int x = sc.nextInt();
				if (x == i) {
					System.out.println("答對了，答案就是" + i);
				} else {
					System.out.println("猜錯了！");
				}
			}
}
}
