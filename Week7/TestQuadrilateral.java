public class TestQuadrilateral {
    public static void main(String[] args) {
        Point p0 = new Point(1,1);
        Point p1 = new Point(1,4);
        Point p2 = new Point(4,1);
        Point p3 = new Point(4,4);
        Square square = new Square(p0,p1,p2,p3);
        System.out.println("The Square Area is " + square.getArea());
        Point p4 = new Point(0,0);
        Point p5 = new Point(3,0);
        Point p6 = new Point(0,6);
        Point p7 = new Point(3,6);
        Rectangle rectangle = new Rectangle(p4,p5,p6,p7);
        System.out.println("The Rectangle Area is " + rectangle.getArea());
        Point p8 = new Point(1,1);
        Point p9 = new Point(11,1);
        Point p10 = new Point(3,9);
        Point p11 = new Point(12,9);
        Parallelogram parallelogram = new Parallelogram(p8,p9,p10,p11);
        System.out.println("The Parallelograme Area is " + parallelogram.getArea());
        Point p12 = new Point(2,2);
        Point p13 = new Point(2,4);
        Point p14 = new Point(5,4);
        Point p15 = new Point(9,2);
        Trapezoid trapezoid = new Trapezoid(p12,p13,p14,p15);
        System.out.println("The Trapezoid Area is " + trapezoid.getArea());
    }
}
