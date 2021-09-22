package Lab2;

import java.util.Scanner;

public interface bai2 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Phuong trinh bac 2 co dang: ax^x+bx+c=0");
            System.out.print("nhap he so a: ");
            int a = scanner.nextInt();
            System.out.print("nhap he so b: ");
            int b = scanner.nextInt();
            System.out.print("nhap he so c: ");
            int c = scanner.nextInt();
            double delta = (Math.pow(b,2)-(4*a*c));
            if (delta<0) {
                System.out.println("PT  vo nghiem");
            } else if(delta==0) {
                double x1=x2= (-b/(2*a));
                System.out.println("PT co nghiem kep x1 = x2= " + x1);
            }
            else 
            {
               Double x1 = (float) ((-b + sqrt(delta))/(2*a));
               Double x2 = (float) ((-b - sqrt(delta))/(2*a));
                System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
            }
        }
    }