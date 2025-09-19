import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);

        System.out.println("nhập số a");
        int a=nhap.nextInt();

        System.out.println("nhập số b");
        double b=nhap.nextDouble();

        nhap.nextLine(); // <-- thêm dòng này để ăn ký tự Enter còn sót

        System.out.println("nhập vào tên");
        String ten=nhap.nextLine();
        System.out.println("nhập vào nhà");
        String nha=nhap.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(ten);
        System.out.println(nha);
    }
}
