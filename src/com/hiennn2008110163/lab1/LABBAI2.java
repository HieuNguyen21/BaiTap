package lab1;
import java.util.Scanner;

public class LABBAI2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài: ");
        int a = scanner.nextInt();
        System.out.println("nhập chiều rộng: ");
        int b = scanner.nextInt();
        System.out.println("chu vi hcn: "+((a+b)/2));
        System.out.println("diện tích hcn:  "+(a*b));
       System.out.println("cạnh dài nhất: "+ Math.max(a, b));
    }
}    