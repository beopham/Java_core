package oop.titv.book;

public class Sach {
    private String tensach;
    private double giaban;
    private int namxuanban;
    private Tacgia tacgia;

    public Sach()
    {

    }

    public Sach(String tensach, double giaban, int namxuanban, Tacgia tacgia) {
        this.tensach = tensach;
        this.giaban = giaban;
        this.namxuanban = namxuanban;
        this.tacgia = tacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamxuanban() {
        return namxuanban;
    }

    public void setNamxuanban(int namxuanban) {
        this.namxuanban = namxuanban;
    }

    public Tacgia getTacgia() {
        return tacgia;
    }

    public void setTacgia(Tacgia tacgia) {
        this.tacgia = tacgia;
    }
    public void insach()
    {
        System.out.println("Thông tin sách");
        System.out.println("Ten sách " +tensach);
        System.out.println("Gíá Bán "+giaban);
        System.out.println("Năm xuất bản "+namxuanban);
        System.out.println(tacgia);
    }
    public void intensach()
    {
        System.out.println(tensach);
    }
    public boolean namxuatbansach(Sach sachmoi)
    {
        if(namxuanban==sachmoi.namxuanban)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public void giamgiasach(double x)
    {
        double sotiengiam=giaban *(x/100);
        double tiengiam=giaban-sotiengiam;
        System.out.println("số tiền sau khi giảm là" + tiengiam);


    }
    @Override
    public String toString() {
        return "Sach{" +
                "tensach='" + tensach + '\'' +
                ", giaban=" + giaban +
                ", namxuanban=" + namxuanban +
                ", tacgia=" + tacgia +
                '}';
    }
}
