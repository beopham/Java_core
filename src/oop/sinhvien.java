package oop;

import java.util.Scanner;

public class sinhvien {
    String ten;
    int tuoi;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tên ");
        ten= sc.nextLine();
        System.out.println("nhập tuổi ");
        tuoi= sc.nextInt();


    }
    public void hith()
    {
        System.out.println(ten);
        System.out.println(tuoi);
    }

    public static void main(String[] args) {
        sinhvien sv1=new sinhvien();
        sv1.nhap();
        sv1.hith();
    }
}
