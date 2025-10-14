public class Test {
    public static void main(String[] args) {
        SachGiaoTrinh sgk = new SachGiaoTrinh("GT001", "Giải tích 1", "Nguyễn Văn A", 2022, 50, "Toán học", "Đại học");
        SachTieuThuyet tth = new SachTieuThuyet("TT002", "Doraemon", "Fujiko F. Fujio", 2020, 100, "Thiếu nhi", true);

        System.out.println("=== Thông tin sách giáo trình ===");
        System.out.println(sgk);

        System.out.println("\n=== Thông tin sách tiểu thuyết ===");
        System.out.println(tth);
    }
}
