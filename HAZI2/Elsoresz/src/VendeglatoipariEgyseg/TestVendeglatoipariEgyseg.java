package VendeglatoipariEgyseg;

import java.util.ArrayList;
import java.util.List;

public class TestVendeglatoipariEgyseg {

    public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] t) {

        List<Kocsma> kocsmakListaja = new ArrayList<>();

        for (int i = 0; i < t.length; i++) {

            if (t[i] instanceof Kocsma ) {

                String[] Kocsmam = ((Kocsma) t[i]).getSorlap();

                for (int j = 0; j < Kocsmam.length; j++) {

                    if (Kocsmam[j].equals(ital)) {
                        kocsmakListaja.add((Kocsma) t[i]);
                    }
                }
            }
        }

        Kocsma[] kocsmakItallal = new Kocsma[kocsmakListaja.size()];


        for (int i = 0; i < kocsmakListaja.size(); i++) {

            kocsmakItallal[i] = kocsmakListaja.get(i);
        }


        return kocsmakItallal;

    }

    public static void main(String[] args) {
        VendeglatoipariEgyseg[] vendeglatoipariEgyseg = new VendeglatoipariEgyseg[4];
        Etterem[] EttermekLista = new Etterem[2];
        Kocsma[] KocsmakLista = new Kocsma[2];

        String[] etlap1 = {"alma", "korte", "barack"};
        String[] etlap2 = {"halaszle", "porkolt", "husleves"};

        String[] sorlap1 = {"borsodi", "dreher", "tuborg"};
        String[] sorlap2 = {"dreher", "stella artois", "kobanyai"};
        vendeglatoipariEgyseg[0] = new Etterem("Nagyerdei Etterem", 300, false, etlap1);

        vendeglatoipariEgyseg[0] = new Etterem(EttermekLista[0].getNev(),
                EttermekLista[0].getFerohelyekSzama(), EttermekLista[0].isDohanyzo() , etlap1);

        vendeglatoipariEgyseg[1] = new Etterem(EttermekLista[1].getNev(),
                EttermekLista[1].getFerohelyekSzama(), EttermekLista[1].isDohanyzo() , etlap2);


        vendeglatoipariEgyseg[2] = new Kocsma(KocsmakLista[0].getNev(),
                KocsmakLista[0].getFerohelyekSzama(), KocsmakLista[0].isDohanyzo() , sorlap1);

        vendeglatoipariEgyseg[3] = new Kocsma(KocsmakLista[1].getNev(),
                KocsmakLista[1].getFerohelyekSzama(), KocsmakLista[1].isDohanyzo() , sorlap2);


        for ( Kocsma  elem :adottItaltKinaloKocsmak("tuborg", vendeglatoipariEgyseg)
        ) {

            System.out.println(elem.getNev());
        }
    }
}
