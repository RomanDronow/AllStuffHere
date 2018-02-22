package arrays;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class ArrayProcessor {

    public static int[] arrayIn() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    } // 8

    public static void arrayPrint(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    } // 9

    public static int selfSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    } // 10

    public static int evens(int[] array) {
        int evenCounter = array.length;
        for (int i : array) {
            double remainder = Math.abs(i % 2);
            evenCounter -= remainder;
        }
        return evenCounter;
    } // 11

    public static int numsInInterval(int[] array, int a, int b) {
        int inBoundsCounter = 0;
        int left = a;
        int right = b;
        if (a > b) {
            left = b;
            right = a;
        }
        for (int i : array) {
            if ((i >= left) && (i <= right)) inBoundsCounter++;
        }
        return inBoundsCounter;
    } // 12

    public static boolean isPositive(int[] array) {
        for (int i : array) {
            if (i <= 0) return false;
        }
        return true;
    } // 13

    public static int[] reverse(int[] array) {
        int buffer;
        for (int i = 0; i < array.length / 2; i++) {
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
        return array;
    } // 14
}
