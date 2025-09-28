package Sinhvien;

import java.util.ArrayList;

public class QuanliSinhvien {
    private ArrayList<Sinhvien> danhsachsinhvien;

    public QuanliSinhvien()
    {
        this.danhsachsinhvien=new ArrayList<> ();
    }
    public QuanliSinhvien(ArrayList<Sinhvien> danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public void themsinhvien(Sinhvien sv)
    {
        danhsachsinhvien.add(sv);
    }

    public void hienthidanhsachsv()
    {
        danhsachsinhvien.stream().forEach(sv-> sv.danhsach());
    }
    public void sapxepGpatang()
    {
        danhsachsinhvien.stream()
                .sorted((sv1,sv2) -> Double.compare(sv1.getGpa(),sv2.getGpa()))
                .forEach(sv->sv.danhsach());
    }
    public void sapxepGpagiam()
    {
        danhsachsinhvien.stream().sorted((sv1,sv2) -> Double.compare(sv2.getGpa(), sv1.getGpa()))
                .forEach(sv-> sv.danhsach());
    }
    public void sapxeptuoitangdan()
    {
        danhsachsinhvien.stream().sorted((sv1,sv2)->Integer.compare(sv1.getTuoi(),sv2.getTuoi()))
                .forEach((sv) ->sv.danhsach());
    }
    public void tìmtheoTen(String tencantim)
    {
        danhsachsinhvien.stream().filter((sv)-> sv.getTen().equalsIgnoreCase(tencantim))
                .forEach((sv)->sv.danhsach());
    }

}
