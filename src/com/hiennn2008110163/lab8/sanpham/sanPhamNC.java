package com.hiennn2008110163.lab8.sanpham;
import java.util.Scanner;
public class sanPhamNC {
    private String tenSp;
    private Double donGia;
    private Double giamGia;
    public sanPhamNC (String tenSp,  Double donGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
    public sanPhamNC(String tenSp, Double donGia , Double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public Double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau(){
        double thue;
        thue = (donGia*10)/100;
        return thue;
    }
    public void Xuat(){
        System.out.println("Tên Sản Phẩm: "+tenSp);
        System.out.println("Đơn Giá: "+donGia+"$");
        System.out.println("Giảm giá: "+ giamGia+"$");
        System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau()+"$");
    }
    protected void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        tenSp= s.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = s.nextDouble();
        System.out.println("Nhập số tiền đã giảm: ");
        giamGia = s.nextDouble();
    }
}
