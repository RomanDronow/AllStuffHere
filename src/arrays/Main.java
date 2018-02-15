package arrays;

import java.util.Scanner;

import static arrays.ArrayProcessor.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс и элементы массива: ");
        int[] array = arrayIn();
        System.out.print("Массив: ");
        arrayPrint(array);
        System.out.println("\nСумма элементов массива = " + selfSum(array));
        System.out.println("Количество четных = " + evens(array));
        System.out.println("Введите а: ");
        int a = sc.nextInt();
        System.out.println("Введите b: ");
        int b = sc.nextInt();
        System.out.println("Количество элементов массива на отрезке [" + a + "," + b + "] = " + numsInInterval(array, a, b));
        if (isPositive(array)) {
            System.out.println("Все положительны");
        } else {
            System.out.println("Не все положительны");
        }
        System.out.println("Обратный массив:" + reverse(array));
    }
}
