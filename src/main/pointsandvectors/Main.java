package pointsandvectors;

import exceptions.LengthMismatchException;

import java.util.Scanner;

import exceptions.WrongValueException;

public class Main {

    public static void main(String[] args) throws WrongValueException, LengthMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x, y, z для первой точки");
        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
        Point3D point1 = new Point3D(x, y, z);
        Point3D point2 = new Point3D();
        System.out.println("Точка 1: " + point1.toString());
        System.out.println("Точка 2: " + point2.toString());
        if (point1.equals(point2)) {
            System.out.println("Точки равны.");
        } else System.out.println("Точки не равны");
        System.out.println("Введите x, y, z для первого вектора");

//Отсюда векторпроцессор

        Vector3D vector1 = new Vector3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Vector3D vector2 = new Vector3D(point1, point2);
        System.out.println("Сумма: " + Vector3DProcessor.sum(vector1, vector2));
        System.out.println("Разность: " + Vector3DProcessor.diff(vector1, vector2));
        System.out.println("Скалярное произведение: " + Vector3DProcessor.scalarMultiply(vector1, vector2));
        System.out.println("Векторное произведение: " + Vector3DProcessor.vectorMultiply(vector1, vector2));
        System.out.println("Произведение вектора 1 на число 2: " + Vector3DProcessor.multiply(vector1, 2));

//аррэй

        Vector3DArray array = new Vector3DArray(4);
        System.out.println("Длина массива: " + array.getLength());
        array.replace(0, vector1);
        array.replace(1, vector2);
        array.replace(2, new Vector3D(2, 2, 3));
        array.replace(3, new Vector3D(4, 5, 6));
        Vector3D vector3 = new Vector3D(2, 2, 3);
        System.out.println("Максимальная длина вектора: " + array.maxVectorLength());
        System.out.println("Индекс найденного вектора: " + array.find(vector3));
        System.out.println("Сумма векторов:" + array.sum());
        double[] coefficients = {4, 2, 5, 1};
        System.out.println("Линейная комбинация: " + array.linearCombination(coefficients));
        System.out.println("Сдвиг точки: " + array.movePoints(point1));
    }
}
