package basics;

import java.util.Scanner;

public class DoubleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вводи 3 числа: \n");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.println("Произведение: " + (n1 * n2 * n3) + "\nСреднее арифметическое: " + (n1 + n2 + n3) / 3);
        if (n1 <= n2) {
            if (n1 <= n3) {
                if (n2 <= n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println(n1 + " " + n3 + " " + n2);
                }
            } else {
                System.out.println(n3 + " " + n1 + " " + n2);
            }
        } else {
            if (n3 <= n2) {
                System.out.println(n3 + " " + n2 + " " + n1);
            } else {
                if (n3 <= n1) {
                    System.out.println(n2 + " " + n3 + " " + n1);
                } else {
                    System.out.println(n2 + " " + n1 + " " + n3);
                }
            }
        }
    }
} // 2