package Katona;

public class TestKatona {

    public static boolean megkuzd(Katona katona1, Katona katona2)
    {
        int katona1_osszeg = katona1.getTamadoero() + katona1.getVedoero();
        int katona2_osszeg = katona2.getTamadoero() + katona2.getVedoero();

        if(katona1_osszeg > katona2_osszeg)
            return true;
        else if(katona1_osszeg < katona2_osszeg)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Katona figura1 = new Katona();
        Katona figura2 = new Katona();
        Katona figura3 = new Katona();

        figura1 = new Nyilas(10,2,5);
        figura2 = new Landzsas(22,20,1);
        figura3 = new Nyilas(40,0,20);

        int nyertes = 0;

        if(megkuzd(figura1,figura2))
        {
            System.out.println("Katona1: " + figura1 + " vs. Katona2: " + figura2 + "\n" +
                    "Nyertes: " + figura1 + "\n");
            nyertes = 1;
        }else
        {
            System.out.println("Katona1: " + figura1 + " vs. Katona2: " + figura2 + "\n" +
                    "Nyertes: " + figura2 + "\n");
            nyertes = 2;
        }

        if(nyertes == 1)
        {
            if(megkuzd(figura1,figura3))
            {
                System.out.println("Katona1: " + figura1 + " vs. Katona2: " + figura3 + "\n" +
                        "Nyertes: " + figura1);
            }else
            {
                System.out.println("Katona1: " + figura1 + " vs. Katona2: " + figura3 + "\n" +
                        "Nyertes: " + figura3);
            }
        }else
        {
            if(nyertes == 2)
            {
                if(megkuzd(figura2,figura3))
                {
                    System.out.println("Katona1: " + figura2 + " vs. Katona2: " + figura3 + "\n" +
                            "Nyertes: " + figura2);
                }else
                {
                    System.out.println("Katona1: " + figura2 + " vs. Katona2: " + figura3 + "\n" +
                            "Nyertes: " + figura3);
                }
            }
        }


    }
}
