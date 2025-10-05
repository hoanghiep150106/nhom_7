public class Test {
     public static void main(String[] args) {
        
        Sach sach1 = new Sach("S001", "Lap trinh Java", "Huynh Ngoc Huy", 2022, 10);

        
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Lap trinh huong doi tuong");
        sach2.setTacGia("Vo Van Chau");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);

        
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}

