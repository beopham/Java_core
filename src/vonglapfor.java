import java.util.Scanner;

public class vonglapfor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào bảng cửu chươg");
        int bcc=sc.nextInt();
        int kq ;
        for (int i=1;i<=10;i++){
            kq=bcc*i;
          System.out.println(bcc + " x " +i+ " = " + kq) ;

        }
    }
}
