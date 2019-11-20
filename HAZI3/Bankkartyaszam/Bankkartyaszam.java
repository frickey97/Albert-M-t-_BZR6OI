package Bankkartyaszam;

import java.util.Scanner;

public class Bankkartyaszam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        while(sc.hasNextLine())
        {
            String sor = sc.nextLine();
            /*if(sor.equals("0"))
                break;*/
            
            int eredmeny = 0;
            
            for (int i = 0; i < sor.length(); i++) 
            {
                if(i == 0 || i % 2 == 0)
                {
                    int szam = Character.getNumericValue(sor.charAt(i));
                    szam = szam * 2;
                    if(szam > 9)
                        eredmeny = eredmeny + ( szam- 9);
                    else
                        eredmeny = eredmeny + szam;
                }else
                {
                    eredmeny = eredmeny + Character.getNumericValue(sor.charAt(i));
                }
            }
            
            if(eredmeny % 10 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
