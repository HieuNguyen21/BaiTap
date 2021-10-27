package com.hiennn2008110163.lab7.shape;
public class Amoeba {
    private int x;
	private int y;
	protected Boolean state =false;
	Amoeba(String Sound, int xx, int yy){
		//Sound=nhac;
		x = xx;
		y = yy;
    }
	protected void state() {
		System.out.println("Xoay 360 theo toa do x = " + x + " va y = " + y);
		state = true;
	}

	protected void play() {
		if(state == true)
			System.out.println("chơi nhạc!!!");
		else
			System.out.println("đã ngừng!!");
	}
}
