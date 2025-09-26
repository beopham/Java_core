package oop.Menu_sv;

public class Sinhvien {
    private String ten;
    private int tuoi;
    private double gpa;

    public  Sinhvien()
    {

    }
    public Sinhvien(String ten, int tuoi, double gpa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gpa = gpa;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gpa=" + gpa +
                '}';
    }
}
