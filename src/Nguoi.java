import java.util.Objects;

public class Nguoi {
    private String ten;
    private int tuoi;
    private  String diachi;

    public Nguoi()
    {

    }

    public Nguoi(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Nguoi nguoi1=new Nguoi("Nam",23,"ĐN");
        Nguoi nguoi2=new Nguoi("Linh",22,"SG");
        Nguoi nguoi3=new Nguoi("Huy",23,"HN");
        Nguoi nguoi4=new Nguoi("Bảo",24,"HP");
        Nguoi nguoi5=new Nguoi("My",20,"HUẾ");
        Nguoi nguoi6=new Nguoi("Lan",21,"CT");

        System.out.println(nguoi1.toString());
        System.out.println(nguoi2.getTen());

        nguoi5.setTen("Trang");
        System.out.println(nguoi5.toString());
    }
}
