package ulohy;

/*

Úloha č. 2
        Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
        Dodatočná úloha: Doplňte ďalšie funkcie a to MAX (getMax), ktorá zistí (vráti, zobrazí) najvyššie zadané číslo, ďalej funkciu MIN (getMin), ktorá zistí najnižšie číslo a funkcia COUNT (getCount), ktorá zistí počet zadaných vstupných čísel.
        Pomôcka: Môžete použiť metódu max a min triedy Math, ktorá sa nachádza štandardne v Jave (inbuilt).
        System.out.println("The largest number of the two numbers is " + Math.max(1,2));
        Dodatočná úloha č. 2:  Upravme metódy tak, že bude dané funkcie počítať s ľubovoľného množstva čísiel.

Úloha č. 3
Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt, ktoré budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
Dodatočná úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
*/

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelBasicFormulasWithArrayList {


    public static double getSumDynArray(ArrayList<Double> dynpole )
    {
        double sum=0;
        for (int i = 0; i < dynpole.size(); i++) {
            sum=sum+dynpole.get(i);
        }
        return sum;

    }

    public static double getAverageDynArray(ArrayList<Double> dynpole )
    {
        double average=0;
        for (int i = 0; i < dynpole.size(); i++) {
            average=average+dynpole.get(i);
        }
        average=average/ dynpole.size();
        return average;
    }
    public static double getMaxDynArray(ArrayList<Double> dynpole){

        double max=-99999999999999999999999d; // pozor ak to budu vsetko -cisla , tak max bude 0
        for (int i = 1; i < dynpole.size(); i++) {
            max=Math.max(dynpole.get((i)-1),dynpole.get(i));
        }

        return max;

    }


double x,y=0;
    public static void main(String[] args) {
         //divna inicializacia

        ArrayList <Double> dynamickepole= new ArrayList<Double>();
        Scanner sc1 = new Scanner(System.in);
        double z=999999999999999999999999999999d;
        int index=0;

        System.out.println("Zadavaj prosím  prvky pola. Hodnoty musia byť kladne cisla.");
        System.out.println("Na ukončenie zadavania prvok pola zadaj  zapornu hodnotu");

        while (z>=0)
        {
            try { z = sc1.nextDouble(); }
            catch  (Exception e ){ System.out.println("Zadana blbost  - mas zadat cisla");return;}

            if (z>=0) {
                dynamickepole.add(index,z);

            }
             index++;

         }
        System.out.println( " pocet prvkov ma byt " + dynamickepole.stream().count());
        System.out.println( " pocet prvkov ma byt " + dynamickepole.size());


       vypisDynamickePole(dynamickepole);


        System.out.println("Suma zadanych hodnot  " + " je " + getSumDynArray(dynamickepole));
        System.out.println("Priemer zo zadanych cisiel  " + " je " + getAverageDynArray(dynamickepole));
        System.out.println("Najvacsie cislo zo zadanych je " + getMaxDynArray(dynamickepole));


    }

    public  static void vypisDynamickePole (ArrayList<Double> dynpole){
        int pocetprvkov= dynpole.size();
        System.out.print("Moje pole: "+ "{" );

        for (int i = 0; i < dynpole.size(); i++) {
            System.out.print(dynpole.get(i) +",");
        }

        System.out.print("}");
        System.out.println();
    }

    @Nested
    @DisplayName("Tests for my method")
    class MyMethodUseCases {
        @Test
        public void testDynArrayMax() {
//
//            ArrayList <Double> pole=new ArrayList<Double>;
//            pole.add(2,2,2,2,2,);
//            assertEquals(10,getMaxDynArray(pole);

        }
        @Test

        public void testDynArraySum() {

            // vytvor ArrayList pole

//            assertEquals(50,getSumDynArray(pole));
        }
    }
}



