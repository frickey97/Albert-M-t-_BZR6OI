package Hullamvasutak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Vasut implements Comparable<Vasut>
{
    private String hullamvasut_neve;
    private String vilag_neve;
    private int legkisebb_magassag;
    private int varakozasi_ido;

    public Vasut(String hullamvasut_neve, String vilag_neve, int legkisebb_magassag, int varakozasi_ido) {
        this.hullamvasut_neve = hullamvasut_neve;
        this.vilag_neve = vilag_neve;
        this.legkisebb_magassag = legkisebb_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }

    public String getHullamvasut_neve() {
        return hullamvasut_neve;
    }

    public void setHullamvasut_neve(String hullamvasut_neve) {
        this.hullamvasut_neve = hullamvasut_neve;
    }

    public String getVilag_neve() {
        return vilag_neve;
    }

    public void setVilag_neve(String vilag_neve) {
        this.vilag_neve = vilag_neve;
    }

    public int getLegkisebb_magassag() {
        return legkisebb_magassag;
    }

    public void setLegkisebb_magassag(int legkisebb_magassag) {
        this.legkisebb_magassag = legkisebb_magassag;
    }

    public int getVarakozasi_ido() {
        return varakozasi_ido;
    }

    public void setVarakozasi_ido(int varakozasi_ido) {
        this.varakozasi_ido = varakozasi_ido;
    }

    @Override
    public String toString() {
        return getHullamvasut_neve() + " (" + getVilag_neve() + "): " + getVarakozasi_ido() + "\n";
    }

    @Override
    public int compareTo(Vasut o) {
        if(getVarakozasi_ido() == o.varakozasi_ido)
        {
            if(getLegkisebb_magassag() == o.getLegkisebb_magassag())
            {
                return getHullamvasut_neve().compareTo(o.hullamvasut_neve);
            }
            return o.legkisebb_magassag - getLegkisebb_magassag();
        }
        return getVarakozasi_ido() - o.varakozasi_ido;
    }
}

public class Hullamvasutak {
    public static void main(String[] args) {
        List<Vasut> vasut = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] sor = sc.nextLine().split(";");
            Vasut a = new Vasut(sor[0],sor[1],Integer.parseInt(sor[2]),Integer.parseInt(sor[3]));
            vasut.add(a);
        }

        Collections.sort(vasut);

        for (int i = 0; i < vasut.size(); i++) {
            System.out.println(vasut.get(i).getHullamvasut_neve() + " (" + vasut.get(i).getVilag_neve() + "): " + vasut.get(i).getVarakozasi_ido());
        }
    }
}
