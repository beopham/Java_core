package oop.Menu_sv;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner nhapso=new Scanner(System.in);
        Scanner nhapchu=new Scanner(System.in);
        Danhsachsv Student =new Danhsachsv();

        while (true)
        {
            System.out.println("MENU ------------ ");
            System.out.println("Vui lòng chọn chức năng:");
            System.out.println(
                            "1. Thêm sinh viên vào danh sách.\n" +
                            "2. In danh sách sinh viên ra màn hình.\n" +
                            "3. Kiểm tra danh sách có rỗng hay không.\n" +
                            "4. Lấy ra số lượng sinh viên trong danh sách.\n" +
                            "5. Làm rỗng danh sách sinh viên.\n" +
                            "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n" +
                            "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n" +
                            "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n" +
                            "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n" +
                            "0. Thoát khỏi chương trình"
            );
            System.out.println("Mời bạn chọn chức năng");
            int luachon =nhapso.nextInt();
            if(luachon==1)
            {
                System.out.println("Nhập tên sinh viên");
                String ten=nhapchu.nextLine();
                System.out.println("Nhập tuổi sinh viên");
                int tuoi =nhapso.nextInt();
                System.out.println("Nhập gpa sinh viên");
                double gpa=nhapso.nextDouble();
                Sinhvien sv=new Sinhvien(ten,tuoi,gpa);
                Student.nhap(sv);

            }
            else if (luachon==2)
            {
               Student.xuat_sv();
            }
            else if (luachon==3)
            {
                Student.ktrrong();
            }
            else if (luachon==4)
            {
                Student.layraslsv();
            }
        }
    }
}
