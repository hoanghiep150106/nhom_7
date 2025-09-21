import java.util.Scanner;

public class bai3tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double so2 = scanner.nextDouble();

        // Menu lựa chọn phép tính
        System.out.println("\nChọn phép tính:");
        System.out.println("1. Cộng (+)");
        System.out.println("2. Trừ (-)");
        System.out.println("3. Nhân (*)");
        System.out.println("4. Chia (/)");
        System.out.print("Nhập lựa chọn (1-4): ");

        int choice = scanner.nextInt();
        double ketQua;

        switch (choice) {
            case 1:
                ketQua = so1 + so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case 2:
                ketQua = so1 - so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case 3:
                ketQua = so1 * so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case 4:
                if (so2 != 0) {
                    ketQua = so1 / so2;
                    System.out.println("Kết quả: " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();
    }
}