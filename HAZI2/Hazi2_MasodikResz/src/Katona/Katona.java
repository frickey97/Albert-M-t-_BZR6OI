package Katona;

import java.util.Objects;

public class Katona {
    private int tamadoero;
    private int vedoero;

    public Katona() {
        tamadoero = (int)5.5;
        vedoero = (int)5.5;
    }

    public Katona(int tamadoero, int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    @Override
    public String toString() {
        return "TE: [" + getTamadoero() + "], VE: [" + getVedoero() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(this.getTamadoero()) && obj.equals(this.getVedoero());
    }
}

class Nyilas extends Katona
{
    private int lotav;

    public Nyilas(int tamadoero, int vedoero, int lotav) {
        super(tamadoero, vedoero);
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public int getTamadoero() {
        return super.getTamadoero() + getLotav();
    }

    @Override
    public String toString() {
        return "Nyilas: TE: [" + getTamadoero() + "], VE: [" + getVedoero() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(this.getTamadoero()) && obj.equals(this.getVedoero()) && obj.equals(this.getLotav());
    }
}

class Landzsas extends Katona
{
    private int lotav;

    public Landzsas(int tamadoero, int vedoero, int lotav) {
        super(tamadoero, vedoero);
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public int getTamadoero() {
        return super.getTamadoero() + getLotav();
    }

    @Override
    public String toString() {
        return "Landzsas: TE: [" + getTamadoero() + "], VE: [" + getVedoero() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(this.getTamadoero()) && obj.equals(this.getVedoero()) && obj.equals(this.getLotav());
    }
}
