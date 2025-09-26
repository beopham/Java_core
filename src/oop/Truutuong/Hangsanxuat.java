package oop.Truutuong;

public class Hangsanxuat {
    private String tenxx,tenquoagia;

    public Hangsanxuat()
    {

    }

    public Hangsanxuat(String tenxx, String tenquoagia) {
        this.tenxx = tenxx;
        this.tenquoagia = tenquoagia;
    }

    public String getTenxx() {
        return tenxx;
    }

    public void setTenxx(String tenxx) {
        this.tenxx = tenxx;
    }

    public String getTenquoagia() {
        return tenquoagia;
    }

    public void setTenquoagia(String tenquoagia) {
        this.tenquoagia = tenquoagia;
    }

    @Override
    public String toString() {
        return "Hangsanxuat{" +
                "tenxx='" + tenxx + '\'' +
                ", tenquoagia='" + tenquoagia + '\'' +
                '}';
    }
}
