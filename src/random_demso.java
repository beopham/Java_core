import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class random_demso {
    public static void main(String[] args) {
        ArrayList <Integer> dayso=new ArrayList<>();
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số phần tử cần raondom");
        int spt= sc.nextInt();
        for (int i=0;i<spt;i++)
        {
            int phanturandom= rd.nextInt(1,100);
            dayso.add(phanturandom);

        }
        for (int x :dayso)
        {
            System.out.print(x + " ");
        }
        int dem=0;
        for (int x :dayso)
        {
            if(x>10)
            {
                dem ++;
            }
        }
        System.out.println(" ");
        System.out.println("có " + dem +" lớn hơn 10");
    }
}
