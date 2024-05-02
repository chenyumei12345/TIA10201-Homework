package hw4;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		int array[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入年：");
		int year = sc.nextInt();
		System.out.print("請輸入月：");
		int month = sc.nextInt();
		System.out.print("請輸入日：");
		int day = sc.nextInt();
		boolean leapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		while (month < 0 || month > 13 || day < 0 || day > 32 || year < 0
				|| month == 2 && ((leapyear && day > 29) || (!leapyear && day > 28))) {
			System.out.println("日期有錯誤，請重新輸入");
			System.out.print("請輸入年：");
			year = sc.nextInt();
			System.out.print("請輸入月：");
			month = sc.nextInt();
			System.out.print("請輸入日：");
			day = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += array[1][i];
		}
		sum += day;
		System.out.println("輸入的日期為該年第" + sum + "天");
	}

}
