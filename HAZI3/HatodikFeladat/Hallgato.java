package HatodikFeladat;

import HatodikFeladat.zh.Dolgozat;
import java.util.Random;

public class Hallgato
{
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public Dolgozat dolgozatotIr()
    {
        int elment = (int) ((Math.random()*51) + 1);
        if(elment != 1) {
            int random_sokat = (int) (Math.random() * 8) + 4;
            int pontszam_sokat = random_sokat * this.mennyitKeszult;

            int random_keveset = (int) (Math.random() * 6) + 0;
            int pontszam_keveset = random_keveset * this.mennyitKeszult;

            if (this.sokatTanul) {
                return new Dolgozat(pontszam_sokat);
            } else
                return new Dolgozat(pontszam_keveset);
        }else
            return new Dolgozat(-1);
    }
}