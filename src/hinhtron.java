import java.util.Scanner;

public class hinhtron {
    public static void main(String[] args) {
        // biết cục bộ local variable
        Scanner sc=new Scanner( System.in);
        System.out.println("nhập vào chều dài");
        double chieudai=sc.nextDouble();
        System.out.println("nhập vào chiều rộng");
        double chieruong=sc.nextDouble();

        double chuvi,dientich;

        dientich=(chieudai*chieruong);
        chuvi=(chieudai+chieruong)*2;
        System.out.println("Chiều dài = " +chieudai);
        System.out.println("Chiều rộng = " +chieruong);
        System.out.println("Diện tích = " +dientich);
        System.out.println("Chu vi = " +chuvi);
    }
}
