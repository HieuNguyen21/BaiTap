import java.util.Scanner;

public class LABBAI4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 co dang: ");
        System.out.println("nhap he so a: ");
        int a = scanner.nextInt();
        System.out.println("nhap he so b: ");
        int b = scanner.nextInt();
        System.out.println("nhap he so c: ");
        int c = scanner.nextInt();
        double delta = (Math.pow(b,2)-(4*a*c));
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta)/(2*a));
        System.out.println("x1 = "+-b+"-"+Math.sqrt(delta)+"/ 2 * "+a+" = "+x1);
        System.out.println("x1 = "+-b+"+"+Math.sqrt(delta)+"/ 2 *"+a+" = "+x2);
    }
}
