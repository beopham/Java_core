import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số a");
        int a=sc.nextInt();
        if (a>=5){
            System.out.println("đúng");
        }
        else {
            System.out.println("sai");
        }
    }
}
