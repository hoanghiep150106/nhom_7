import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {

    // Sử dụng ArrayList để lưu trữ danh sách các cuốn sách
    private List<Sach> danhSachSach;

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public Sach timKiemtheomasach(String maSach) {
        for (Sach s : this.danhSachSach) {
            // .equalsIgnoreCase() sẽ so sánh không phân biệt chữ hoa hay chữ thường (ví dụ: "S01" sẽ khớp với "s01").
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int size() {
        // Don gian la tra ve kich thuoc (so luong) cua danh sach noi bo
        return this.danhSachSach.size();
    }

    @Override
    public boolean themSach(Sach... cacQuyenSach) {
        for (Sach s : cacQuyenSach) {
            if (timKiemtheomasach(s.getMaSach()) != null) {
                // Ngay khi phát hiện 1 cuốn bị trùng, báo lỗi và dừng lại.
                System.out.println("Loi: Ma sach '" + s.getMaSach() + "' da ton tai. Huy bo toan bo thao tac them.");
                return false;
            }
        }
        // Nếu vòng lặp kiểm tra ở trên chạy xong thì mới bắt đầu thêm tất cả vào danh sách.
        for (Sach s : cacQuyenSach) {
            this.danhSachSach.add(s);
        }
        return true;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach sachCanXoa = timKiemtheomasach(maSach);
        if (sachCanXoa != null) {
            this.danhSachSach.remove(sachCanXoa);
            return true;
        }
        return false;
    }

    @Override
    public List<Sach> timKiemSach(String tenSach) {
        List<Sach> ketQuaTimKiem = new ArrayList<>();
        for (Sach s : this.danhSachSach) {
            // kiểm tra xem tên sách (getTieuDe()) có chứa chuỗi tìm kiếm hay kh
            // dùng .toLowerCase() để tìm kiếm không pb chữ hoa/thường
            //  dùng .contains() để tìm khớp một phần (ví dụ: tìm "Java" sẽ ra "Lập trình Java")
            if (s.getTieuDe().toLowerCase().contains(tenSach.toLowerCase())) {
                ketQuaTimKiem.add(s);
            }
        }
        //nếu kh tìm thấy cuốn nào
        return ketQuaTimKiem;
    }

    @Override
    public void hienThiDanhSach() {
        if (this.danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach nao.");
            return; 
            // quan trong, no se dung lai khi danhsach RONG
        }
        System.out.println("--- DANH SACH SACH TRONG THU VIEN ---");
        System.out.println("Thu vien hien co " + this.danhSachSach.size() + " sach.");
        System.out.println();
        int stt = 1;
        for (Sach s : this.danhSachSach) {
            // Tự động gọi phương thức toString() tương ứng của mỗi đối tượng
            System.out.println(stt + ". " + s);
            stt++;
        }
    }
}