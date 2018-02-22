package basics;

import java.util.Scanner;

public class Sinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Есть функция f(x)=sin(x). Введите минимальное и максимальное значения, шаг: ");
        double min = sc.nextDouble();
        double max = sc.nextDouble();
        double step = sc.nextDouble();
        if (((min > max) & (step > 0)) || ((max < min) & (step < 0)) || (step == 0)) {
            System.out.println("Ошибка. Проверьте введенные данные и перезапустите программу.");
        } else if (step > 0) {
            for (double x = min; x <= max; x += step) {
                System.out.println("sin(" + x + ") = " + Math.sin(x));
            }
        } else {
            for (double x = min; x <= max; x += -step) {
                System.out.println("sin(" + x + ") = " + Math.sin(x));
            }
        }
    }
} // 5
