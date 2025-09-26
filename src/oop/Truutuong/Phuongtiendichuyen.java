package oop.Truutuong;

public abstract class Phuongtiendichuyen {
   private String loaiphuonngtien;

   public Phuongtiendichuyen()
   {

   }

    public Phuongtiendichuyen(String loaiphuonngtien) {
        this.loaiphuonngtien = loaiphuonngtien;
    }

    public String getLoaiphuonngtien() {
        return loaiphuonngtien;
    }

    public void setLoaiphuonngtien(String loaiphuonngtien) {
        this.loaiphuonngtien = loaiphuonngtien;
    }


    // public String laytrenxanxuat()

    public void batdau()
    {
        System.out.println("bắt đầu");
    }
    public void tangtoc()
    {
        System.out.println("tăng tốc");
    }
    public void  stop()
    {
        System.out.println("dừng lại");
    }
    public abstract double layvantoc();
    @Override
    public String toString() {
        return "Phuongtiendichuyen{" +
                "loaiphuonngtien='" + loaiphuonngtien + '\'' +
                '}';
    }
}
