package KoPapirOllo;

import java.util.Scanner;

public class KoPapirOllo {

    public static void komeccs(String jatekos, int gep)
    {
        if(gep == 0)
        {
            System.out.println("Gep: ko\nDontetlen!");
        }else if(gep == 1)
        {
            System.out.println("Gep: papir\nA gep nyert!");
        }else{
            System.out.println("Gep: ollo\nA jatekos nyert!");
        }
    }

    public static void papirmeccs(String jatekos, int gep)
    {
        if(gep == 0)
        {
            System.out.println("Gep: ko\nA jatekos nyert!");
        }else if(gep == 1)
        {
            System.out.println("Gep: papir\nDontetlen!");
        }else{
            System.out.println("Gep: ollo\nA gep nyert!");
        }
    }

    public static void ollomeccs(String jatekos, int gep)
    {
        if(gep == 0)
        {
            System.out.println("Gep: ko\nA gep nyert!");
        }else if(gep == 1)
        {
            System.out.println("Gep: papir\nA jatekos nyert!");
        }else{
            System.out.println("Gep: ollo\nDontetlen!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sor = sc.nextLine();
        int random_szam = 0;

        while (!sor.equals("vege"))
        {
            random_szam = (int)(Math.random()*3);
            if(sor.equals("ko"))
            {
                komeccs("ko",random_szam);
            }else if(sor.equals("papir"))
            {
                papirmeccs("papir",random_szam);
            }else if(sor.equals("ollo"))
            {
                ollomeccs("ollo",random_szam);
            }
            sor = sc.nextLine();
        }
    }
}
