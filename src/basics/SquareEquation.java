package basics;

import java.util.Scanner;

public class SquareEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вводи a,b,c для ax^2+bx+c=0: \n");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b + 4 * a * c;
        if ((d < 0) || (a == 0)) {
            System.out.println("Корней нет");
        } else {
            if (d == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
            }
        }
    }
} // 4