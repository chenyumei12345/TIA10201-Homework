package hw5;

import java.math.*;

public class RanDom1_1 {
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	int array[] = new int[10];
	int sum = 0;
	int avg = 0;

	public int ranAvg() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
			System.out.print(array[i] + "  ");
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println("\n" + avg);
		return avg;
	}

	public static void main(String[] args) {
		RanDom1_1 r = new RanDom1_1();
		r.ranAvg();
	}
}
