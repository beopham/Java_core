import java.util.Arrays;
import java.util.Scanner;

public class timphantulon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // số phần tử cố định
        int[] arr = new int[n];

        // Nhập 10 phần tử
        System.out.println("Nhập " + n + " phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // In ra mảng vừa nhập
        System.out.print("Mảng vừa nhập: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(); // xuống dòng

        // Sắp xếp tăng dần
        Arrays.sort(arr);

        // In mảng từ lớn đến bé
        System.out.print("Mảng từ lớn đến bé: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Lấy phần tử lớn thứ 8 (index = n - 8)
        int result = arr[n - 8];
        System.out.println("Phần tử lớn thứ 8 trong mảng là: " + result);
    }
}
