package com.hiennn2008110163.lab5;
import java.util.Scanner;
public class employee {
    String tenNhanVien;
    float luong;
    String boPhanLamViec;
    String ngaySinh;
    Scanner input = new Scanner(System.in);
    void nhapThongTinNhanVien(){
        System.out.print("Nhap ten nhan vien : ");
        tenNhanVien = input.nextLine();
        System.out.print("Nhap ngay sinh cua nhan vien : ");
        ngaySinh = input.nextLine();
        System.out.print("Nhap bo phan lam viec  : ");
        boPhanLamViec = input.nextLine();       
        System.out.print("Nhap luong nhan vien : ");
        luong = input.nextFloat();
    }
    void xuatThongTinNhanVien(){
        System.out.println("Ten nhan vien : " + tenNhanVien);
        System.out.println("Ngay sinh cua nhan vien : " + ngaySinh);
        System.out.println("Bo phan lam viec  : " + boPhanLamViec);
        System.out.println("Luong nhan vien : " + luong);
    }
    
}
