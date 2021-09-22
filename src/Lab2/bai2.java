package Lab2;

public interface bai2 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a:");
        int a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        int b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        int c = scanner.nextDouble();
        System.out.println("Ppt bac hai: " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (deltail < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (deltail == 0) {
           double x1 = -b / (2 * a);
            System.out.println("Phuong trinh có 1 nghiem là x1 = x2 = " + x1);
        } else {
           double x1 = (-b + Math.sqrt(deltail)) / (2 * a);
           double x2 = (-b - Math.sqrt(deltail)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + " và x2 = " + x2);
        }
    }
}