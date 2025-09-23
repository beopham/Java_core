package oop;

import java.util.Scanner;

public class hinhchunhat {
     public double chieudai;
     public double chieurong;

     public void nhap()
     {
         Scanner nhap=new Scanner(System.in);
         System.out.println("nhập vào chiều dài");
         chieudai=nhap.nextDouble();
         System.out.println("nhập vào chiều rộng");
         chieurong=nhap.nextDouble();
     }
     public void hth()
     {
         System.out.println("chiều dài là" + chieudai);
         System.out.println("chiều rộng là" + chieurong);
     }
     public double dientich()
     {
         return chieurong*chieudai;
     }
    public double chuvi()
    {
        return (chieurong+chieudai)*2;
    }

    public static void main(String[] args) {
        hinhchunhat hnc1 = new hinhchunhat();
        hnc1.nhap();
        hnc1.hth();
        System.out.println(hnc1.dientich());

        System.out.println(hnc1.chuvi());

    }
}
