import java.util.Scanner;

public class hamgioitinh {
    public static void gioitinh(String S)
    {
        if(S.equalsIgnoreCase("Nam"))
        {
            System.out.println("giới tính nam");
        } else if (S.equalsIgnoreCase("Nữ")) {
            System.out.println("giới tính nữ");
        }
        else
        {
            System.out.println("giới tính bê đê");
        }
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập vào giới tính");
        String gt=nhap.nextLine();
        gioitinh(gt);


    }
}
