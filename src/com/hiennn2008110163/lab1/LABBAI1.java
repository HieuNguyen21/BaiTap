package com.hiennn2008110163.lab1;

import java.util.Scanner;

public class LABBAI1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Họ tên: ");

   String hoten = scanner.nextLine();

   System.out.print("Điểm TB: "); 
    double diemTB = scanner.nextDouble(); 
    System.out.printf("%s %f điểm", hoten, diemTB); 
  }
}