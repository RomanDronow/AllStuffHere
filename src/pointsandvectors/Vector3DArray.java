package pointsandvectors;

import exceptions.LengthMismatchException;
import exceptions.WrongValueException;

public class Vector3DArray {

    public Vector3D[] array;
    public int length;

    public Vector3DArray(Vector3D oldArray[]) throws WrongValueException {
        this.length = oldArray.length;
        array = new Vector3D[this.length];
        for (int i = 0; i < this.length; i++) {
            array[i] = oldArray[i];
        }
    }
    public Vector3DArray(int length) throws WrongValueException {
        if (length < 1) {
            throw new WrongValueException("Длина массива векторов не может быть меньше единицы.");
        }
        this.length = length;
        array = new Vector3D[length];
    } // 18-1

    public int getLength() {
        return length;
    } // 18-2

    public void replace(int i, Vector3D v) throws WrongValueException {
        if ((i >= length) || (i < 0)) {
            throw new WrongValueException("Не найден элемент массива с указанным индексом.");
        }
        array[i] = new Vector3D(v.getX(), v.getY(), v.getZ());
    } // 18-3

    public double maxVectorLength() {
        double maxLen = array[0].length();
        for (int i = 0; i < length; i++) {
            if (maxLen < array[i].length()) {
                maxLen = array[i].length();
            }
        }
        return maxLen;
    } // 18-4

    public int find(Vector3D v) {
        for (int i = 0; i < length; i++) {
            if (v.equals(array[i])) return i;
        }
        return -1;
    } // 18-5

    public Vector3D sum() {
        Vector3D summa = this.array[0];
        for (int i = 1; i < array.length; i++) {
            summa = Vector3DProcessor.sum(summa, this.array[i]);
        }
        return summa;
    } // 18-6

    public Vector3D linearCombination(double coefficients[]) throws LengthMismatchException {
        if (coefficients.length != length){
            throw new LengthMismatchException(new Vector3D());
        }
        Vector3D combination = Vector3DProcessor.multiply(this.array[0], coefficients[0]);
        for (int i = 0; i < length; i++) {
            combination = Vector3DProcessor.sum(combination, Vector3DProcessor.multiply(this.array[i], coefficients[i]));
        }
        return combination;
    } // 18-7

    public Point3D[] movePoints(Point3D p) {
        Point3D[] pointsArray = new Point3D[length];
        for (int i = 0; i < length; i++) {
            pointsArray[i] = new Point3D(p.getX()+array[i].getX(), p.getY()+array[i].getY(), p.getZ()+array[i].getZ());
        }
        return pointsArray;
    } // 18-8

}
