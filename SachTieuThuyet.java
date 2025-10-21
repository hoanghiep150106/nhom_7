package nhom_7.tuan5.src;

public class SachTieuThuyet extends Sach {
    protected String theLoai;
    protected boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
            double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThể loại: " + theLoai +
                "\nThuộc series: " + (laSachSeries ? "Có" : "Không") +
                "\nGiá bán: " + tinhGiaBan();
    }
}
