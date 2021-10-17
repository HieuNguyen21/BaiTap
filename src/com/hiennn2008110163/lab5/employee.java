package com.hiennn2008110163.lab5;
public class employee {
    String name,address,bophan,ngaysinh;
    int salary;
    void Address(String text){
        address = text;
    }
    void BoPhan(String text){
        bophan = text;
    }
    void NgaySinh(String text){
        ngaysinh = text;
    }
    void Salary(int amount){
        salary = amount;
    }
    void showData(){
        System.out.println("Tên: "+name);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Ngày sinh: "+ngaysinh);
        System.out.println("Bộ Phận: "+bophan);
        System.out.println("Lương: "+salary+"$");
    }
    Employee(String text){
        name = text;
    }
}
