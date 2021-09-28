package com.hiennn2008110163.Lab3;

public class bai2 {

    public static void main(String[] args) {
        Scaner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++)
        {
            System.out.println("Bang cuu chuong " + i);
            for (int j = 1; j <=10; j++)
            {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
    }
