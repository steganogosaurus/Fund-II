public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(72.0,"Green");
        System.out.println(c1.toString());
        System.out.printf("The circle has Area of %.2f\n\n",c1.getArea());
        Circle c2 = new Circle(2.0,"Blue");
        System.out.println(c2.toString());
        System.out.printf("The circle has Area of %.2f",c2.getArea());
    }
}
