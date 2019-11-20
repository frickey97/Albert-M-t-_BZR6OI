package Zarthelyi_eredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zarthelyi_eredmenyek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Eredmenyek> lista = new ArrayList();
        
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            /*if(s.equals("0"))
                break;*/
            String[] sor = s.split(";");
            
            Eredmenyek a = new Eredmenyek(sor[0], Integer.parseInt(sor[1]));
            
            if(!lista.contains(a))
                lista.add(a);
            else
            {
                int index = lista.indexOf(a);
                lista.get(index).setPont(lista.get(index).getPont() + Integer.parseInt(sor[1]));
            }
        }
        
        Collections.sort(lista);
        
        for(Eredmenyek item : lista)
        {
            System.out.println(item);
        }
    }
}

class Eredmenyek implements Comparable<Eredmenyek>
{
    private String nev;
    private int pont;

    public Eredmenyek(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || ! (obj instanceof Eredmenyek))
            return false;
        
        Eredmenyek e = (Eredmenyek)obj;
        
        return this.nev.equals(e.getNev());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.nev).append(": ").append(this.pont).append(" pont");
        
        return sb.toString();
    }

    @Override
    public int compareTo(Eredmenyek obj) {
        if(this.pont == obj.getPont())
        {
            return this.nev.compareTo(obj.getNev());
        }
        return obj.getPont() - this.pont;
               
    }
}
