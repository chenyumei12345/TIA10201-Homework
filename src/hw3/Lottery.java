package hw3;
import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
		Scanner sc = new Scanner(System.in);
		int[] array = new int[49];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int count = 0;
		System.out.println("阿文，請輸入你討厭哪個數字？");
		int y = sc.nextInt();
		while (y < 0 || y > 9) {
			System.out.println("請輸入0-9的數字：");
			y = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (y != i % 10 && y != i / 10) {
				System.out.print(i + " ");
				count++;
				if (count % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.print("共有" + count + "數字可以選擇");
	}

}
