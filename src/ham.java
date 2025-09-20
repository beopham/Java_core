import java.util.Scanner;

public class ham {

    public static int tongbaso(int x,int y,int z)
    {
        int kq=x+y+z;
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số 1");
        int x=sc.nextInt();
        System.out.println("Nhập số 2");
        int y=sc.nextInt();
        System.out.println("Nhập số 3");
        int z=sc.nextInt();
        int ketqua=tongbaso(x,y,z);
        System.out.println("Sum = "+ ketqua);
    }
}
