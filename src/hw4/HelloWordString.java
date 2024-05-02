package hw4;

public class HelloWordString {
	public static void main(String[] args) {
		// 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
		String s1 = s("Hello World");
		System.out.println(s1);
	}

	public static String s(String s) {
		String result = " ";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		}
		return result;
	}
}
