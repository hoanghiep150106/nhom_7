package nhom_7.tuan5.src;

import java.util.ArrayList;

public class quanlysach {
    private ArrayList<Sach> danhSachSach;

    public quanlysach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
            System.out.println("------------------------------");
        }
    }

    public Sach timTheoMa(String ma) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }

    public boolean xoaSach(String ma) {
        Sach sach = timTheoMa(ma);
        if (sach != null) {
            danhSachSach.remove(sach);
            return true;
        }
        return false;
    }

    public boolean capNhatSoLuong(String ma, int soLuongMoi) {
        Sach sach = timTheoMa(ma);
        if (sach != null) {
            sach.setSoLuong(soLuongMoi);
            return true;
        }
        return false;
    }

    public void hienThiSachGiaCaoNhat() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        Sach max = danhSachSach.get(0);
        for (Sach s : danhSachSach) {
            if (s.tinhGiaBan() > max.tinhGiaBan()) {
                max = s;
            }
        }

        System.out.println("===== SÁCH CÓ GIÁ BÁN CAO NHẤT =====");
        System.out.println(max.toString());
    }
}
