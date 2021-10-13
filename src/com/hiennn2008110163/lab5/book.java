package com.hiennn2008110163.lab5;
import java.util.Scanner;
public class book {
    Scanner input = new Scanner(System.in);
    int  giaban,giaxuat,soluong,namxuatban;
    String nhaxuatban,loai;
    void nhapThongTinSach(){
        System.out.print("Nhap the loai sach  : ");
        loai = input.nextLine();
        System.out.print("Nhap ten nha xuat ban cua sach : ");
        nhaxuatban = input.nextLine();
        System.out.print("Nhap nam xuat ban  : ");
        namxuatban = input.nextInt();
        System.out.print("Nhap so luong  : ");
        soluong = input.nextInt();
        System.out.print("Nhap gia  :");
        giaban = input.nextInt();
    }
    void showSach(){
        System.out.println("Nha san xuat: "+nhaxuatban);
        System.out.println("Nam xuat ban: "+namxuatban);
        System.out.println("Loai: "+loai);
        System.out.println("Gia nhap: "+giaban);
        System.out.println("Gia xuat: "+giaxuat);
        System.out.println("So luong: "+soluong);
    }
    book(int amount){
        soluong = amount;
    }
}
