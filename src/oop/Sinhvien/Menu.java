package oop.Sinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<sinhvien> Sinhvien=new ArrayList<>();
        Scanner nhapso=new Scanner(System.in);
        Scanner nhapchu=new Scanner(System.in);
        while (true)
        {
            System.out.println("\n========= MENU QUẢN LÝ SINH VIÊN =========");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Kiểm tra học lực");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int luachon= nhapso.nextInt();
            if(luachon==1) {
                System.out.println("Nhập vào số lượng sinh vien");
                int soluongsinhvien = nhapso.nextInt();
                for (int i = 1; i <= soluongsinhvien; i++) {
                    System.out.println("Sinh viên thứ " + i);
                    System.out.println("Nập vào tên sinh viên thứ " + i);
                    String ten = nhapchu.nextLine();
                    System.out.println("Nập vào tuổi sinh viên thứ " + i);
                    int tuoi = nhapso.nextInt();
                    System.out.println("Nập vào địa chỉ sinh viên thứ " + i);
                    String diachi = nhapchu.nextLine();
                    System.out.println("Nập điểm toán sinh viên thứ " + i);
                    double diemtoan = nhapso.nextDouble();
                    System.out.println("Nập điểm lí sinh viên thứ " + i);
                    double diemli = nhapso.nextDouble();
                    System.out.println("Nập điểm hóa sinh viên thứ " + i);
                    double diemhoa = nhapso.nextDouble();
                    Sinhvien.add(new sinhvien(ten, tuoi, diachi, diemtoan, diemli, diemhoa));
                }
            }
                else if(luachon==2)
                {
                    for (sinhvien sv:Sinhvien)
                    {
                        System.out.println(sv.toString());
                    }
                }
                else if(luachon==3)
                {
                    for (sinhvien sv:Sinhvien)
                    {
                        System.out.println(sv.diemtb());
                    }
                }
                else if(luachon==4)
                {
                    for (sinhvien sv:Sinhvien)
                    {
                        sv.kiemtradiem();
                    }
                } else if (luachon==5) {
                    System.out.println("Thoát chương trình.");
                    nhapso.close();
                    break;
                }
             }

        }


    }

