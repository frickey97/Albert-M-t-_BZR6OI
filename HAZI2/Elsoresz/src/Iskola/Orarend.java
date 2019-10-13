package Iskola;

import java.util.Arrays;

public class Orarend{
    private int napi_oraszam;
    private Ora[] tanorak = new Ora[12];
    private String nap;

    public Orarend() {
        this.napi_oraszam = 0;
    }

    public Orarend(String nap) {
        this.nap = nap;
    }

    public int getNapi_oraszam() {
        return napi_oraszam;
    }

    public void setNapi_oraszam(int napi_oraszam) {
        this.napi_oraszam = napi_oraszam;
    }

    public Ora[] getTanorak() {
        return tanorak;
    }

    public void setTanorak(Ora[] tanorak) {
        this.tanorak = tanorak;
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    @Override
    public String toString() {
        return "Orarend{" +
                "napi_oraszam=" + napi_oraszam +
                ", tanorak=" + Arrays.toString(tanorak) +
                ", nap='" + nap + '\'' +
                '}';
    }
}
