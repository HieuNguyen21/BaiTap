package com.hiennn2008110163.lab9;

public class Person {
    private String hoTen;
    private String diaChi;
    private String sDT;

    public Person(){}

    protected Person(String hoTen, String diaChi ,String sDT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getsDT() {
        return sDT;
    }
    public void setsDT(String diaChi) {
        this.sDT = sDT;
    }
    @Override
    public String toString() {
        return "Person [diaChi=" + diaChi + ", hoTen=" + hoTen + ",sDT=" + sDT + "]";
    }
}
