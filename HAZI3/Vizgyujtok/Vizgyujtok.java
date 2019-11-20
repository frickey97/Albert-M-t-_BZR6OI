package Vizgyujtok;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Vizgyujtok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Gyujto> lista = new ArrayList();
        
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            if(s.equals("0"))
                break;
            
            String[] sor = s.split(";");
            if(sor.length > 1)
            {
                Gyujto a = new Gyujto(sor[1]);
            
                if(!lista.contains(a))
                {
                    lista.add(a);
                }else
                {
                    int index = lista.indexOf(a);

                    lista.get(index).setDb(lista.get(index).getDb() + 1);
                }
            }
          
        }
        
        for(Gyujto item: lista)
        {
            System.out.println(item);
        }
    }
}

class Gyujto
{
    private String nev;
    private int db;
    private List<Gyujto> befolyo;

    public Gyujto(String nev) {
        this.nev = nev;
        this.db = 1;
        this.befolyo = new ArrayList();
    }

    public String getNev() {
        return nev;
    }

    public int getDb() {
        return db;
    }

    public List<Gyujto> getBefolyo() {
        return befolyo;
    }

        public void setNev(String nev) {
            this.nev = nev;
        }

        public void setDb(int db) {
            this.db = db;
        }

        public void setBefolyo(List<Gyujto> befolyo) {
            this.befolyo = befolyo;
        }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || !(obj instanceof Gyujto))
            return false;
        
        Gyujto gy = (Gyujto)obj;
        
        return this.nev.equals(gy.getNev());
    }
    
    @Override
    public String toString()
    {
        return this.nev + ": " + this.db;
    }
    
    
}