package Karacsonyi_hozzavalok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Karacsonyi_hozzavalok {
    public static void main(String[] args) {
        List<Hozzavalok> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            /*if(s.equals("0"))
                break;*/
            String[] sor = s.split(";");
            Hozzavalok a = new Hozzavalok(sor[0], Integer.parseInt(sor[1]));
            
            if(!lista.contains(a))
                lista.add(a);
            else
            {
                int index = lista.indexOf(a);
                lista.get(index).setDb(lista.get(index).getDb() + Integer.parseInt(sor[1]));
            }
        }
        
        Collections.sort(lista);
        
        for(Hozzavalok item: lista)
        {
            System.out.println(item);
        }
        
    }
}

class Hozzavalok implements Comparable<Hozzavalok>
{
    private String nev;
    private int db;

    public Hozzavalok(String nev, int db) {
        this.nev = nev;
        this.db = db;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || !(obj instanceof Hozzavalok)) 
            return false;
        
        Hozzavalok h = (Hozzavalok)obj;
        
        return this.nev.equals(h.getNev());
    }
    
    

    @Override
    public int compareTo(Hozzavalok obj) {
        if(this.db == obj.getDb())
        {
            return this.nev.compareTo(obj.getNev());
        }
        return obj.getDb() - this.db;
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.db;
    } 
}
