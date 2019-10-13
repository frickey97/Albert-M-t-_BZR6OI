package VendeglatoipariEgyseg;

import java.util.Arrays;

public class VendeglatoipariEgyseg {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendeglatoipariEgyseg(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public VendeglatoipariEgyseg(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    @Override
    public String toString() {
        return "VendeglatoipariEgyseg{" +
                "nev='" + nev + '\'' +
                ", ferohelyekSzama=" + ferohelyekSzama +
                ", dohanyzo=" + dohanyzo +
                '}';
    }
}

class Etterem extends VendeglatoipariEgyseg
{
    private String[] etlap;

    public Etterem(String nev, int ferohelyekSzama, boolean dohanyzo, String[] etlap) {
        super(nev, ferohelyekSzama, dohanyzo);
        setDohanyzo(false);
        this.etlap = etlap;
    }

    public Etterem(boolean dohanyzo) {
        super(dohanyzo = false );
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem{" +
                "etlap=" + Arrays.toString(etlap) +
                '}';
    }
}

class Kocsma extends VendeglatoipariEgyseg
{
    private String[] sorlap;

    public Kocsma(String nev, int ferohelyekSzama, boolean dohanyzo, String[] sorlap) {
        super(nev, ferohelyekSzama, dohanyzo = true);
        this.sorlap = sorlap;
    }

    public Kocsma(boolean dohanyzo) {
        super(dohanyzo = false);
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" +
                "sorlap=" + Arrays.toString(sorlap) +
                '}';
    }
}
