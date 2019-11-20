package ElsoFeladat;

public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int puttonySzam, String szoloFajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(szoloFajta, termoTerulet, iz, alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }    
}
