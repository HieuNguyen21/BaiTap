package com.hiennn2008110163.lab7.shape;

public class Shape {
    protected String sound="âm thanh muốn nghe!!";
    protected Boolean state =false;
    protected void state(){
    //state = bam;
    }
    protected void play(){
        if(state == true){
            System.out.println("đang xoay 360 độ");
            System.out.println("chơi nhạc!!");
        }
        else
        System.out.println("đã ngừng!!");
    }
}
