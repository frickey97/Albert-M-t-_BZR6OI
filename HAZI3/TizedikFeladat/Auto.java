package TizedikFeladat;

import java.util.List;

public class Auto implements Comparable<Auto>
{
    public boolean Rendszam_ellenorzo(String a)
    {
        if(a.length() < 6)
            return false;
        for (int i = 0; i < 3; i++) {
            if(!Character.isAlphabetic(a.charAt(i)))
                return false;
        }
        for (int i = 3; i < 6; i++) {
            if(!Character.isDigit(a.charAt(i)))
                return false;
        }
        return true;
    }

    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private List<String> extrák;

    public List<String> getExtrák() {
        return extrák;
    }

    public void setExtrák(List<String> extrák) {
        this.extrák = extrák;
    }

    public Auto(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return this.rendszám + ", " + this.teljesítmény + ", " + this.automata;
    }

    @Override
    public boolean equals(Object o) {
        if(null == o || !(o instanceof Auto))
            return false;

        Auto a = (Auto)o;

        return this.rendszám.equals(a.getRendszám());
    }

    @Override
    public int compareTo(Auto obj) {
        return this.teljesítmény - obj.getTeljesítmény();
    }
}

class Teherauto extends Auto
{
    private int kg;

    public Teherauto(String rendszám, int teljesítmény, boolean automata, int kg) {
        super(rendszám, teljesítmény, automata);
        this.kg = kg;
    }

    @Override
    public String toString() {
        return this.getRendszám() + ", " + this.getTeljesítmény() + ", " + this.getRendszám() + ", " + this.kg;
    }
}