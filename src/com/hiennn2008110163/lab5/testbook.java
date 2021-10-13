package com.hiennn2008110163.lab5;

public class testbook {
    public static void main(String[] args) {
        Book book1 = new Book(20);
        book1.getNhaXuatBan("Kim Đồng");
        book1.getNamXuatBan(2021);
        book1.getLoai("Truyện conan");
        book1.getGiaNhap(10000);
        book1.getGiaXuat(15000);
        book1.showSach();
    }
}
