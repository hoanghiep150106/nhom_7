public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         double giaCoBan, int soLuong, String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan, soLuong);
        this.monHoc = monHoc;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
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
        return super.toString() + ", Môn học: " + monHoc +
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
