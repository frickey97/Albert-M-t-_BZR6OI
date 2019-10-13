package GeometricShape;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println(System.getProperty("line.separator") + "A rectangle " +
                rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
