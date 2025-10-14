public class SachTieuThuyet extends Sach {
    protected String theLoai;
    protected boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);

    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai,
            boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThể loại: " + theLoai +
                "\nThuộc series: " + (laSachSeries ? "Có" : "Không");
    }

}
