import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class array_random {
    public static void main(String[] args) {
        ArrayList<Integer> dayso=new ArrayList<>();
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int spt= sc.nextInt();;

        for(int i=0;i<spt;i++)
        {
            int songaunhien=rd.nextInt(-100,100);
            dayso.add(songaunhien);
        }
        for (int ketqua : dayso)
        {
            System.out.print(ketqua +" ");
        }
        System.out.println(" ");
        System.out.println("dãy số sau khi sắp xếp tăng dần");
        Collections.sort(dayso);
        System.out.println(dayso);
        System.out.println("dãy số sau khi sắp xếp giảm dần");
        Collections.reverse(dayso);
        System.out.println(dayso);
        // Tìm phần tử lớn nhất
        int max=Collections.max(dayso);
        System.out.println("phần tử lớn nhất là " + max);

        System.out.println("nhập vào phần tử cần tìm lớn vị trí thứ N");
        int phantucantim= sc.nextInt();
        if(dayso.size() >=phantucantim)
        {

            int phantulonthuN=dayso.get(phantucantim-1);  // = dayso.get(n)
            System.out.println("phần tử lớn thư " +phantucantim + " là " + phantulonthuN);
        }
        else {
            System.out.println("số phần tử bạn tìm nó k có vị trí");
        }
        System.out.println("dãy số sau khi sắp xếp tăng dần");
        Collections.sort(dayso);
        System.out.println(dayso);
        System.out.println("nhập vào phân tử cần tìm min");
        int phantumin= sc.nextInt();
        if(dayso.size() >=phantumin)
        {
            int ptNmin=dayso.get(phantumin-1);
            System.out.println("phần tử nhỏ thư " +phantumin + " là " + ptNmin);
        }
        else {
            System.out.println(" k có phần tử min mà b nhập");
        }
// 1. Sắp xếp giảm dần
        Collections.sort(dayso, Collections.reverseOrder());
        System.out.println(dayso);
// 2. In ra top 5 phần tử lớn nhất (hoặc ít hơn nếu danh sách ít hơn 5 phần tử)
        System.out.println("Top 5 phần tử lớn nhất:");
        for (int i = 0; i < 5 && i < dayso.size(); i++) {
            System.out.println("Top " + (i + 1) + ": " + dayso.get(i));
        }
    }
}
