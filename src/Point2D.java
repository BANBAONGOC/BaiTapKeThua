
public class Point2D {

    // khai bao thuoc tinh
    // encapsulation
    private double x;
    private double y;

    // Constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // tim khoang cách 2 diem 2d
    public double distanceTo(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // tim doi xưng toa do diem
    public Point2D symmetric() {
        return new Point2D(-this.x, -this.y);
    }

    // tinh do lech
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // hien thi diem
    @Override
    public String toString() {
        return "Point2D(x=" + x + ", y=" + y + ")";
    }
}
