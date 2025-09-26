package oop.Kethua;

public class Nguoi {
    private String ten;
    private int tuoi;

    public Nguoi()
    {

    }

    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
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
   public void an()
   {
       System.out.println("ngonn");
   }
    public void nguuu()
    {
        System.out.println("ngủ");
    }
    public void nghi()
    {
        System.out.println("nnghỉ ngơi");
    }
    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
