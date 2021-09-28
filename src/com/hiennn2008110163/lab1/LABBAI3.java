package com.hiennn2008110163.lab1;
import java.util.Scanner;

public class LABBAI3 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("nhập thể tích lập phương: ");
        int a = Scanner.nextInt();
        System.out.println("thể tích lập phương= "+a+" * "+a+" * "+a+" = "+(Math.pow(a,3)));
}
}
