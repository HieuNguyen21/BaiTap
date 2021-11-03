package com.hiennn2008110163.lab8.kethua.sinhVien;
import java.util.Scanner;
public abstract class sinhVienGD {
    private String hoTen, nganh;

	public sinhVienGD(String hoTen, String nganh){
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public abstract double getDiem();

	public String getHocLuc()
	{
		String hocLuc;
		double diem = getDiem();
		if(diem < 5)
			hocLuc = "Yếu";
		else if(diem >= 5 && diem < 6.5)
			hocLuc = "Trung bình";
		else if(diem >=6.5 && diem < 7.5)
			hocLuc = "Khá";
		else if(diem >=7.5 && diem < 9)
			hocLuc = "Giỏi";
		else
			hocLuc = "Xuất sắc";
		return hocLuc;
	}

	public void xuat(){
		System.out.println("Họ và Tên: "+hoTen);
		System.out.println("Ngành: "+ nganh);
		System.out.println("Học lực: "+ getHocLuc());
		System.out.println("_________");
	}

}
