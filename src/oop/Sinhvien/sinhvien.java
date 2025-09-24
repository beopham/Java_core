package oop.Sinhvien;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class sinhvien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double diemtoan,diemli,diemhoa;
    public sinhvien()
    {

    }

    public sinhvien(String ten, int tuoi, String diachi, double diemtoan, double diemli, double diemhoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.diemtoan = diemtoan;
        this.diemli = diemli;
        this.diemhoa = diemhoa;
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

    public double getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }

    public double getDiemli() {
        return diemli;
    }

    public void setDiemli(double diemli) {
        this.diemli = diemli;
    }

    public double getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(double diemhoa) {
        this.diemhoa = diemhoa;
    }
    public double diemtb()
    {
        double diemtb=0;
        diemtb=(diemtoan+diemli+diemhoa)/3;
        return diemtb;

    }
    public void kiemtradiem()
    {
        if (diemtb()>=5)
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("Bad");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        sinhvien sinhvien = (sinhvien) o;
        return getTuoi() == sinhvien.getTuoi() && Double.compare(getDiemtoan(), sinhvien.getDiemtoan()) == 0 && Double.compare(getDiemli(), sinhvien.getDiemli()) == 0 && Double.compare(getDiemhoa(), sinhvien.getDiemhoa()) == 0 && Objects.equals(getTen(), sinhvien.getTen()) && Objects.equals(getDiachi(), sinhvien.getDiachi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTen(), getTuoi(), getDiachi(), getDiemtoan(), getDiemli(), getDiemhoa());
    }

    @Override
    public String toString() {
        return "sinhvien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                ", diemtoan=" + diemtoan +
                ", diemli=" + diemli +
                ", diemhoa=" + diemhoa +
                '}';
    }


}
