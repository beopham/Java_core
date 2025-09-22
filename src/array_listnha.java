import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class array_listnha {
    public static void main(String[] args) {
        ArrayList<Integer> dayso = new ArrayList<>(); // biến toàn cục
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int sophantu = nhap.nextInt();
        int so = 0;
        for (int i = 0; i < sophantu; i++) {
            System.out.println("Phần tử thứ [" + i + "]");
            so = nhap.nextInt();
            dayso.add(so);
        }
        System.out.println("kết quả dãy số");
        for (int ketqua : dayso) {
            System.out.print(ketqua + " ");
        }
        System.out.println(" ");
        System.out.println("kích thước của dãy số " + dayso.size());

        System.out.println("nhập vào số phần tử cần tìm");
        int sophantucantim = nhap.nextInt();
        if (dayso.contains(sophantucantim)) {
            System.out.println(sophantucantim);
        } else {

            System.out.println("k có số phần tử");
        }
        System.out.println("sắp xếp tăng dần");
        Collections.sort(dayso);
        System.out.println(dayso);
        System.out.println("sắp xếp giảm dần");
    }
}
