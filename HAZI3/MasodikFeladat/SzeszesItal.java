package MasodikFeladat;

public class SzeszesItal extends Ital{
    private double alkoholTartalom;

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public SzeszesItal(double alkoholTartalom, String nev, String kiszereles, int ar) {
        super(nev, kiszereles, ar);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return this.alkoholTartalom + " alkoholtartalmu " + this.nev + ", " + this.kiszereles + ", " + this.ar;
    }
    
    
    
}
