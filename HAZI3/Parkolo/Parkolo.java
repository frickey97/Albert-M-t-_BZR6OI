package Parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parkolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Helyszin> lista = new ArrayList();
        
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            /*if(s.equals("0"))
                break;*/
            String[] sor = s.split(";");
            
            int kulonbseg = Integer.parseInt(sor[2]) - sor.length + 3;
            
            if(kulonbseg >= 3)
            {
                Helyszin a = new Helyszin(kulonbseg, sor[0]);
                
                lista.add(a);
            }
        }
        
        Collections.sort(lista);
        
        for(Helyszin item: lista)
        {
            System.out.println(item);
        }
        
    }
}

class Helyszin implements Comparable<Helyszin>
{
    private int hely;
    private String varos;

    public Helyszin(int hely, String varos) {
        this.hely = hely;
        this.varos = varos;
    }

    public int getHely() {
        return hely;
    }

    public void setHely(int hely) {
        this.hely = hely;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    @Override
    public String toString() {
        return this.varos + ": " + this.hely + " szabad hely";
    }

    @Override
    public int compareTo(Helyszin obj) {
        if(this.hely == obj.getHely())
            return this.varos.compareTo(obj.getVaros());
        return obj.getHely() - this.hely;
    }
    
    
}