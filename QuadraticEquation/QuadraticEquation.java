package QuadraticEquation;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - (4 * (this.a * this.c));
    }

    public double getRoot1(){
        if(getDiscriminant() < 0)
        {
            return 0;
        }
        return ((-this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * (this.a * this.c)))) / (2 * this.a);
    }

    public double getRoot2(){
        if(getDiscriminant() < 0)
        {
            return 0;
        }
        return ((-this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * (this.a * this.c)))) / (2 * this.a);
    }

    @Override
    public String toString() {
        if(getDiscriminant() > 0)
            return "Gyokei: x: " + this.getRoot1() + " y: " + this.getRoot2();
        else if(getDiscriminant() == 0)
            return "Kozosgyok: " + this.getRoot1();
        return "The equation has no roots.";
    }
}
