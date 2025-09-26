package oop.Truutuong;

public class Maybay extends Phuongtiendichuyen{
    private String loainhienlieu;
    public Maybay()
    {

    }

    public Maybay(String loaiphuonngtien, String loainhienlieu) {
        super(loaiphuonngtien);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    @Override
    public String toString() {
        return "Maybay{" +
                "loainhienlieu='" + loainhienlieu + '\'' +
                '}';
    }

    @Override
    public double layvantoc() {
        return 0;
    }

}
