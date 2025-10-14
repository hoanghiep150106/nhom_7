package nhom_7.tuan5.src;

import java.util.ArrayList;

public class quanlysach {
    private ArrayList<Sach> danhSachSach;

    public quanlysach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    public void xoaSach(String maSach) {
        Sach sachCanXoa = null;
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                sachCanXoa = s;
                break;
            }
        }
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }

    public void capNhatSach(String maSach, int soLuongMoi) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Đã cập nhật số lượng cho sách có mã: " + maSach);
                return;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
    }

    public Sach timSachTheoMa(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
        } else {
            for (Sach s : danhSachSach) {
                System.out.println(s.toString());
            }
        }
    }
}
