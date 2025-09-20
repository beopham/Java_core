import java.util.Scanner;

public class ham_matkhau {
    public static void matkhau(String mk)
    {

        boolean xacthuc=mk.length()>=8 && // độ dài lớn hơn  8
        mk.matches(".*[a-z].*") && // chữ thường
        mk.matches(".*[A-Z].*") && // chữ hoa
        mk.matches(".*[@.].*");// dấu @ và dấu chấm
        if(xacthuc)
        {
            System.out.println("mk đúng");
        }
        else

        {
            System.out.println("mật khẩu sai");
        }
    }

    public static void main(String[] args) {
        Scanner nhapham=new Scanner(System.in);
        System.out.println("nhập vào mật khẩu");
        String mk=nhapham.nextLine();

        matkhau(mk);
    }
}
