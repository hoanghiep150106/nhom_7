package nhom_7.tuan5.src;

public abstract class Sach implements GiaSach {
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

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    @Override
    public abstract double tinhGiaBan(); // đa hình

    @Override
    public String toString() {
        return "Mã sách: " + maSach + ", Tiêu đề: " + tieuDe + ", Tác giả: " + tacGia +
                ", Năm: " + namXuatBan + ", SL: " + soLuong + ", Giá bán: " + tinhGiaBan();
    }

    protected abstract void setSoLuong(int soLuongMoi);
}