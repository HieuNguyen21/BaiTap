package com.hiennn2008110163.lab8.kethua.hinhHoc;

public class hinhVuong extends chuNhat{
    public hinhVuong(double canh){
		super(canh, canh);
	}

	public void xuat(){
		System.out.println("Cạnh: " + getDai());
		System.out.println("Chu vi hình vuông : " + getChuVi());
		System.out.println("Diện tích hình vuông : " + getDienTich());
	}
}
