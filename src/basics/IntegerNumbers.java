package basics;

import java.util.Scanner;

public class IntegerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вводи 3 числа: \n");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("Произведение: " + (n1 * n2 * n3) + "\nСреднее арифметическое: " + avg);
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
} // Задача 3
