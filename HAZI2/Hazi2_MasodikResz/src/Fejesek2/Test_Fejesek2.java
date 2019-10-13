package Fejesek2;

import java.util.Arrays;
import java.util.Scanner;

class Fejesek_2 {
    String nev;
    String elozo;
    String sapka;

    public Fejesek_2(String nev, String elozo, String sapka) {
        this.nev = nev;
        this.elozo = elozo;
        this.sapka = sapka;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getElozo() {
        return elozo;
    }

    public void setElozo(String elozo) {
        this.elozo = elozo;
    }

    public String getSapka() {
        return sapka;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

}

public class Test_Fejesek2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sor = sc.nextLine().split(";");

        Fejesek_2[] diak = new Fejesek_2[Integer.parseInt(sor[0])];

        Fejesek_2[] seged = new Fejesek_2[1];

        diak[0] = new Fejesek_2(sor[1],"", "piros");
        String kit = sor[2];

        for (int i = 1; i < diak.length; i++) {
            sor = sc.nextLine().split(";");
            diak[i] = new Fejesek_2(sor[0], sor[1], "");
        }


        for (int i = 1; i < diak.length; i++) {
            for (int j = 1; j < diak.length; j++) {
                if(diak[i - 1].getNev().equals(diak[j].getElozo()))
                {
                    if(i % 2 == 0 && i != diak.length-1)
                    {
                        seged[0] = new Fejesek_2(diak[i].getNev(),diak[i].getElozo(),"");
                        diak[i] = new Fejesek_2(diak[j].getNev(),diak[i - 1].getNev(),"piros");
                        diak[j] = seged[0];
                    }else if(i % 2 == 0)
                    {
                        diak[i] = new Fejesek_2(diak[j].getNev(),diak[i - 1].getNev(),"piros");
                    }else if(i % 2 == 1 && i != diak.length-1)
                    {
                        seged[0] = new Fejesek_2(diak[i].getNev(),diak[i].getElozo(),"");
                        diak[i] = new Fejesek_2(diak[j].getNev(),diak[i - 1].getNev(),"kek");
                        diak[j] = seged[0];
                    }else
                    {
                        diak[i] = new Fejesek_2(diak[j].getNev(),diak[i - 1].getNev(),"kek");
                    }
                    break;
                }
            }
        }

        int piros_sapka = 0, kek_sapka = 0;
        int i = 0;

        while(!diak[i].getNev().equals(kit))
        {
            if(i % 2 == 0)
                piros_sapka++;
            else
                kek_sapka++;
            i++;
        }

        System.out.println(piros_sapka + " " + kek_sapka);
    }
}
