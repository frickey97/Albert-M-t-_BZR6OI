package GeometricShape;

public class TestTrinagle {
    public static void main(String[] args) {
        Trinagle trinagle = new Trinagle(1, 1.5,1);
        trinagle.setColor("yellow");
        trinagle.setFilled(true);

        System.out.println("Terulete: " + trinagle.getArea() + "\n" +
                           "Kerulete: " + trinagle.getPerimeter() + "\n" +
                           "Szine: " + trinagle.getColor() + "\n" +
                           "Toltottsege: " + trinagle.isFilled());
    }
}
