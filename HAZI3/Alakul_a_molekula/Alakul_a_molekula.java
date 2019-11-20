package Alakul_a_molekula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;

public class Alakul_a_molekula{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sor = input.nextLine();
        ArrayList<Molekula> molekulalista = new ArrayList<>();
        ArrayList<Elemek> elemlista = new ArrayList<>();
        while(!sor.equals("-")){
            String[] sorok = sor.split(":");
            elemlista.add(new Elemek(sorok[0], sorok[1]));
            sor = input.nextLine();
        }
        sor = input.nextLine();
        while(!sor.equals("")){
            String[] sorok = sor.split(":");
            String vegyjeleksor = sorok[1];
            String[] vegyjeleksorok = vegyjeleksor.split(",");
            ArrayList<String> vegyjellista = new ArrayList<>();
            Molekula aktualis = new Molekula(sorok[0], vegyjellista);
           for(int i=0; i<vegyjeleksorok.length; i++){
               aktualis.addLista(vegyjeleksorok[i]);
           }
            molekulalista.add(aktualis);
           
         sor = input.nextLine();   
        }
        
        for(int i=0; i<molekulalista.size(); i++){
            for(int j=0; j<molekulalista.get(i).getLista().size(); j++){
                for(int k=0; k<elemlista.size(); k++){
            if(elemlista.get(k).getVegyjel().compareTo(molekulalista.get(i).getLista().get(j))==0){
               
                molekulalista.get(i).getElemeklistaja().add(elemlista.get(k));
                }
                }
            }
        }
        eliminateDuplicates(molekulalista);
        Collections.sort(molekulalista);
        for(Molekula i:molekulalista){
            Collections.sort(i.getElemeklistaja());
            System.out.println(i);
        }
    }
    
    public static void eliminateDuplicates(ArrayList<Molekula> lista){
        for(int i=0; i<lista.size();i++){
            for(int j=0; j<lista.get(i).getElemeklistaja().size();j++){
                for(int k=j+1; k<lista.get(i).getElemeklistaja().size(); k++){
                if(lista.get(i).getElemeklistaja().get(k).getVegyjel().compareTo(lista.get(i).getElemeklistaja().get(j).getVegyjel())==0){
                    lista.get(i).getElemeklistaja().get(j).setHanybelole(lista.get(i).getElemeklistaja().get(j).getHanybelole()+1);
      
                    lista.get(i).getElemeklistaja().remove(k);
                }
                }
            }
        }
    }
}
class Molekula implements Comparable<Molekula>{
    private String molekulanev;
    private ArrayList<String> lista;
    private ArrayList<Elemek> elemeklistaja;

    public ArrayList<Elemek> getElemeklistaja() {
        return elemeklistaja;
    }

    public void setElemeklistaja(ArrayList<Elemek> elemeklistaja) {
        this.elemeklistaja = elemeklistaja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMolekulanev()).append(":\n");
        for(int i=0; i<this.getElemeklistaja().size(); i++){
            sb.append(this.getElemeklistaja().get(i).getHanybelole()).append(" ");
            sb.append(this.getElemeklistaja().get(i).getElemnev());
            if(i!=this.getElemeklistaja().size()-1)
            sb.append("\n");
            
        }
        return sb.toString();
    }
    public Molekula(String molekulanev, ArrayList<String> lista) {
        this.molekulanev = molekulanev;
        this.lista = lista;
        this.elemeklistaja=new ArrayList<>();
    }

    public String getMolekulanev() {
        return molekulanev;
    }

    public void setMolekulanev(String molekulanev) {
        this.molekulanev = molekulanev;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void addLista(String elem) {
        this.lista.add(elem);
    }

    @Override
    public int compareTo(Molekula o) {
      return this.getMolekulanev().compareTo(o.getMolekulanev());
    }
}

class Elemek implements Comparable<Elemek>{
    private String vegyjel;
    private String elemnev;
    private int hanybelole;

    public int getHanybelole() {
        return hanybelole;
    }

    public void setHanybelole(int hanybelole) {
        this.hanybelole = hanybelole;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        final Elemek other = (Elemek) obj;
        if (!Objects.equals(this.vegyjel, other.vegyjel)) {
            return false;
        }
        return true;
    }
    
    public Elemek(String vegyjel, String elemnev) {
        this.vegyjel = vegyjel;
        this.elemnev = elemnev;
        this.hanybelole=1;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getElemnev() {
        return elemnev;
    }

    public void setElemnev(String elemnev) {
        this.elemnev = elemnev;
    }

    @Override
    public String toString() {
        return hanybelole + " " + elemnev;
    }

    @Override
    public int compareTo(Elemek o) {
        if(this.hanybelole<o.getHanybelole()){
            return 1;
        }
        else if(this.hanybelole>o.getHanybelole()){
            return -1;
        }
        else
            return this.getElemnev().compareTo(o.getElemnev());
    }
}
