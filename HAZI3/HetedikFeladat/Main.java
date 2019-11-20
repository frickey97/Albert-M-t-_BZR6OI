package HetedikFeladat;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Lakohaz> tagasLakohazak(ArrayList<Lakohaz> li, double num){
        ArrayList<Lakohaz> returnlist = new ArrayList<>();
        for(int i=0; i<li.size(); i++){
            if(li.get(i).legkobmeter()>num){
                returnlist.add(li.get(i));
            }
                
            }
        return returnlist;
    }

    public static void main(String[] args) {
        ArrayList<Lakohaz> lista = new ArrayList<>();
        lista.add(new Lakohaz("Budapest", 3, 30));
        lista.add(new Lakohaz("Szeged", 3, 38));
        lista.add(new Lakohaz("Budapest", 3, 40));
        lista.add(new Lakohaz("Szeged", 2, 45));
        lista.add(new Lakohaz("Debrecen", 3, 40));
        lista.add(new Lakohaz("Budapest", 5, 35));
        lista.add(new Lakohaz("Budapest", 3, 39));
        lista.add(new Lakohaz("Szeged", 3, 33));
        lista.add(new Lakohaz("Bécs", 4, 34));
        lista.add(new Lakohaz("Aszód", 10, 35));
        
        ArrayList<Lakohaz> lista2 = tagasLakohazak(lista, 350);
        Collections.sort(lista2);
        for(Lakohaz item: lista2){
            System.out.println(item);
        }
    }
}
