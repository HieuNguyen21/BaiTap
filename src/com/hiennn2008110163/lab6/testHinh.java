package com.hiennn2008110163.lab6;

public class testHinh {
    public static void main(String[] args) {
        hinhTron tron = new hinhTron();
        hinhVuong vuong =new hinhVuong();
        hinhTamGiac tamgiac=new hinhTamGiac();
        tron.bam();
        tron.nhac();
        vuong.bam();
        vuong.nhac();
        tamgiac.bam();
        tamgiac.nhac();
        System.out.println("count hinhVuong"+hinhVuong.count);
        System.out.println("count hinhTron"+hinhTron.count);
        System.out.println("count hinhTamGiac"+hinhTamGiac.count);
    }
}
