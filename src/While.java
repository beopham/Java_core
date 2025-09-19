import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        while (true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập vào bảng cử chương");
            int bcc=sc.nextInt();


            if(bcc >=2 && bcc<=9)

            {
                int i=1;
                while (i<=10)
                {

                    int kq;
                    kq=bcc*i;
                    System.out.println(bcc +" x " + i+ " = " +kq);
                    i++;
                }
            }
            else
            {
                System.out.println("nhập sai bảng cử chương");
            }
            System.out.println("nhập vào phím x để dừng lại hoặc phím bâất kì để thoát vòng lặp");
            char x=sc.next().charAt(0);

            if (x=='X' || x=='x')
            {
                System.out.println("bạn đã thoát vòng lặp");
                break;
            }
        }


    }
}
// đoạn code mới nè