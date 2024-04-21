package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		// for+while
		int i=1,j=1;
//		for (i = 1; i < 10; i++) {
//			while (j < 10) {
//				System.out.print(i + "x" + j + "=" + i * j);
//				j++;
//			}
//			System.out.println();
//		}
		
		
		//for + do while
//		for (i = 1; i<10; i++) {
//			do {
//				System.out.print(i + "x" + j + "=" + i * j);
//				j++;
//			} while (j<10);
//			System.out.println();
//			}
		
		
		//while + do while
		while (i<10) {
			i++;
		}
		do {
			j++;
			System.out.print(i + "x" + j + "=" + i * j);
		} while (j<10);
			
		}
		
		
	}
