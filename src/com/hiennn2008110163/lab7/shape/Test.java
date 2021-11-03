package com.hiennn2008110163.lab7.shape;

public class Test {
    public static void main(String[] args) {
        hinhTamGiac tamGiac= new hinhTamGiac("nhạc đang phát!!");
        hinhTron Tron= new hinhTron("nhạc đang phát!!");
        hinhVuong vuong= new hinhVuong("nhạc đang phát!!");
        Amoeba amoeba= new Amoeba("nhạc đang phát!!",2,4);

        tamGiac.play();
        //tamGiac.sound();

        Tron.play();
        //Tron.sound();

        vuong.play();
        //vuong.sound();

        amoeba.play();
        //amoeba.sound();
}
}