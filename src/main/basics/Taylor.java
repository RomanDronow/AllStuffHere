package basics;

import java.util.Scanner;

public class Taylor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fact = 1;
        double res = 1;
        System.out.println("Введите х");
        double x = sc.nextDouble();
        double xx = x;
        System.out.println("Введите точность");
        double accuracy = sc.nextDouble();
        double buff = accuracy + 1;
        for (int i = 1; Math.abs(buff) > Math.abs(accuracy); i++) {
            fact *= i;
            buff = xx / fact;
            xx *= x;
            res += buff;
        }
        System.out.println(res);
        System.out.println(Math.exp(x));
    }
} // 7
