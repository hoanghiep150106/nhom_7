import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    // Thêm sách
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách sách hiện đang trống!");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s);
            }
        }
    }
}
