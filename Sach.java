package nhom_7.tuan5.src;

public abstract class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setSoLuong(int soLuongMoi) {
        this.soLuong = soLuongMoi;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
                "\nTiêu đề: " + tieuDe +
                "\nTác giả: " + tacGia +
                "\nNăm xuất bản: " + namXuatBan +
                "\nSố lượng: " + soLuong +
                "\nGiá cơ bản: " + giaCoBan;
    }
}