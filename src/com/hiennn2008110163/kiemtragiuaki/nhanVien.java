package com.hiennn2008110163.kiemtragiuaki;

public class nhanVien extends aNguoi {
    private static int HoTen;
    private float heSoLuong;
    public String toString;
    public int salary;
    public NhanVien(String hoTen,float heSoLuong,int salary) {
        super(hoTen,heSoLuong);
        this.heSoLuong = heSoLuong;
        this.salary = salary;       
    }
    protected double getsalary() {
        return (heSoLuong*1500000);
    }
    public String toString() {
        return("Họ Tên: " + this.hoTen + "Lương" + this.salary);
    }
}
}