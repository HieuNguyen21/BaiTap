package com.hiennn2008110163.Lab2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
       Scanner so = new Scanner(System.in);
        int nhapso;
        do{   
        System.out.println("1.Giai PT bac 1: ");
        System.out.println("2.Giai PT bac 2: ");
        System.out.println("3.tinh tien dien: ");
        System.out.println("4.ket thuc chuong trinh: ");
        System.out.print("nhap so muon chon: ");
        nhapso = so.nextInt();
        switch (nhapso) {
            case 1: bai1.main(args);
                break;
            case 2:bai2.main(args);
                break;
            case 3: bai3.main(args);
            default: System.out.println("chon chuc nang khac: ");
        }
       }while(nhapso != 4 );
    }
}