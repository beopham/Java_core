package oop.titv.book;

public class Tacgia {
    private String ten;
    private Ngay ngaysinh;

    public Tacgia()
    {

    }

    public Tacgia(String ten, Ngay ngaysinh) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Ngay getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Ngay ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return "Tacgia{" +
                "ten='" + ten + '\'' +
                ", ngaysinh=" + ngaysinh +
                '}';
    }
}
