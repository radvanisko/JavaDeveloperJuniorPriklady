package ulohy;

import java.util.Scanner;

/*
Popis programu
        Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý bude v centimetroch. Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do “konzoly”. Program pôjde dovtedy, kým nezadáme slovo: koniec.
        Hint:
        Vzorec na výpočet obsahu kruhu je nasledujúci:
        S = π.r²
        Vzorec na výpočet obvodu kruhu je:
        o = 2.p.r
        Bonusová úloha: vytvorte metódy z daných vzorcoch.
*/


public class vypocetKruhMetoda {



    public static double obvod(double polomer) {
        return 2 * Math.PI * polomer;

    }
public static void vypisText(String s) {
    System.out.println(" Nejaky proprietarny blok textuuu");

}


    public static double obsah(double polomer) {
        double obsah = Math.pow(polomer,2) * Math.PI;
        return obsah;

    }

    public static void main(String[] args) {

        // obvod kruhu
        //final double pi = Math.PI;  len pre srandu

       while (true) {

           try {
           System.out.println("Zadaj polomer kruhu :");
           Scanner sc1 = new Scanner(System.in);
           double polomer = sc1.nextDouble();
         if(polomer <=0) {
             System.out.println("koniec") ;sc1.close();;return;}

         vypisText("Polomer je " + polomer);
         System.out.printf("Obvod kruhu s polomerom  %.2f  je  %.4f", polomer, obvod(polomer));
           System.out.println();
           System.out.printf("Obsah kruhu s polomerom  %.2f  je  %.4f", polomer, obsah(polomer));


           }

           catch  (Exception e ){
               System.out.println("Zadana blbost  - mas zadat polomer, cize hodnotu");

           }



       }

    }

}
