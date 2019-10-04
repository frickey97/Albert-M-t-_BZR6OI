package Metodusok;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Metodusok {

    public static int[] NovekvoSzamok(int a, int b, int c)
    {
        int[] tomb = new int[3];
        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;

        Arrays.sort(tomb);
        return tomb;
    }

    public static double[] HaromValosSzam(double a, double b, double c)
    {
        double[] tomb = new double[3];
        double[] tomb2 = new double[3];
        double[] megoldas = new double[2];

        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;
        Arrays.sort(tomb);
        megoldas[0] = tomb[0];

        tomb2[0] = Math.abs(a);
        tomb2[1] = Math.abs(b);
        tomb2[2] = Math.abs(c);
        Arrays.sort(tomb2);

        megoldas[1] = tomb2[2];

        return megoldas;
    }

    public static double[] NegyValosSzam(double a, double b, double c, double d)
    {
        double[] tomb = new double[4];

        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;
        tomb[3] = d;

        if(d >= 0)
        {
            tomb[1] = c;
            tomb[2] = b;
            return tomb;
        }
        tomb[2] = d;
        tomb[3] = c;
        return tomb;
    }

    public static boolean Haromszoge(double a, double b, double c)
    {
        if(a + b > c && a + c > b && b + c > a)
            return true;
        return false;
    }

    public static int SzokoEv(int a, int b)
    {
        int megoldas = 0;
        if(a > b)
        {
            a = b;
        }

        for (int i = a; i <= b; i++)
        {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
            {
                megoldas++;
            }
        }

        return megoldas;
    }

    public static String Erdemjegy(int a)
    {
        switch (a)
        {
            case 1: return "Elegtelen";
            case 2: return "Elegseges";
            case 3: return "Kozepes";
            case 4: return "Jo";
            case 5: return "Jeles";
            default: return "Nincs ilyen jegy!";
        }
    }

    public static int Hanyados(int a, int b)
    {
        int hanyados = 0;
        while(a >= b)
        {
            hanyados = hanyados + 1;
            a = a - b;
        }
        return hanyados;
    }

    public static boolean Prim(int a)
    {
        int osztok_szama = 0;

        if(a == 1)
        {
            return false;
        }else
        {
            for (int i = 1; i <= a; i++) {
                if(a % i == 0)
                    osztok_szama++;
            }
            if(osztok_szama == 2)
            {
                return true;
            }
        }
        return false;
    }

    public static int[] Fibonacci(int n)
    {
        int[] megoldas = new int[n];
        if(n < 3)
        {
            megoldas[0] = 0;
            megoldas[1] = 1;

            return megoldas;
        }

        megoldas[0] = 0;
        megoldas[1] = 1;

        int osszeg = 0;

        for (int i = 0; i < n - 2; i++) {
           osszeg = megoldas[i] + megoldas[i + 1];
           megoldas[i + 2] = osszeg;
        }

        return megoldas;
    }

    public static int Forditott_szam(int a)
    {
        int ujszam = 0;

        while (a != 0)
        {
            ujszam = ujszam * 10 + ( a % 10);
            a = a / 10;
        }

        return ujszam;
    }

    public static int Faktorialis(int a)
    {
        int megoldas = 1;


        if(a == 0)
        {
            return megoldas;
        }

        for (int i = 1; i <= a; i++) {
            megoldas = megoldas * i;
        }

        System.out.printf("11: " + a + " faktoriálisa: ");

        return megoldas;
    }

    public static int[] Oszthato_Szamok(int k, int a, int b)
    {
        int j = 0;

        for (int i = a; i <= b; i++) {
            if(i % k == 0)
            {
                j++;
            }
        }

        int[] megoldasok = new int[j];
        j = 0;
        for (int i = a; i <= b ; i++) {
            if(i % k == 0)
            {
                megoldasok[j++] = i;
            }
        }

        return megoldasok;
    }

    public static int Nagyobb_Fibonacci(int a)
    {
        int vegeredmeny = 0;

        int[] megoldas = new int[10];

        megoldas[0] = 0;
        megoldas[1] = 1;

        int osszeg = 0;

        for (int i = 0; i < 10 - 2; i++) {
            osszeg = megoldas[i] + megoldas[i + 1];
            megoldas[i + 2] = osszeg;
        }

        for (int i = 0; i < 10 ; i++) {
            if(a < megoldas[i])
            {
                vegeredmeny = megoldas[i];
                break;
            }
        }

        return vegeredmeny;
    }

    public static int[] Szamjegyek_Kobei()
    {
        int db = 0;

        for (int i = 1000; i > 0; i--) {

            int szamjegyejek = 0;
            int osszeg = 0;
            int jelnlegiszam = i;

            while (jelnlegiszam != 0) {

                szamjegyejek = jelnlegiszam % 10;

                osszeg += szamjegyejek * szamjegyejek * szamjegyejek;

                jelnlegiszam = jelnlegiszam / 10;
            }

            if (i == osszeg)
                db++;
        }

        int[] megoldas = new int[db];

        db = 0;

        for (int i = 1000; i > 0; i--) {

            int szamjegyejek = 0;
            int osszeg = 0;
            int jelnlegiszam = i;

            while (jelnlegiszam != 0) {

                szamjegyejek = jelnlegiszam % 10;

                osszeg += szamjegyejek * szamjegyejek * szamjegyejek;

                jelnlegiszam = jelnlegiszam / 10;
            }

            if (i == osszeg)
                megoldas[db++] = i;
        }

        return megoldas;
    }

    public static void main(String[] args) {

        System.out.println("1: " + Arrays.toString(NovekvoSzamok(2,5,1))); // 1.

        System.out.println("2: " + Arrays.toString(HaromValosSzam(2.5,-1.2,8.3))); // 2.

        System.out.println("3: " + Arrays.toString(NegyValosSzam(3.2,-1.9,5.5,9))); // 3.

        System.out.println("4: " + Haromszoge(3.1,4.2,5)); // 4.

        System.out.println("5: " + SzokoEv(1689,2002)); // 5.

        System.out.println("6: " + Erdemjegy(5)); // 6.

        System.out.println("7: " + Hanyados(8,2)); // 7.

        System.out.println("8: " + Prim(23)); // 8.

        System.out.println("9: " + Arrays.toString(Fibonacci(6))); // 9.

        System.out.println("10: " + Forditott_szam(459)); // 10.

        System.out.println(Faktorialis((int)(Math.random() * 13))); // 11.

        System.out.println("12: " + Arrays.toString(Oszthato_Szamok(10,20,100))); // 12.

        System.out.println("13: " + Nagyobb_Fibonacci(4)); //13

        System.out.println("14: " + Arrays.toString(Szamjegyek_Kobei())); //14

    }
}
