package MasodikFeladat;

import java.util.Arrays;

public class Dolgozat{
    public static SzeszesItal[] metodus1(Ital[] ital)
    {
        int mennyi_van = 0;
        
        for (int i = 0; i < ital.length; i++) {
            if(ital[i] instanceof SzeszesItal)
                mennyi_van++;    
        }
        
        if(mennyi_van < 3)
            return null;
        
        double[] szamok = new double[mennyi_van];
        int j = 0;
        
        for (int i = 0; i < ital.length; i++) {
            if(ital[i] instanceof SzeszesItal)
            {
                SzeszesItal szesz = (SzeszesItal)ital[i];
                szamok[j++] = szesz.getAlkoholTartalom();
            }
        }
        
        Arrays.sort(szamok);
              
        int count = 0;
        SzeszesItal[] visszaad = new SzeszesItal[3];
        int szamol = 0;
        
        for (int i = j-1; i >= 0; i--) 
        {
            for (int k = 0; k < ital.length; k++) 
            {
                if(ital[k] instanceof SzeszesItal)
                {
                    SzeszesItal szesz = (SzeszesItal)ital[k];
                    if(szesz.getAlkoholTartalom() == szamok[i])
                        visszaad[count++] = szesz;
                }
            }
            szamol++;
            if(szamol == 3)
                break;
        }     
        return visszaad;
    }
    
    public static void main(String[] args) {
        Ital[] ital = new Ital[6];
        
        ital[0] = new SzeszesItal(33.3, "Jager", "0.5 l", 3333);
        ital[1] = new Ital("Almale", "1 l", 245);
        ital[2] = new SzeszesItal(50.2, "Barack Palinka", "0.75 l", 5000);
        ital[3] = new Ital("Coca Cola", "2.25 l", 495);
        ital[4] = new SzeszesItal(49.9, "Vodka", "1 l", 4654);
        ital[5] = new SzeszesItal(66.6, "Whiskey", "1 l", 6500);
        
        SzeszesItal[] szesz = metodus1(ital);
        
        try {
            for(SzeszesItal item: szesz)
            {
                System.out.println(item);
            }  
        } catch (NullPointerException e) {
            System.out.println("Nincs eleg elem!");
        }      
    }
}
