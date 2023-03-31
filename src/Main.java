import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kq;
        double x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        System.out.println("Nhập số c: ");
        int c = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    kq = "Phương trình có vô số nghiệm.";
                } else {
                    kq = "Phương trình vô nghiệm.";
                }
            } else {
                kq = "Phương trình có nghiệm là: x = " + -c/b;
            }
            System.out.println("=================================================================");
            System.out.println("===================Tính phương trình bậc 1======================");
            System.out.println("Phương trình bạn vừa nhập là: " + b + "x + " + c + " = 0");
            System.out.println(kq);
            System.out.println("=================================================================");
        } else {
            double detal = (b * b) - 4 * a * c;
            if (detal < 0) {
                kq = "Phương trình vô nghiệm.";
            } else if (detal == 0) {
                x = -b / 2 * a;
                kq = "Phương trình có nghiệm khép: " + x;
            } else {
                double x1 = -b + Math.sqrt(detal) / 2 * a;
                double x2 = -b - Math.sqrt(detal) / 2 * a;
                kq = "Phương trình có hai nghiệm: x1 = " + x1 + " x2 = " + x2;
            }
            System.out.println("=================================================================");
            System.out.println("===================Tính phương trình bậc 2=======================");
            System.out.println("Phương trình bạn vừa nhập là: " + a + "x^2 + " + b + "x + " + c + " = 0");
            System.out.println(kq);
            System.out.println("=================================================================");
        }
    }
}