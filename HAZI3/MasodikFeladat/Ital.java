package MasodikFeladat;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return this.nev + "," + this.kiszereles + "," + this.ar + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital))
            return false;
        
        Ital ital = (Ital)obj;
        
        if(this.nev.equals(ital.getNev()) && this.kiszereles.equals(ital.getKiszereles()))
            return true;
        return false;
    }

    @Override
    public int compareTo(Ital obj) {
        return this.ar - obj.getAr();
    }  
    
}
