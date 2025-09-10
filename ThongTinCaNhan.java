import java.util.Scanner;

public class ThongTinCaNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin cá nhân
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhập giới tính (M/F): ");
        char gioiTinh = sc.next().charAt(0);

        System.out.print("Bạn có thích lập trình không? (true/false): ");
        boolean thichLapTrinh = sc.nextBoolean();

        // In ra màn hình các giá trị đã nhập
        System.out.println("\n===== THÔNG TIN CÁ NHÂN =====");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Có thích lập trình không? " + thichLapTrinh);

        sc.close();
    }
}
