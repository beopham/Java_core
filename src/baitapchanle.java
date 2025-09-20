import java.util.Scanner;

public class baitapchanle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số cần tính tổng");
        int n=sc.nextInt();
        int sum=0;
        if(n%2==0)
        {
            for (int i=1;i<=n;i++)
            {
                sum=sum+i;

            }
            System.out.println(sum);
        }

        else
        {
            System.out.println("t chỉ tính tổng là số chẵn thôi");
        }

    }
}
