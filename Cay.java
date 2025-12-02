import java.util.Scanner;

public class Cay implements IReadWrite {
    private  int id;
    private  String ten;
    private  int tuoi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten Cay: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi Cay: ");
        tuoi = sc.nextInt();
    }

    @Override
    public void xuat() 
    {
        System.out.println("ID: " + id);
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
    }

    public void sinhTruong() {
        System.out.println(ten + " đang sinh truong...");
    }
}
