package ulohy;

/*

Úloha č. 2
        Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
        Dodatočná úloha: Doplňte ďalšie funkcie a to MAX (getMax), ktorá zistí (vráti, zobrazí) najvyššie zadané číslo, ďalej funkciu MIN (getMin), ktorá zistí najnižšie číslo a funkcia COUNT (getCount), ktorá zistí počet zadaných vstupných čísel.
        Pomôcka: Môžete použiť metódu max a min triedy Math, ktorá sa nachádza štandardne v Jave (inbuilt).
        System.out.println("The largest number of the two numbers is " + Math.max(1,2));
        Dodatočná úloha č. 2:  Upravme metódy tak, že bude dané funkcie počítať s ľubovoľného množstva čísiel.

        Dodatočná úloha: Doplňte ďalšie funkcie a to MAX (getMax), ktorá zistí (vráti, zobrazí) najvyššie zadané číslo, ďalej funkciu MIN (getMin), ktorá zistí najnižšie číslo a funkcia COUNT (getCount), ktorá zistí počet zadaných vstupných čísel.


*/

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelBasicFormulas {

    public static double getSum(double x, double y){
        return x+y;
            }

    public static double getAverage(double x, double y){
        return (x+y)/2;
    }
    public static double getMax(double x, double y){
        return Math.max(x,y);
    }

    public static double getSumArray(double[] mojepole )
    {
        double sum=0;
        for (int i = 0; i < mojepole.length; i++) {
            sum=sum+mojepole [i];
        }
        return sum;
    }

    public  static  double getMin(double[] mojepole)
        {
            double min;
            Arrays.sort(mojepole);
        return min=mojepole[0];

    }

    public  static int Count(double[] mojepole){
        int count=0;
        return count=mojepole.length;
    }

    public static double getAverageArray(double[] mojepole )
    {
        double average,sum;
        sum=0;
        for (int i = 0; i < mojepole.length; i++) {
            sum=sum+mojepole [i];
        }
        return average=sum/ mojepole.length;
    }
    public static double getMaxArray(double[] mojepole){
        double max;
       /*
        Arrays.sort(mojepole);
        return max= mojepole[mojepole.length-1];*/

//        double max=-99999999999999999999999d; // pozor ak to budu vsetko -cisla , tak max bude 0
        max=mojepole[0];
        for (int i = 1; i < mojepole.length; i++) {
            max=Math.max(max,mojepole[i]);
            System.out.println("index je : "+(i-1) + "   momentalne je max  :" +max);
        }
        return max;
    }

    public  static void vypisPole (double mojepole[]){

        System.out.print("Moje pole: "+ "{" );
        for (int i = 0; i < mojepole.length; i++) {
            System.out.print( mojepole[i] +",");
        }

        System.out.print("}");
        System.out.println();
    }

double x,y=0;
    public static void main(String[] args) {
         //divna inicializacia

        Scanner sc1 = new Scanner(System.in);
   /*     System.out.println("Zadaj hodnoty a, b : ");
        double x= sc1.nextDouble();
        double y=sc1.nextDouble();

        System.out.println("Suma zadanych hodnot  " + " je " +getSum(x,y));
        System.out.println("Priemer zo zadanych cisiel  " + " je " +getAverage(x,y));
        System.out.println("Najvacsie cislo zo zadanych je " + getMax(x,y));
*/
        int pocetprvkov=0;

        System.out.println("Zadaj kolko prvkov bude mat tvoje pole ");
        pocetprvkov=sc1.nextInt();
        System.out.println( " pocet prvkov ma byt " + pocetprvkov);

        double z; //zase cudna iniciacna hodnota
        double mojecisla []=new double[pocetprvkov];

        for (int i=0; i < pocetprvkov; i++)  // napln pole
        {
          z=sc1.nextDouble();
          mojecisla[i]=z;
        }

        vypisPole(mojecisla);
        System.out.println("Suma zadanych hodnot  " + " je " +getSumArray(mojecisla));
        System.out.println("Priemer zo zadanych cisiel  " + " je " +getAverageArray(mojecisla));
        System.out.println("Najvacsie cislo zo zadanych je " + getMaxArray(mojecisla));
        System.out.println();

        System.out.println("Terazky pole presortujem");
        Arrays.sort(mojecisla);
        vypisPole(mojecisla);

        System.out.println("Suma zadanych hodnot  " + " je " +getSumArray(mojecisla));
        System.out.println("Priemer zo zadanych cisiel  " + " je " +getAverageArray(mojecisla));
        System.out.println("Najvacsie cislo zo zadanych je " + getMaxArray(mojecisla));

    }


    @Nested
    @DisplayName("Tests for my method")
    class MyMethodUseCases {
        @Test
        public void testMax() {
            assertEquals(10,getMax(10,7));

        }
        @Test

        public void testSumArray() {
//            assertEquals(50,getMaxArray(as);
            double pole[]={10,10,10,10,10};

            assertEquals(50,getSumArray(pole));
        }
    }
}



