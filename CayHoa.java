import java.util.Scanner;

public class CayHoa extends Cay {
    private   String mauHoa;

public String getMauHoa() {
        return mauHoa;
    }

    public void setMauHoa(String mauHoa) {
        this.mauHoa = mauHoa;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau Hoa: ");
        mauHoa = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Mau hoa: " + mauHoa);
    }

    public void noHoa() {
        System.out.println("Cay " + ten + " đang no Hoa mau " + mauHoa);
    }
}
