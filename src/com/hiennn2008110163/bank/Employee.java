package com.hiennn2008110163.bank;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
	String name;
	int salary;

	Scanner scanner = new Scanner(System.in);
	
	String getName(){	
		System.out.print("Ho va ten nhan vien: ");
		name = scanner.nextLine();
		return name;
	}

	int getSalary(){
		System.out.print("Luong nhan vien: ");
		salary = scanner.nextInt();
		return salary;
	}

	void show(){
		System.out.println("Ho va ten: " +name);
		System.out.println("Dia chi: " +salary);
	}
}