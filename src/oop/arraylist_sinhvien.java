package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_sinhvien {
    private String ten;
    private int tuoi;
    private String diachi;

    public arraylist_sinhvien()
    {

    }

    public arraylist_sinhvien(String ten, int tuoi,String diachi) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' ;
    }

    public static void main(String[] args) {
        ArrayList <arraylist_sinhvien> sinhvien=new ArrayList<>();
        Scanner nhap=new Scanner(System.in);
        Scanner nhapchuoi=new Scanner(System.in);
        System.out.println("số lượng sinh viên ");
        int soluongsinhvien=nhap.nextInt();
        for (int i=0;i<soluongsinhvien;i++)
        {

            System.out.println("Nhập tên của sinh viên thứ" +i);
            String ten=nhapchuoi.nextLine();
            System.out.println("Nhập tuổi của sinh viên thứ" +i);
            int tuoi=nhap.nextInt();
            System.out.println("Nhập địa chỉ của sinh viên thứ" +i);
            String diachi=nhapchuoi.nextLine();
            sinhvien.add(new arraylist_sinhvien(ten,tuoi,diachi));

        }
        for (arraylist_sinhvien sv:sinhvien)
        {
            System.out.println(sv);
        }
    }
}
