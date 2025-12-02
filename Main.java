import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyCay ql = new QuanLyCay();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ CÂY =====");
            System.out.println("1. Thêm cây");
            System.out.println("2. Xóa cây theo ID");
            System.out.println("3. Tìm cây theo ID");
            System.out.println("4. Hiển thị tất cả cây");
            System.out.println("5. Nhập nhiều cây");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    ql.nhap();
                    break;

                case 2:
                    System.out.print("Nhập ID cần xóa: ");
                    int idXoa = sc.nextInt();
                    ql.xoaCay(idXoa);
                    break;

                case 3:
                    System.out.print("Nhập ID cần tìm: ");
                    int idTim = sc.nextInt();
                    Cay c = ql.timCay(idTim);
                    if (c != null) {
                        System.out.println("== THÔNG TIN CÂY ==");
                        c.xuat();
                    } else {
                        System.out.println("Không tìm thấy cây!");
                    }
                    break;

                case 4:
                    System.out.println("== DANH SÁCH CÂY ==");
                    ql.hienThi();
                    break;

                case 5:
                    System.out.print("Nhập số lượng cây cần thêm: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println(">> Nhap Cay thu " + (i + 1));
                        ql.nhap();
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }
}
