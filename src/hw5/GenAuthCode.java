package hw5;
import java.util.Random;
public class GenAuthCode {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
	char array[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k',
			'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
			'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	Random random = new Random();
	char[] charArray = new char[8];

	public void genAuthCode() {
		for (int i = 0; i < 8; i++) {
			int a = random.nextInt(array.length);
			charArray[i] = array[a];
		}
		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(charArray);
	}

	public static void main(String[] args) {
		GenAuthCode Authcode = new GenAuthCode();
		Authcode.genAuthCode();
	}
}
