package com.hiennn2008110163.lab8.kethua.sinhVien;

public class sinhVienIT extends sinhVienGD{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public sinhVienIT(){
        super(hoTen,"IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml ;
    }
public double getDiem(){
    return(2* diemJava+ diemHtml +diemCss)/4;
}
}
