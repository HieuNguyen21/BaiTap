package com.hiennn2008110163.lab6;

public class hinhTron {
    String nhac="âm thanh muốn nghe!!";
    Boolean bam =false;
    int size;
    static int count;
    hinhTron(){
        count ++;
    }
    void bam(){
    bam = bam;
    }
    void play(){
        if(bam == true){
            System.out.println("đang xoay 360 độ");
            System.out.println("chơi nhạc");
        }
        else
        System.out.println("đã ngừng!!");
    }
}
