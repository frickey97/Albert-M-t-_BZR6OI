package Jegkoronogmerkozesek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jegkorongmerkozesek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Meccsek> lista = new ArrayList();
        
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            /*if(s.equals("0"))
                break;*/
            String[] sor = s.split(":");
            String[] csapatok = sor[0].split("-");           
            String[] merkozesek = sor[1].split(",");
            int A_csapat_goljai = 0;
            int B_csapat_goljai = 0;
            int A_osszes = 0;
            int B_osszes = 0;

            Meccsek c = new Meccsek(csapatok[0]);
            Meccsek d = new Meccsek(csapatok[1]);

            for (int i = 0; i < merkozesek.length; i++)
            {
                String[] eredmeny = merkozesek[i].split("-");
                A_csapat_goljai = Integer.parseInt(eredmeny[0]);
                B_csapat_goljai = Integer.parseInt(eredmeny[1]);
                
                A_osszes = A_csapat_goljai + A_osszes;
                B_osszes = B_csapat_goljai + B_osszes;
                
                Meccsek a = new Meccsek(csapatok[0],A_csapat_goljai);
                Meccsek b = new Meccsek(csapatok[1],B_csapat_goljai);

                if(!lista.contains(a))
                {
                    lista.add(a);
                }else
                {
                    int index = lista.indexOf(a);
                    lista.get(index).setGolok(lista.get(index).getGolok() + A_csapat_goljai);
                }
                
                if(!lista.contains(b))
                {
                    lista.add(b);
                }else
                {
                    int index = lista.indexOf(b);
                    lista.get(index).setGolok(lista.get(index).getGolok() + B_csapat_goljai);
                }
            } 
            if(merkozesek.length == 3)
            {
                if(A_osszes > B_osszes)
                {
                    int index = lista.indexOf(c);
                    lista.get(index).setPontok(lista.get(index).getPontok()+ 3);
                }else
                {
                    int index = lista.indexOf(d);
                    lista.get(index).setPontok(lista.get(index).getPontok()+ 3);
                }
            }else
            {
                if(A_osszes > B_osszes)
                {
                    int index = lista.indexOf(c);
                    lista.get(index).setPontok(lista.get(index).getPontok()+ 2);
                    int index2 = lista.indexOf(d);
                    lista.get(index2).setPontok(lista.get(index2).getPontok()+ 1);
                }else
                {
                    int index = lista.indexOf(d);
                    lista.get(index).setPontok(lista.get(index).getPontok()+ 2);
                    int index2 = lista.indexOf(c);
                    lista.get(index2).setPontok(lista.get(index2).getPontok()+ 1);
                }
            }
        }
        
        Collections.sort(lista);
        
        for(Meccsek item: lista)
        {
            System.out.println(item);
        }
    }
}

class Meccsek implements Comparable<Meccsek>
{
    private String nev;
    private int pontok;
    private int golok;

    public Meccsek(String nev) {
        this.nev = nev;
    }
    
    public Meccsek(String nev, int golok) {
        this.nev = nev;
        this.golok = golok;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPontok() {
        return pontok;
    }

    public void setPontok(int pontok) {
        this.pontok = pontok;
    }

    public int getGolok() {
        return golok;
    }

    public void setGolok(int golok) {
        this.golok = golok;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || !(obj instanceof Meccsek))
            return false;
        
        Meccsek m = (Meccsek)obj;
        
        return this.nev.equals(m.getNev());
    }

    @Override
    public String toString() {
        return this.nev + ": " + this.pontok + " points (" + this.golok + " scored goals)";
    }

    @Override
    public int compareTo(Meccsek obj) 
    {
        if(this.pontok == obj.getPontok())
        {
            if(this.golok == obj.getGolok())
            {
                return this.nev.compareTo(obj.getNev());
            }
            return obj.getGolok() - this.golok;
        }
        return obj.getPontok() - this.pontok;
    }
    
    

    
    
    
}