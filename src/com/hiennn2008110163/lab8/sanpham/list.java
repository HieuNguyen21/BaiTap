package com.hiennn2008110163.lab8.sanpham;
import java.util.List;
import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
    ArrayList<String> sanPham = new ArrayList<String>();
    sanPham.add("bánh,2000 ");
    sanPham.add("coca,7000 ");
    sanPham.add("sôcola,100000 ");
    System.out.println(sanPham.size());
    for (int i = 0; i < sanPham.size(); i++) {
    System.out.println(sanPham);
}
}
}
