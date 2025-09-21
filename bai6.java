package Java;

import java.util.Scanner;

public class bai6 {
    
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }

    
    public static int BCNN(int a, int b) {
        return Math.abs(a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen thu nhat: ");
            int a = sc.nextInt();
            System.out.print("Nhap so nguyen thu hai: ");
            int b = sc.nextInt();

            int ucln = UCLN(a, b);
            int bcnn = BCNN(a, b);

            System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
            System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);
        }
    }
}

