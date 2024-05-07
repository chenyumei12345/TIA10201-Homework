package hw5;
import java.util.Scanner;
public class StarSquare1_2Test extends StarSquare1_1 {
    public StarSquare1_2Test(int width, int height) {
        super(width, height);
    }
    
    public void starSquare() {
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getWidth(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args) {
        System.out.println("請輸入寬與高：");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        StarSquare1_2Test a = new StarSquare1_2Test(width, height);
        a.starSquare();
    }
}