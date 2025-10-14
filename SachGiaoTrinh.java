public class SachGiaoTrinh extends Sach {
    protected String monHoc;
    protected String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc,
            String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Môn học" + monHoc + "\n Cấp độ" + capDo;
    }

}