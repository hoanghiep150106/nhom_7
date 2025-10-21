public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          double giaCoBan, int soLuong, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan, soLuong);
        this.laSachSeries = laSachSeries;
    }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", Là series: " + laSachSeries +
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
