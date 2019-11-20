package ElsoFeladat;

public class Main {
    public static Aszu[] fuggveny(Bor[] b)
    {
        int mennyi_van = 0;
        
        for (int i = 0; i < b.length; i++) {
            if(b[i] instanceof Aszu)
            {
                Aszu a = (Aszu)b[i];
                if(a.hanyPuttonyos() == 5)
                    mennyi_van++;   
            }
        } 
        
        Aszu[] visszaad = new Aszu[mennyi_van];
        if(mennyi_van == 0)
            return visszaad;
        
        int db = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i] instanceof Aszu)
            {
                Aszu a = (Aszu)b[i];
                if(a.hanyPuttonyos() == 5)
                    visszaad[db++] = a;   
            }
        }
        
        return visszaad;
    }
    
    public static void main(String[] args) {
        Bor[] bor = new Bor[5];
        
        bor[0] = new Bor("Poloskei Muskotaly","Badacsony","Szaraz",13.6);
        bor[1] = new Aszu(5, "Irsai Olvier", "Tokaj", "Edes", 9.1);
        bor[2] = new Bor("Saszla", "Tokaj", "Feledes", 10.2);
        bor[3] = new Aszu(5,"Nero","Eger","Felszaraz", 8.7);
        bor[4] = new Bor("Koverszolo", "Villany", "Edes", 11.1);
        
        Aszu[] aszu = fuggveny(bor);
        
        for(Aszu item: aszu)
        {
            System.out.println(item);
        }
        
    }
}
