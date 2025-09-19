import java.util.Scanner;

public class giamdan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số a");
        int a=sc.nextInt();
        System.out.println("nhập số b");
        int b=sc.nextInt();
        System.out.println("nhập số c");
        int c=sc.nextInt();
        if(a >b && b >c){
            System.out.println("a = " +a);
            System.out.println("b = " +b);
            System.out.println("c = " +c);
            System.out.println("tăng dần");
        }
       else if(a <b && b <c){
            System.out.println("a = " +a);
            System.out.println("b = " +b);
            System.out.println("c = " +c);
            System.out.println("giảm dần");
        }
        else {
            System.out.println("k giảm k tăng");
        }
    }
}
