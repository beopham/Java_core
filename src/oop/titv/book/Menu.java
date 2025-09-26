package oop.titv.book;

public class Menu {
    public static void main(String[] args) {
        Ngay ngay1=new Ngay(9,11,2003);
        Ngay ngay2=new Ngay(7,12,2005);
        Ngay ngay3=new Ngay(19,10,2003);

        Tacgia tacgia1=new Tacgia("Nam",ngay1);
        Tacgia tacgia2=new Tacgia("Huy",ngay2);
        Tacgia tacgia3=new Tacgia("Lan",ngay3);

        Sach sach1=new Sach("Conan",10,2002,tacgia1);
        Sach sach2=new Sach("Kid",14,2021,tacgia2);
        Sach sach3=new Sach("Goku",15,2014,tacgia3);

        sach1.insach();
        System.out.println(sach1.namxuatbansach(sach2));
        sach1.giamgiasach(sach1.getGiaban());


    }
}
