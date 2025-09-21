import java.util.Scanner;

public class bai5tuan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên :");
        int x = sc.nextInt();
        if(an(x)){

        System.out.println(x + "là số nguyên tố");}
        else{
        System.out.println(x + "không phải là số nguyên tố ");}
        sc.close();
    }
    public static boolean an(int x) {
        if(x<2){
            return false;
        }
        for (int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}