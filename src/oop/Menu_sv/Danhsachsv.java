package oop.Menu_sv;

import java.util.ArrayList;

public class Danhsachsv {
    private ArrayList<Sinhvien> student;

    public Danhsachsv()
    {
        this.student=new ArrayList<Sinhvien>();
    }

    public Danhsachsv(ArrayList<Sinhvien> student) {
        this.student = student;
    }

    public ArrayList<Sinhvien> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Sinhvien> student) {
        this.student = student;
    }


    public void nhap(Sinhvien sv)
    {
        student.add(sv);
    }
    public void xuat_sv()
    {
        for (Sinhvien sv :student)
        {
            System.out.println(sv);
        }
    }
    public boolean kiemtrasvrong()
    {
        return student.isEmpty();


    }
    public void ktrrong()
    {
        if(kiemtrasvrong())
        {
            System.out.println("sinh viên rỗng");
        }
        else
        {
            System.out.println("sinh viên k rỗng");
        }
    }
    public void layraslsv()
    {
        System.out.println(student.size());
    }
    public void rong_danhsasch()
    {
        System.out.println(student.removeAll(student));
    }

}
