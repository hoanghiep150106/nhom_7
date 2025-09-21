package Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap phtu mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Nhap ptu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        
        int maxElement = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat: " + maxElement);
        System.out.println("So lan ptu xuat hien : " + maxCount);

        sc.close();
    }
}
