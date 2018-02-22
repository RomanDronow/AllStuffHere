package pointsandvectors;

public class Vector3D {

    private double x, y, z;

    public Vector3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D a, Point3D b) {
        x = b.getX() - a.getX();
        y = b.getY() - a.getY();
        z = b.getZ() - a.getZ();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vector3D)) return false;
        Vector3D vector = (Vector3D) obj;
        return Double.compare(this.getX(), vector.getX()) == 0 &
                Double.compare(this.getY(), vector.getY()) == 0 &
                Double.compare(this.getZ(), vector.getZ()) == 0;
    }
}
