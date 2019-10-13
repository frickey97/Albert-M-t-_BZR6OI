package Iskola;

public class TestOra {
    public static boolean oratHozzad(Ora tanora)
    {
        int j = 0;
        if(tanora.getNapi_oraszam() > 12)
            return false;

        for (int i = 8; i < 19; i++) {
            if(tanora.getOra_kezdete() == tanora.getTanorak()[j++].getOra_kezdete())
                return false;
        }

        for (int i = 0; i < tanora.getTanorak().length; i++) {
            tanora.getTanorak()[i] = tanora;
        }

        return true;
    }

    public static void main(String[] args) {
        Orarend orarend1 = new Orarend("Kedd");
        orarend1.setNapi_oraszam(3);
        Ora ora1 = new Ora(01,"AAA111",6);
        Ora ora2 = new Ora(01,"BBB222",22);
        Ora ora3 = new Ora(01,"CCC333",12);


        if(oratHozzad(ora1))
        {
            System.out.println("Siker");
        }else
            System.out.println("Sikertlen");


        System.out.println(ora3);
    }
}
