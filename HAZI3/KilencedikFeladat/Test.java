package KilencedikFeladat;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void kiir(ArrayList<Hatizsak> a)
    {
        Collections.sort(a);

        for(Hatizsak item: a)
        {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Hatizsak> lista = new ArrayList<>();

        lista.add(new Hatizsak("ASD",10,3,true));
        lista.add(new Hatizsak("Valami",43,8,false));
        lista.add(new Hatizsak("Batyu",32,5,true));
        lista.add(new Hatizsak("Budmil",9,2,true));
        lista.add(new Hatizsak("Taska",50,10,false));
        lista.add(new Hatizsak("Cropp",5,1,true));
        lista.add(new Hatizsak("Nike",8,2,false));
        lista.add(new Hatizsak("Adidas",24,4,true));
        lista.add(new Hatizsak("DSA",35,8,false));
        lista.add(new Hatizsak("Valami",15,7,true));

        kiir(lista);
    }
}
