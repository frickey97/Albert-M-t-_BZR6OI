package HatodikFeladat;

import HatodikFeladat.zh.Dolgozat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beolvas = Integer.parseInt(sc.nextLine());
        Hallgato[] hallgato = new Hallgato[beolvas];
        boolean kapcsolo = false;

        for (int i = 0; i < beolvas; i++)
        {
            String[] sor = sc.nextLine().split(" ");
            int szam = Integer.parseInt(sor[0]);
            String valasz = sor[1];
            if(valasz.equals("igen"))
                kapcsolo = true;
            if(valasz.equals("hamis"))
                kapcsolo = false;
            hallgato[i] = new Hallgato(szam,kapcsolo);
        }

        for (int i = 0; i < hallgato.length; i++)
        {
            Dolgozat d1 = (Dolgozat) hallgato[i].dolgozatotIr();
            Dolgozat d2 = (Dolgozat) hallgato[i].dolgozatotIr();
            if(d1.megfelelt() && d2.megfelelt())
                System.out.println("megfelelt");
            else
                System.out.println("nem felelt meg");
        }
    }
}
