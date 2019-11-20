package TizedikFeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static List<Teherauto> Husz_plusz(Auto[] a)
    {
        List<Teherauto> lista = new ArrayList();
        for (int i = 0; i < a.length; i++)
        {
            Teherauto t = (Teherauto)a[i];
            if(a[i] instanceof Teherauto && t.getTeljesítmény() > 20000)
            {
                lista.add(t);
            }
        }
        return lista;
    }

    public static void LegnagyobbTeljesitmeny(List<Auto> a)
    {
        Collections.sort(a);
        if(a.size() > 3)
        {
            for(Auto item: a)
            {
                System.out.println(item);
            }
        }else
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sor = sc.nextLine();

        Auto auto = new Auto(sor,100,true);

        System.out.println(auto);

        int n = 4;
        Auto[] tomb = new Auto[n];

        for (int i = 0; i < n; i++)
        {
            boolean kapcsolo;
            String[] beolvas = sc.nextLine().split(" ");
            if(beolvas[2].equals("true"))
                kapcsolo = true;
            else
                kapcsolo = false;

            if(i < 2)
            {
                tomb[i] = new Auto(beolvas[0], Integer.parseInt(beolvas[1]), kapcsolo);
            }else
            {
                tomb[i] = new Teherauto(beolvas[0], Integer.parseInt(beolvas[1]), kapcsolo, Integer.parseInt(beolvas[3]));
            }

        }
    }
}
