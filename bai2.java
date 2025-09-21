package Java;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Nhap so a: ");
            int a = sc.nextInt();
            System.out.print("Nhap so b: ");
            int b = sc.nextInt();
            System.out.print("Nhap so c: ");
            int c = sc.nextInt();

            
            int min = Math.min(a, Math.min(b, c));

            System.out.println("So nho trong 3 so la : " + min);
        }
    }
}

