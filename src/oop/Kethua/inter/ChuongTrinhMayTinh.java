package oop.Kethua.inter;

public class ChuongTrinhMayTinh implements Maytinh{


    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

    public static void main(String[] args) {
        ChuongTrinhMayTinh ct1=new ChuongTrinhMayTinh();

        System.out.println(ct1.cong(4,8));
        System.out.println(ct1.tru(4,8));
        System.out.println(ct1.nhan(4,8));
        System.out.println(ct1.chia(4,8));
    }
}
