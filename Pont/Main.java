package Pont;

public class Main
{
    public static void main(String[] args) {
        Pont p1 = new Pont(1,2.1);
        Pont p2 = new Pont(5,7.6);

        p1.setY(p1.getY() + 5);
        p2.setY(p2.getY() + 5);
        p1.setX(p1.getX() - 3.4);
        p2.setX(p2.getX() - 3.4);

        System.out.println("Pont1: x:" + p1.getX() + " y:" + p1.getY() + "\nPont2: x:" + p2.getX() + " y:" + p2.getY());

    }
}
