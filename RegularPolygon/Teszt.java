package RegularPolygon;

public class Teszt {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6,4);
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println(r1 + "\n");
        System.out.println(r2 + "\n");
        System.out.println(r3);

    }
}
