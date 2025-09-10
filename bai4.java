import java.util.Scanner;

public class bai4 {

    float P;
    float r;
    int t;
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("nhap so tien :");
        float P = sc.nextFloat();
        System.out.print("nhap lai suat :");
        float r = sc.nextFloat();
        System.out.print("nhap so nam :");
        int t = sc.nextInt();
        System.out.println("so tien lai la : " + (P*r*t));
        System.out.println("Tien goc cuoi ky la :" + (P+(P*r*t)));
    } 
    }
}

