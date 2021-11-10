package com.hiennn2008110163.lab9.Animal;

public class testDanhSach {
    public static void main(String[] args) {
        quanLyAnimal danhSach = new quanLyAnimal();
        Wolf a1 = new Wolf();
        Lion a2 = new Lion();
        Hippo a3 = new Hippo();
        danhSach.add(a1);
        danhSach.add(a2);
        danhSach.add(a3);
        danhSach.makeVoid();
        danhSach.sleep();
}
}
