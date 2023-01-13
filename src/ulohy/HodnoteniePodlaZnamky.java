package ulohy;

import java.text.Normalizer;
import java.util.Scanner;


/*
Úloha č.2
        Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku.
        Hint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom. Nemôžeme použiť ==
        Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.
        Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniec
        Bonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstup text bez ohľadu na diakritiku.

        Popis programu.
        Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
        Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
        Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.
*/


public class HodnoteniePodlaZnamky {

       public static String stripAccents(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    public static void main(String[] args) {

        String znamka="";
        String znamka2="";
         Scanner sc1 = new Scanner(System.in);

        while  (!znamka2.equals("koniec")) {

            System.out.println(" Zadaj prosím svoju známku");
            znamka = sc1.nextLine();
            znamka2=stripAccents(znamka);
            znamka2=znamka2.toLowerCase();

//            System.out.println(znamka + "   " +znamka2);


            switch (znamka2) {
                case ("vyborny")   : System.out.println("1"); break;
                case ("chvalitebny") : System.out.println("2"); break;
                case ("dobry") : System.out.println("3"); break;
                case ("dostatočny") : System.out.println("4"); break;
                case ("nedostatočny") : System.out.println("5"); break;
                default:  System.out.println("Zadaj to poriadne, mas tam chyby riadne s ktorymi som si neporadil!");
            }

        }
        sc1.close();
        System.out.println("Koniec programu");
        }


    }



