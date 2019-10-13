package GeometricShape;

import java.util.Date;

public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\n" +
                "color: " + color + " and filled: " +
                filled;
    }
}

class Circle extends GeometricShape
{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * (getRadius() * getRadius());
    }

    public double getPerimeter()
    {
        return 2 * (Math.PI * getRadius());
    }

    public double getDiameter()
    {
        return 2 * getRadius();
    }
}

class Rectangle extends GeometricShape
{
    private double width;
    private double heigth;

    public Rectangle() {
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getArea()
    {
        return getWidth() * getHeigth();
    }

    public double getPerimeter()
    {
        return 2 * ( getWidth() + getHeigth());
    }
}
