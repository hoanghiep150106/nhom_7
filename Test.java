public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A", 2020, 50000, 150, "Công nghệ thông tin");
        SachTieuThuyet st = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2018, 80000, 50, true);

        ql.themSach(sg);
        ql.themSach(st);

        ql.hienThiDanhSachSach();

        IKiemKe kiemKe = sg;
        System.out.println("Kiểm tra tồn kho >= 100: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}
