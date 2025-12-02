import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCay implements IReadWrite {
    private List<Cay> danhSachCay = new ArrayList<>();

    public QuanLyCay() {
        taoCayAnQua(1, "Xoài", 5, "Xoài");
        taoCayAnQua(2, "Táo", 4, "Táo");
        taoCayAnQua(3, "Lê", 3, "Lê");
        taoCayAnQua(4, "Chuối", 2, "Chuối");
        taoCayAnQua(5, "Cam", 6, "Cam");
        taoCayAnQua(6, "Quýt", 4, "Quýt");
        taoCayAnQua(7, "Mận", 3, "Mận");
        taoCayAnQua(8, "Đào", 5, "Đào");
        taoCayAnQua(9, "Dừa", 7, "Dừa");
        taoCayAnQua(10, "Bưởi", 6, "Bưởi");

        taoCayHoa(11, "Hoa Hồng", 1, "Đỏ");
        taoCayHoa(12, "Hoa Cúc", 2, "Vàng");
        taoCayHoa(13, "Hoa Sen", 1, "Trắng");
        taoCayHoa(14, "Hoa Lan", 3, "Tím");
        taoCayHoa(15, "Hoa Mai", 2, "Vàng");
        taoCayHoa(16, "Hoa Ly", 1, "Trắng");
        taoCayHoa(17, "Hoa Đồng Tiền", 1, "Đỏ");
        taoCayHoa(18, "Hoa Dạ Yến Thảo", 1, "Hồng");
        taoCayHoa(19, "Hoa Cẩm Tú Cầu", 2, "Xanh");
        taoCayHoa(20, "Hoa Anh Đào", 3, "Hồng");
    }

    private void taoCayAnQua(int id, String ten, int tuoi, String loaiQua) {
        CayAnQua c = new CayAnQua();
        c.setId(id);
        c.setTen(ten);
        c.setTuoi(tuoi);
        c.setLoaiQua(loaiQua);
        danhSachCay.add(c);
    }

    private void taoCayHoa(int id, String ten, int tuoi, String mauHoa) {
        CayHoa c = new CayHoa();
        c.setId(id);
        c.setTen(ten);
        c.setTuoi(tuoi);
        c.setMauHoa(mauHoa);
        danhSachCay.add(c);
    }

    public void themCay(Cay c) {
        danhSachCay.add(c);
    }
public void xoaCay(int id) {
    boolean found = false;
    for (int i = 0; i < danhSachCay.size(); i++) {
        if (danhSachCay.get(i).getId() == id) {
            danhSachCay.remove(i);
            System.out.println("Id " + id + " da duoc xóa khoi danh sách");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Không tìm thấy Id " + id + " trong danh sách");
    }
}
    public Cay timCay(int id) {
        for (Cay c : danhSachCay) {
            if (c.getId() == id)
                return c;
        }
        return null;
    }

    public void hienThi() {
        for (Cay c : danhSachCay) {
            c.xuat();
            System.out.println("---------------------");
        }
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Thêm cây ăn quả");
        System.out.println("2. Thêm cây hoa");
        System.out.print("Chọn loại cây: ");
        int chon = sc.nextInt();
        sc.nextLine();

        Cay c;
        if (chon == 1)
            c = new CayAnQua();
        else
            c = new CayHoa();

        c.nhap();
        danhSachCay.add(c);
    }

    @Override
    public void xuat() {
        hienThi();
    }
}
