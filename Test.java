package nhom_7.tuan5.src;

public class Test {
    public static void main(String[] args) {
        SachGiaoTrinh gt = new SachGiaoTrinh("GT001", "Giải tích 1", "Nguyễn Văn A", 2022, 50, 100000, "Toán học",
                "Đại học");
        SachTieuThuyet tt = new SachTieuThuyet("TT002", "Doraemon", "Fujiko F. Fujio", 2020, 100, 80000, "Thiếu nhi",
                true);

        System.out.println("=== Thông tin Sách Giáo Trình ===");
        System.out.println(gt.toString());

        System.out.println("\n=== Thông tin Sách Tiểu Thuyết ===");
        System.out.println(tt.toString());
    }
}
