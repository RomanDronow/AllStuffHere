package pointsandvectors;

public class Point3D {

    private double x, y, z;

    public Point3D(){}

    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
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

    @Override
    public String toString(){
        return "("+x+", "+y+", "+z+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point3D)) return false;
        Point3D point = (Point3D) obj;
        return Double.compare(this.getX(), point.getX()) == 0 &
                Double.compare(this.getY(), point.getY()) == 0 &
                Double.compare(this.getZ(), point.getZ()) == 0;
    }
}
