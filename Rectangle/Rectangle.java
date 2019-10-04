package Rectangle;

public class Rectangle {

    public double width;
    public double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Szelesseg: " + this.width + "\nMagassag: " + this.height +
                "\nTerulet: " + getArea() + "\nKerulet: " + getPerimeter();
    }
}
