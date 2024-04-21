package hw1;

public class HomeWork1 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int x = 12, y = 6;
		System.out.println(x + "+" + y + "=" + (x + y));
		System.out.println(x + "x" + y + "=" + (x * y));

		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int i = 200 / 12;
		int j = 200 % 12;
		System.out.println("200顆蛋共是：" + i + "打" + j + "顆");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int z = 256559;
		int a, b, c, days, hours, minutes, seconds;
		a = 60; // 一分鐘的秒數
		b = 60 * 60;// 一個小時的秒數
		c = b * 24;// 一天的秒數
		days = z / c;
		hours = (z % c) / b;
		minutes = ((z % c) % b) / a;
		seconds = (((z % c) % b) % a);
		System.out.println(z + "秒為：" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");

		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		System.out.printf("圓面積=%.2f\n", r * r * PI);
		System.out.printf("圓周長=%.2f", 2 * PI * r);
		System.out.println();

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		double money = 1500000 * Math.pow(1 + 0.02, 10);
		System.out.println("10年後的錢：" + money + "元");

		// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:5 + 5; 5 + ‘5’; 5 + “5”並請用註解各別說明答案的產生原因

		System.out.println(5 + 5); // 這兩個數字屬於整數形態 （int）, 透過運算子 "+" 執行運算, 回傳值也是int。
		System.out.println(5 + '5');// '5'是char資料形態, 在 ASCII 表 '5' 等於 53 , 53 + 5 = 58
		System.out.println(5 + "5"); // "5"是字串（String），所以Java在做文字串接

	}
}
