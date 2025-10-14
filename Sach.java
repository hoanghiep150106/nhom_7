public class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String toString() {
        return "Mã sách: " + maSach +
                "\nTiêu đề: " + tieuDe +
                "\nTác giả: " + tacGia +
                "\nNăm xuất bản: " + namXuatBan +
                "\nSố lượng: " + soLuong;
    }
}