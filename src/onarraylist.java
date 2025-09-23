import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class onarraylist {
    public static void main(String[] args) {
        ArrayList <Integer> daysonguyen=new ArrayList<>();
        // thêm phần tử vào mảng;
        // nhap  số phần tử
        Scanner nhap=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("nhập vào số phân tử");
        int sophantu= nhap.nextInt();
        for (int i=0;i<sophantu;i++)
        {
            // nhập vào phân tử thứ n

            int phantu= rd.nextInt(-100,100);
            daysonguyen.add(phantu);
        }
        // in ra phân tử
        for (int x : daysonguyen)
        {
            System.out.print(x + " ");
        }
        Collections.sort(daysonguyen);
        System.out.println(" ");
        // sắp xép tăng đần
        System.out.println("sắp xếp tăng dần");
        // in ra phân tử
        for (int x : daysonguyen)
        {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        int phantunhocantim;
        System.out.println("Tìm phân tử nhỏ thứ ");
        phantunhocantim= nhap.nextInt();

        if(daysonguyen.size()>=phantunhocantim)
        {
            int phantunhoN=daysonguyen.get(phantunhocantim-1);
            System.out.println("Phần tử nhỏ thứ" +phantunhocantim+"là " +phantunhoN);
        }
        else {
            System.out.println("k tìm thấy phần tử nhỏ đó");
        }
        Collections.reverse(daysonguyen);
        // sắp xép tăng đần
        System.out.println("sắp xếp giảm dần");
        // in ra phân tử

        for (int x : daysonguyen)
        {
            System.out.print(x + " ");
        }
        int phantulon;
        System.out.println("phân tử lớn thứ N là");
        phantulon= nhap.nextInt();
        if(daysonguyen.size() >phantulon)
        {
            int phantulonN=daysonguyen.get(phantulon-1);
            System.out.println("Phần tử nhỏ thứ" +phantulon+"là " +phantulonN);
        }
        else {
            System.out.println("k tìm thấy phần tử lớn đó");
        }
    }




}
