import java.util.Scanner;

public class forlongnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hàng: ");
        int hang = sc.nextInt();
        System.out.println("Nhập vào cột: ");
        int cot = sc.nextInt();

        for (int i = 1; i <= hang; i++) {
            for (int j = 1; j <= cot; j++) {
                if(i==4 || j==4)
                {
                    System.out.print("*\t"); // in trên cùng một hàng
                }

            }
            System.out.println(); // xuống dòng sau khi in hết 1 hàng
        }
    }
}
