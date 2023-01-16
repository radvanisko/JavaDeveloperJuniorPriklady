package ulohy;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Popis programu
  16.01.2023
Úloha č. 1
Vytvorte triedu Rectangle, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (getPerimeter), druhá na výpočet jeho obsahu (getArea).

Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada
od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.

Update programu, vylepšená verzia by mohla robiť toto:
Popis programu:
Po spustení programu vypíše jednoduché menu, kde používateľa zadá možnosť:
s alebo q
pričom písmeno s od používateľa bude žiadať zadanie strán a, b. Po zadaní týchto strán vypočíta obvod a obsah obdlžnika a zobrazí ho do konzoly.
 Toto bude opakovať dovtedy, kým v menu nezadáme písmeno q. Po zadaní písmena q, program ukončí svoju činnosť a vypíše Koniec programu.

*/

public class VypocetObdlznikMetoda {


    public static double getPerimeter(double a,double b) {
        return 2 * (a + b);
    }
   public static double getArea (double a,double b) {
            return a*b;
        }

    public static void vypisText(double stranaa, double stranab) {
        System.out.println(" Nejaky proprietarny blok textuuu");

        System.out.println( "Strany obdlznika :" );
        System.out.println(("Strana a je: "+ stranaa ));
        System.out.println(("Strana b je: " + stranab));
        System.out.println();

    }

    public static void main(String[] args) {

        // obvod kruhu
        //final double pi = Math.PI;  len pre srandu

        while (true) {

            try {
                System.out.println("Zadaj Stranu a  :");
                Scanner sc1 = new Scanner(System.in);
                double stranaa = sc1.nextDouble();

                if(stranaa <=0) {
                    System.out.println("koniec") ;sc1.close();;return;}

                System.out.println("Zadaj Stranu b :");
                sc1 = new Scanner(System.in);
                double stranab = sc1.nextDouble();

                if(stranab <=0) {
                    System.out.println("koniec") ;sc1.close();;return;}

               // vypisText("Objekt obdlznik  je strana a" + stranaa + "strana b" + stranab);


                /*System.out.println( "Strany obdlznika :" );
                System.out.println(("Strana a je: "+ stranaa ));
                System.out.println(("Strana b je: " + stranab));
                System.out.println();*/

                vypisText(stranaa,stranab);

                System.out.printf("Obvod obdlznika " + getPerimeter(stranaa,stranab));
                System.out.println();
                System.out.printf("Obsah  obdlznika "+ getArea(stranaa,stranab));
                System.out.println();

            }

            catch  (Exception e ){
                System.out.println("Zadana blbost  - mas zadat stranu a a stranu b, cize hodnotu");

            }



        }

    }

    @Test
    public void testgetPerimeter() {

        assertEquals(7,getArea(2,3));


    }
}

