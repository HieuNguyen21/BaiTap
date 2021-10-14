package com.hiennn2008110163.lab5;
import java.util.Scanner;
public class testempolyee {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Employee employee = new Employee("Nguyen van a");
    System.out.print("Nhap vao đia chi : ");
    String text = in.nextLine();
    employee.getAddress(text);
    employee.getNgaySinh("25/10/2002");
    employee.getBoPhan("IT");
    employee.getSalary(2000);
    employee.showData();
}
}