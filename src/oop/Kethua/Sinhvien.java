package oop.Kethua;

public class Sinhvien  extends  Nguoi {

    private String tenlop;
    private String tentruong;
    public Sinhvien()
    {

    }

    public Sinhvien(String tenlop, String tentruong) {
        this.tenlop = tenlop;
        this.tentruong = tentruong;
    }

    public Sinhvien(String ten, int tuoi, String tenlop, String tentruong) {
        super(ten, tuoi);
        this.tenlop = tenlop;
        this.tentruong = tentruong;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getTentruong() {
        return tentruong;
    }

    public void setTentruong(String tentruong) {
        this.tentruong = tentruong;
    }

    @Override
    public void nguuu() {
        super.nguuu();
    }

    @Override
    public void an() {
        System.out.println("mèo ăn");
    }

    @Override
    public void nghi() {
        super.nghi();
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "ten='" + getTen() + '\'' +
                "tuoi='" + getTuoi() + '\'' +
                "tenlop='" + tenlop + '\'' +
                ", tentruong='" + tentruong + '\'' +
                '}';
    }
}
