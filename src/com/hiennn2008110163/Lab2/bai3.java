package com.hiennn2008110163.Lab2;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dien su dung: ");
        int dien = scanner.nextInt();
        int tiendien;
        if (dien< 50)
        {
            tiendien = dien*1000;
            System.out.println("tien dien la: "+ tiendien+"d");
        }
        else
        {
            tiendien=50*1000+(dien-50)*1200;
            System.out.println("tien dien la: "+tiendien+"d ");
        }
    }
}