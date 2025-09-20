import java.util.Scanner;

public class matkhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

       boolean kiemtramatkhau=password.length() >=10 &&
                password.matches(".*[a-z].*") &&   // có chữ thường
                password.matches(".*[A-Z].*") &&   // có chữ hoa
                password.matches(".*[0-9].*") &&   // có số
                password.matches(".*[@.].*");      // có @ hoặc .
       if (kiemtramatkhau)
       {

           System.out.println("✅ Mật khẩu hợp lệ!");
    } else {
        System.out.println("❌ Mật khẩu phải có ít nhất:");
        System.out.println("- 1 chữ hoa (A-Z)");
        System.out.println("- 1 chữ thường (a-z)");
        System.out.println("- 1 chữ số (0-9)");
        System.out.println("- 1 ký tự đặc biệt (@ hoặc .)");
        System.out.println("- và từ 8 ký tự trở lên.");
    }

    }
}
