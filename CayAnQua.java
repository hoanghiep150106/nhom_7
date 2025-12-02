import java.util.Scanner;

public class CayAnQua extends Cay {
    private   String loaiQua;

public String getLoaiQua() {
        return loaiQua;
    }

    public void setLoaiQua(String loaiQua) {
        this.loaiQua = loaiQua;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai Qua: ");
        loaiQua = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loai Qua: " + loaiQua);
    }

    public void thuHoach() {
        System.out.println("Thu hoach Qua cua Cay " + ten);
    }
}
