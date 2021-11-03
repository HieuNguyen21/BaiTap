package com.hiennn2008110163.lab8.kethua.sinhVien;

public class sinhVienKT extends sinhVienGD {
    private double diemMarketing;
    private double diemSales;

    public sinhVienKT(String hoTen,double diemMarketin,double diemSales){
        super(hoTen,"KT");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
        
    }
public double getDiem(){
    return(2* diemMarketing+ diemSales)/3;
}
}
