package basics;

import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Существует система уравнений\nax + by + c\ndx + ey + f\nВведите a b c d e f");
       /**************************************/
       doSolving(0, 0,0, 0, 0, 0);
        System.out.println();
       doSolving(0, 0,1, 0, 0, 0);
       doSolving(0, 0,0, 0, 0, 1);
       doSolving(1, 2,3, 0, 0, 1); //
       doSolving(0, 0,1, 2, 3, 4); //
       doSolving(1, 0,1, 10, 0, 1);
       doSolving(0, 2,2, 0, 5, 1);
       doSolving(2, 2,2, 5, 5, 1);
        System.out.println();
       doSolving(1, 2,3, 0, 0, 0);
       doSolving(0, 0,0, 3, 4, 5);
       doSolving(1, 1,1, 2, 2, 2);
        System.out.println();
       doSolving(1, 2,3, 4, 5, 6);
       /**************************************/
    }

    public static void doSolving(double a, double b, double c, double d, double e, double f) {
        double delta = a * e - b * d;
        double deltaX = c * e - b * f;
        double deltaY = a * f - c * d;
        if (delta != 0) {
            System.out.println("x = " + deltaX / delta);
            System.out.println("y = " + deltaY / delta);
        } else {
            if ((a == 0) && (b == 0) && (c == 0) && (d == 0) && (e == 0) && (f == 0)) {
                System.out.println("x = y = R");
                return;
            }
            if ((a == 0) && (b == 0) && (c == 0) && (d == 0) && (e == 0) && (f == 0)) {
                System.out.println("Решений нет.");
                return;
            }
            if ((a == 0) && (b == 0) && (d != 0) && (e != 0)) {
                System.out.println("y = (-" + d + "x + " + f + ")/" + e);
                return;
            }
            if ((a != 0) && (b != 0) && (d == 0) && (e == 0)) {
                System.out.println("y = (-" + a + "x + " + c + ")/" + b);
                return;
            }
            if ((a * f == c * d) && (b * f == c * e)) {
                if (b != 0) {
                    System.out.println("y = (-" + a + "x + " + c + ")/" + b);
                    return;
                }
                if (e != 0) {
                    System.out.println("y = (-" + d + "x + " + f + ")/" + e);
                    return;
                }
                if (a != 0) {
                    System.out.println("х = (-" + b + "y + " + c + ")/" + a);
                    return;
                }
                if (d != 0) {
                    System.out.println("х = (-" + e + "y + " + f + ")/" + d);
                    return;
                }
            }
            System.out.println("Решений нет");
        }
    }
} // 6
