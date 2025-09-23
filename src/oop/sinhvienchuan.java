package oop;

import java.util.Scanner;

public class sinhvienchuan {
    private String ten;
    private String diachi;

    public  sinhvienchuan()
    {

    }
    public sinhvienchuan(String ten,String diachi)
    {
        this.ten=ten;
        this.diachi=diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhap()
    {
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhâp vào tên");
        ten= nhap.nextLine();
        System.out.println("nhâp vào địa chỉ");
        diachi= nhap.nextLine();
    }
    public void xh()
    {
        System.out.println(ten);
        System.out.println(diachi);
    }
    public static void main(String[] args) {
        sinhvienchuan sv=new sinhvienchuan();
        sv.nhap();
        sv.xh();
        sinhvienchuan sv1=new sinhvienchuan("nam","ji");
        sv1.xh();
    }

}
