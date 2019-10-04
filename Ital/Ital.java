package Ital;

import java.util.Date;

public class Ital {

    protected String nev;
    protected String kiszereles;
    private static int ar = 10;
    protected Date gyartasiDatum;

    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date();
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    @Override
    public String toString() {
        return this.nev + ", " + this.kiszereles + ", " + getAr() + " Ft";
    }

    @Override
    public boolean equals(Object obj) {
        return (((Ital)obj).equals(this.nev) && ((Ital)obj).equals(this.kiszereles) && ((Ital)obj).equals(getAr()));
    }

    public static double getArEuro(int szam) {
        return getAr() * szam;
    }
}
