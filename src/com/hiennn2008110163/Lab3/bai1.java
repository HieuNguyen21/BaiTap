package com.hiennn2008110163.Lab3;

public class bai1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so bat ky: ");
        int n = scanner.nextInt();
        int tam = 0;
        for (int i = 2; i < n - 1; i++)
        {
            if (n%i == 0)
            {
                tam ++;
            }
            i++;
        }
        if (tam == 0)
        {
            System.out.println(n + " la so nguyen to");
        }
        else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
    
}
