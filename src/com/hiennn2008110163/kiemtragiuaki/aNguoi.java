package com.hiennn2008110163.kiemtragiuaki;
import java.util.Scanner;
public class aNguoi {
    private String hoTen;
    private String diaChi;
    public  aNguoi(String hoTen,String diaChi) {
    this.hoTen = hoTen;
    this.diaChi = diaChi;
    }
    public String gethoTen() {
        return hoTen;    
    }
    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getdiaChi() {
        return diaChi;
    }
    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void Xuat(){
        System.out.println("Họ Tên: "+hoTen);
        System.out.println("Địa Chỉ : "+diaChi);
    }
    protected void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Họ Tên:");
        hoTen= s.nextLine();
        System.out.println("Địa Chỉ: ");
        diaChi = s.nextLine();
}
}
