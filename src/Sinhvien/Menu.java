package Sinhvien;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanliSinhvien qlsv=new QuanliSinhvien();
        Scanner nhapso=new Scanner(System.in);
        Scanner nhapchu=new Scanner(System.in);
        while (true)
        {
            System.out.println("\n===== MENU QUẢN LÍ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm sinh viên theo tên");
            System.out.println("4. Sắp xếp sinh viên theo GPA tăng dần");
            System.out.println("5. Sắp xếp sinh viên theo GPA giảm dần");
            System.out.println("6. Sắp xếp sinh viên theo tuổi tăng dần");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int chon=nhapso.nextInt();
            if(chon ==1)
            {
                System.out.print("Nhập tên: ");
                String ten = nhapchu.nextLine();
                System.out.print("Nhập tuổi: ");
                int tuoi = nhapso.nextInt();
                System.out.print("Nhập GPA: ");
                double gpa = nhapso.nextDouble();
                Sinhvien sv=new Sinhvien(ten,tuoi,gpa);
                qlsv.themsinhvien(sv);
            }
            else if (chon==2)
            {
                qlsv.hienthidanhsachsv();
            }
            else if (chon==3)
            {
                System.out.println("Nhập tên sinh viên cần tìm");
                boolean co=true;
                String tentimkiem=nhapchu.nextLine();
                if(co)
                {
                    qlsv.tìmtheoTen(tentimkiem);
                }

                else
                {
                    co=false;
                    System.out.println("k tìm thấy tên của sinh viên");
                }

            }
            else if (chon==4)
            {
                qlsv.sapxepGpatang();
            }
            else if (chon==5)
            {
                qlsv.sapxepGpagiam();
            }
            else if (chon==6)
            {
              qlsv.sapxeptuoitangdan();
            } else if (chon==7)
            {
                System.out.println("bạn đã thoát");
                break;
            }
        }
    }
}
