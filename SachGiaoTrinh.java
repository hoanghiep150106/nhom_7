package nhom_7.tuan5.src;

public class SachGiaoTrinh extends Sach {
    protected String monHoc;
    protected String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
            double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (2025 - namXuatBan) * 5000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMôn học: " + monHoc +
                "\nCấp độ: " + capDo +
                "\nGiá bán: " + tinhGiaBan();
    }
}