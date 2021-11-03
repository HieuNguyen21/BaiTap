package com.hiennn2008110163.lab8.kethua.sinhVien;
import java.util.Scanner;

public class menuSinhVien {
    public static void main(String[] args) {
        int choiceNumber;
        Scanner scanner = new Scanner(System.in);
        for(;;){
        System.out.println("============MENU===============");
        System.out.println("1. Nhập Danh Sách Sinh Viên:   ");
        System.out.println("2. Xuất Danh Sách Sinh Viên: ");
        System.out.println("3. Xuất Danh Sách Sinh Viên Có Học Lực: ");
        System.out.println("4. Sắp Xếp Danh Sách Sinh Viên");
        System.out.println("5. Kết Thúc Chương Trình: ");
        System.out.println("==========END MENU=============");
        System.out.println("Hãy chọn 1 chức năng:");
        do {
            System.out.println("Bấm số để chọn: ");
            choiceNumber = scanner.nextInt();
        }while ((choiceNumber < 1) || (choiceNumber > 5 ));
        switch(choiceNumber){
            case 1: 
            System.out.println("1. Nhập Danh Sách :   ");
              break;
            case 2:
             System.out.println("1. Xuất Danh Sách :   ");
             break;
            case 3: 
            System.out.println("1. Xuất Danh Sách Học Lực:   ");
            break;
            case 4: 
            System.out.println("1. Sắp Xếp Danh Sách :   ");
            break;
            default: System.out.println("Chọn chức năng khác");
        }
    }
}
}
