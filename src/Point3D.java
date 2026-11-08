
public class Point3D extends Point2D {

    private double z;

    // Constructor
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // tinh khoang cach 2 diem 3d
    public double distanceTo(Point3D other) {
        double dx = this.getX() - other.getX();
        double dy = this.getY() - other.getY();
        double dz = this.z - other.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // ghi de pt doi xưng
    @Override
    public Point3D symmetric() {
        return new Point3D(
            -this.getX(),
            -this.getY(),
            -this.z
        );
    }

    // tinh tien diem theo dx, dy, dz
    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

    // ghi de pt
    @Override
    public String toString() {
        return "Point3D(x=" + getX()
                + ", y=" + getY()
                + ", z=" + z + ")";
    }
}
