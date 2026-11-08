
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //tao ds diem

        ArrayList<Point2D> pointList = new ArrayList<>();

        // Tao diem 2d
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(4, 6);
        Point2D p3 = new Point2D(7, 8);

        // Tao diem 3d
        Point3D p4 = new Point3D(1, 2, 3);
        Point3D p5 = new Point3D(4, 6, 8);
        Point3D p6 = new Point3D(7, 8, 10);

        // ds chung
        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);
        pointList.add(p4);
        pointList.add(p5);
        pointList.add(p6);


        // danh sach luc dau

        System.out.println("========== DANH SACH DIEM BAN DAU ==========");

        for (Point2D point : pointList) {
            System.out.println(point);
        }


        // danh sach 2d va 3d

        ArrayList<Point2D> list2D = new ArrayList<>();
        ArrayList<Point3D> list3D = new ArrayList<>();

        for (Point2D point : pointList) {

            if (point instanceof Point3D) {
                list3D.add((Point3D) point);
            } else {
                list2D.add(point);
            }
        }


        // tong 3d

        double totalDistance2D = 0;

        for (int i = 0; i < list2D.size() - 1; i++) {

            double distance = list2D.get(i)
                    .distanceTo(list2D.get(i + 1));

            totalDistance2D += distance;
        }

        System.out.println("\n========== KHOANG CACH 2D ==========");

        System.out.printf("Tong khoang cach 2D: %.2f%n",
                totalDistance2D);


        //tinh tong 3d

        double totalDistance3D = 0;

        for (int i = 0; i < list3D.size() - 1; i++) {

            double distance = list3D.get(i)
                    .distanceTo(list3D.get(i + 1));

            totalDistance3D += distance;
        }

        System.out.println("\n========== KHOANG CACH 3D ==========");

        System.out.printf("Tong khoang cach 3D: %.2f%n",
                totalDistance3D);


        // tao diem doi xung

        ArrayList<Point2D> symmetricList = new ArrayList<>();

        for (Point2D point : pointList) {

            Point2D symmetricPoint = point.symmetric();

            symmetricList.add(symmetricPoint);
        }


        // dua diem vao ds doi xung

        pointList.addAll(symmetricList);


        // hien thi danh sach diem

        System.out.println("\n========== DANH SACH SAU KHI THEM DIEM DOI XUNG ==========");

        for (int i = 0; i < pointList.size(); i++) {

            System.out.println("Diem " + (i + 1) + ": "
                    + pointList.get(i));
        }


        // Kiem tra

        Point2D test2D = new Point2D(2, 3);

        test2D.translate(5, 4);

        System.out.println("\n========== KIEM TRA TINH TIEN 2D ==========");
        System.out.println("Sau khi tinh tien: " + test2D);

        Point3D test3D = new Point3D(2, 3, 4);

        test3D.translate(5, 4, 6);

        System.out.println("\n========== KIEM TRA TINH TIEN 3D ==========");
        System.out.println("Sau khi tinh tien: " + test3D);

    }
}
