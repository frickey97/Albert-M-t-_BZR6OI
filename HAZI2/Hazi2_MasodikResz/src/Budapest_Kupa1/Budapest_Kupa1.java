package Budapest_Kupa1;

import java.util.*;

class Verseny implements Comparable<Verseny>
{
    private int ev;
    private int honap;
    private int nap;
    private String tura_neve;
    private int tavolsag;

    public Verseny(int ev, int honap, int nap, String tura_neve, int tavolsag) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.tura_neve = tura_neve;
        this.tavolsag = tavolsag;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHonap() {
        return honap;
    }

    public void setHonap(int honap) {
        this.honap = honap;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public String getTura_neve() {
        return tura_neve;
    }

    public void setTura_neve(String tura_neve) {
        this.tura_neve = tura_neve;
    }

    public int getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(int tavolsag) {
        this.tavolsag = tavolsag;
    }

    @Override
    public int compareTo(Verseny o) {
        if(getEv() == o.ev)
        {
            if(getHonap() == o.honap)
            {
                if(getNap() == o.nap)
                {
                    return getTura_neve().compareTo(o.tura_neve);
                }
                return getNap() - o.nap;
            }
            return getHonap() - o.honap;
        }
        return getEv() - o.ev;
    }
}

class Eredmeny extends Verseny
{

    public Eredmeny(int ev, int honap, int nap, String tura_neve, int tavolsag) {
        super(ev, honap, nap, tura_neve, tavolsag);
    }

}

public class Budapest_Kupa1 {
    public static void main(String[] args) {

        List<Verseny> verseny = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max = 0;

        for (int i = 0; i < n; i++)
        {
            String[] sor = sc.nextLine().split(";");
            int osszeg = 0;
            for (int j = 4; j < sor.length; j++) {
                osszeg = Integer.parseInt(sor[j]) + osszeg;
                if(osszeg > max)
                    max = osszeg;
            }
            Verseny a = new Verseny(Integer.parseInt(sor[0]),Integer.parseInt(sor[1]),Integer.parseInt(sor[2]),sor[3],osszeg);

            verseny.add(a);
        }

        List<Eredmeny> eredmeny = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            int j = i;
            if(verseny.get(i).getTavolsag() == max)
            {
                Eredmeny e = new Eredmeny(verseny.get(i).getEv(), verseny.get(i).getHonap(), verseny.get(i).getNap(), verseny.get(i).getTura_neve(), verseny.get(i).getTavolsag());
                eredmeny.add(e);
            }

        }

        Collections.sort(eredmeny);

        for (int i = 0; i < eredmeny.size(); i++)
        {
            if(eredmeny.get(i).getHonap() < 10 && eredmeny.get(i).getNap() < 10)
            {
                System.out.println(eredmeny.get(i).getEv() + ";0" + eredmeny.get(i).getHonap() + ";0" + eredmeny.get(i).getNap() + ";" + eredmeny.get(i).getTura_neve());
            }else if(eredmeny.get(i).getHonap() < 10)
            {
                System.out.println(eredmeny.get(i).getEv() + ";0" + eredmeny.get(i).getHonap() + ";" + eredmeny.get(i).getNap() + ";" + eredmeny.get(i).getTura_neve());
            }else if(eredmeny.get(i).getNap() < 10)
            {
                System.out.println(eredmeny.get(i).getEv() + ";" + eredmeny.get(i).getHonap() + ";0" + eredmeny.get(i).getNap() + ";" + eredmeny.get(i).getTura_neve());
            }else
                System.out.println(eredmeny.get(i).getEv() + ";" + eredmeny.get(i).getHonap() + ";" + eredmeny.get(i).getNap() + ";" + eredmeny.get(i).getTura_neve());
        }


    }
}
