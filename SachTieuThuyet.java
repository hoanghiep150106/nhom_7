package nhom_7.tuan5.src;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean banDacBiet;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
            double giaCoBan, String theLoai, boolean banDacBiet) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.banDacBiet = banDacBiet;
    }

    @Override
    public double tinhGiaBan() {
        return banDacBiet ? giaCoBan * 1.3 : giaCoBan; // nếu bản đặc biệt tăng 30%
    }

    @Override
    protected void setSoLuong(int soLuongMoi) {
        throw new UnsupportedOperationException("Unimplemented method 'setSoLuong'");
    }
}