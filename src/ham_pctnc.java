import java.util.Scanner;

public class ham_pctnc {
    public static double cong(double x, double y) {
        return x + y;
    }

    public static double tru(double x, double y) {
        return x - y;
    }
    public static double nhan(double x, double y) {
        return x * y;
    }

    public static double chia(double x, double y) {
        return x / y;
    }
    public static void menu(String pheptinh)
    {
        while (true)
        {
            Scanner nhap=new Scanner(System.in);
            System.out.println("Nhập số thứ nhất");
            double x=nhap.nextDouble();
            System.out.println("Nhập số thứ hai");
            double y=nhap.nextDouble();
            double ketqua=0;
            if (pheptinh.equalsIgnoreCase("+"))
            {

                ketqua =cong(x,y);
                System.out.println("Ket qua =" +ketqua);

            }
            else if (pheptinh.equalsIgnoreCase("-"))
            {

                ketqua =tru(x,y);
                System.out.println("Ket qua =" +ketqua);

            }
            else if (pheptinh.equalsIgnoreCase("*"))
            {

                ketqua =nhan(x,y);
                System.out.println("Ket qua =" +ketqua);

            }
            else if (pheptinh.equalsIgnoreCase("/"))
            {

                ketqua =chia(x,y);
                System.out.println("Ket qua =" +ketqua);

            }
            else {
                System.out.println("b nhập sai phép tính vui lòng chọn lại");
            }
            System.out.println("bạn có muốn tiếp tục chương trình không");
            System.out.println("bấm phím exit đẻ thoát hoặc phím bất kì để tiếp tục ");
            nhap.nextLine();
            String thoat=nhap.nextLine();
            if (thoat.equalsIgnoreCase("exit"))
            {
                System.out.println("bạn đã thoát menu");
                break;
            }

        }


    }
    public static void main(String[] args) {
    Scanner nhapS=new Scanner(System.in);
    System.out.println("nhập vào phép tính");
    String pheptnh=nhapS.nextLine();
    menu(pheptnh);

    }
}
