package com.hiennn2008110163.bank;
import java.util.Scanner;
public class customer {
    public static void main(String[] args) {
        String name;
        String address;
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ho ten khach hang: ");
        name = scanner.nextLine();
        System.out.println("Nhap  đia chi khach hang: ");
        address = scanner.nextLine();
         
        System.out.println("Ho ten khach hang: " + name);
        System.out.println("dia chi khach hang: " + address);
    }
 
}

