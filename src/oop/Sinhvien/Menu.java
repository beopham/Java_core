package oop.Sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<sinhvien> Sinhvien=new ArrayList<>();
        Scanner nhapso=new Scanner(System.in);
        Scanner nhapchu=new Scanner(System.in);
        System.out.println("Nhập vào số lượng sinh vien");
        int soluongsinhvien= nhapso.nextInt();
        for (int i=1;i<=soluongsinhvien;i++)
        {
            System.out.println("Sinh viên thứ "+i);
            System.out.println("Nập vào tên sinh viên thứ " +i);
            String ten=nhapchu.nextLine();
            System.out.println("Nập vào tuổi sinh viên thứ " +i);
            int tuoi=nhapso.nextInt();
            System.out.println("Nập vào địa chỉ sinh viên thứ " +i);
            String diachi=nhapchu.nextLine();
            System.out.println("Nập điểm toán sinh viên thứ " +i);
            double diemtoan=nhapso.nextDouble();
            System.out.println("Nập điểm lí sinh viên thứ " +i);
            double diemli=nhapso.nextDouble();
            System.out.println("Nập điểm hóa sinh viên thứ " +i);
            double diemhoa=nhapso.nextDouble();
            Sinhvien.add(new sinhvien(ten,tuoi,diachi,diemtoan,diemli,diemhoa));
        }
        for (sinhvien sv : Sinhvien)
        {
            System.out.println(sv.toString());
        }
        System.out.println("điểm tb");
        for (sinhvien sv : Sinhvien)
        {
            System.out.println(sv.diemtb());
        }
        System.out.println("có tốt hay không");
        for (sinhvien sv : Sinhvien)
        {
            sv.kiemtradiem();
        }



    }
}
