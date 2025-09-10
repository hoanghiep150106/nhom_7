import java.util.Scanner;

public class bai3 {
    int a;
    int b;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap a :"); 
    int  a = sc.nextInt();
    System.out.print("nhap b :");
    int b = sc.nextInt();

    System.out.println("Tổng là :" + (a+b) );
    System.out.println("Hiệu là :" + (a-b));
    System.out.println("Tích là :" + (a*b));
    System.out.println("Thương là :" + (a/b));
    System.out.println("Phần dư là :" + (a%b));
    }
}