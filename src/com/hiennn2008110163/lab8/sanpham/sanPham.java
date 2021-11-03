package com.hiennn2008110163.lab8.sanpham;
import java.util.Scanner;
public class sanPham {
    private String tenSp;
    private Double donGia;
    private Double giamGia;
   
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
    protected double getThueNhapKhau(){
        double thue;
        thue = (donGia*10)/100;
        return thue;
    }
    protected void Xuat(){
        System.out.println("Tên Sản Phẩm: "+tenSp);
        System.out.println("Đơn Giá: "+donGia+"đồng");
        System.out.println("Giảm giá: "+ giamGia+"đồng");
        System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau()+"đồng");
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
