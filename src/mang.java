import java.util.Arrays;
import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n= sc.nextInt();;
        int [] mang=new int[n];

        for (int i=0;i<mang.length;i++)
        {
            System.out.println("Mang[" + i + "]=");
            mang[i]=sc.nextInt();
        }
        for (int x : mang)
        {
            System.out.print(x + " ");
        }
        System.out.println("sắp xếp mảng tăng dần");
        Arrays.sort(mang);
        for (int x : mang)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        // Phần tử lớn thứ 8 sẽ là phần tử ở vị trí n-8 sau khi sắp xếp tăng dần
        int eighthLargest = mang[n - 8];
        System.out.println("Phần tử lớn thứ 8 là: " + eighthLargest);
    }
}
