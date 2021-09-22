package Lab2;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap he so a: ");
        double a = sc.nextDouble();
        System.out.print("nhap he so b: ");
       double b = sc.nextDouble();
        if (a == 0)
        {
            System.out.println("pt vo so nghiem");
        }
        else 
        {
            System.out.println("phuong trinh co nghiem: x = "+-b+" / "+a+" = "+(-b/a));
        }
    }
}
