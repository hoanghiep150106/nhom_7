public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Cấu trúc dữ liệu", "Nguyễn Văn A", 2021, 10, "Tin học", "Đại học");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Giải tích 1", "Trần Thị B", 2020, 8, "Toán học", "Đại học");

        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2007, 15, "Phiêu lưu", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Không gia đình", "Hector Malot", 2000, 5, "Tình cảm", false);

        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("=== DANH SÁCH BAN ĐẦU ===");
        ql.hienThiTatCa();

        ql.capNhatSoLuong("TT01", 20);
        System.out.println("\n=== SAU KHI CẬP NHẬT SỐ LƯỢNG TT01 ===");
        ql.hienThiTatCa();

        ql.xoaSach("GT02");
        System.out.println("\n=== SAU KHI XÓA SÁCH GT02 ===");
        ql.hienThiTatCa();

        System.out.println("\n=== KẾT QUẢ TÌM KIẾM THEO MÃ TT02 ===");
        Sach ketQua = ql.timKiemTheoMa("TT02");
        if (ketQua != null) {
            System.out.println(ketQua);
        } else {
            System.out.println("Không tìm thấy sách!");
        }
    }
}
