//package Osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Osztalypenz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Penz> lista = new ArrayList();
        
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            /*if(s.equals("0"))
                break;*/
            
            String[] sor = s.split(";");
            Penz a = new Penz(sor[0], Integer.parseInt(sor[1]));
            
            if(!lista.contains(a))
            {
                lista.add(a);
            }else
            {
                int index = lista.indexOf(a);
                lista.get(index).setForint(lista.get(index).getForint() + Integer.parseInt(sor[1]));
            }
        }
        
        Collections.sort(lista);
        
        for(Penz item: lista)
        {
            System.out.println(item);
        }
        
    }
}

class Penz implements Comparable<Penz>
{
    private String nev;
    private int forint;

    public Penz(String nev, int forint) {
        this.nev = nev;
        this.forint = forint;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getForint() {
        return forint;
    }

    public void setForint(int forint) {
        this.forint = forint;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || !(obj instanceof Penz))
            return false;
        
        Penz p = (Penz)obj;
        
        return this.nev.equals(p.getNev());  
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.forint;
    }

    @Override
    public int compareTo(Penz obj) {
        if(this.forint == obj.getForint())
            return this.nev.compareTo(obj.getNev());
        return obj.getForint() - this.forint;
    }
    
    
    
    
}
