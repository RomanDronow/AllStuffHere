package three;

public class SquareTrinomial {
    private double a, b, c;

    SquareTrinomial() {
    }

    ;

    SquareTrinomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double[] solution() {
        double[] roots = new double[2];
        if (a == 0) {
            throw new IllegalArgumentException("Не квадратное");
        } else if (a > 0) {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                throw new IllegalArgumentException("Корней нету");
            } else {
                if (d == 0) {
                    roots[0] = roots[1] = -b / (2 * a);
                } else {
                    roots[0] = (-b + Math.sqrt(d)) / (2 * a);
                    roots[1] = (-b - Math.sqrt(d)) / (2 * a);
                }
            }
        }
        return roots;
    }
}