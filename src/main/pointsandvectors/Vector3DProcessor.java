package pointsandvectors;

public class Vector3DProcessor {
    public static Vector3D sum(Vector3D one, Vector3D two) {
        return new Vector3D(one.getX() + two.getX(),
                one.getY() + two.getY(),
                one.getZ() + two.getZ());
    }

    public static Vector3D diff(Vector3D one, Vector3D two) {
        return new Vector3D(one.getX() - two.getX(),
                one.getY() - two.getY(),
                one.getZ() - two.getZ());
    }

    public static Vector3D multiply(Vector3D v, double n) {
        return new Vector3D(v.getX() * n, v.getY() * n, v.getZ() * n);
    }

    public static Vector3D scalarMultiply(Vector3D one, Vector3D two) {
        return new Vector3D(one.getX() * two.getX(), one.getY() * two.getY(), one.getZ() * two.getZ());
    }

    public static Vector3D vectorMultiply(Vector3D one, Vector3D two) {
        return new Vector3D(one.getY() * two.getZ() - one.getZ() * two.getY(),
                one.getX() * two.getZ() - one.getZ() * two.getX(),
                one.getX() * one.getY() - one.getY() * two.getX());
    }

    public static boolean isCollinear(Vector3D one, Vector3D two) {
        double ratioX = one.getX() / two.getX();
        double ratioY = one.getY() / two.getY();
        double ratioZ = one.getZ() / two.getZ();
        return ratioX == ratioY && ratioX == ratioZ;
    }
}
