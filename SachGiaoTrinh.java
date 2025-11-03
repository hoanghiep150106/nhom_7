package nhom_7.tuan5.src;

public class SachGiaoTrinh extends Sach {
    private String linhVuc;
    private String trinhDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
            double giaCoBan, String linhVuc, String trinhDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.linhVuc = linhVuc;
        this.trinhDo = trinhDo;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 0.8; // giảm 20%
    }

    @Override
    protected void setSoLuong(int soLuongMoi) {
        throw new UnsupportedOperationException("Unimplemented method 'setSoLuong'");
    }
}