package ulohy.bookcase;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static ulohy.bookcase.KniznicaEvidencia.*;


public class KniznicaMenu {

    public static void main(String[] args) {

        ArrayList<String> zoznamknih = new ArrayList<String>();
        String menuvolba;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vitaj v knižnici" );
        vypisMenu();

      while(true)
      {

        menuvolba = sc.next();

        switch (menuvolba) {
            case "1":
                Scanner sc1 = new Scanner(System.in);
                String nazovknihy;
                System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

                while (true) {
                    nazovknihy = sc1.nextLine();
                    if (nazovknihy.toLowerCase().equals("quit")) {
                        break;
                    }
                    if (!nazovknihy.equals("")) {
                        zoznamknih.add(nazovknihy);
                    }
                }
                vypisMenu();
                break;

            case "2":
                vypisDynamickePole(zoznamknih);
                System.out.println("Zadaj svoju volbu:");

                break;

            case "3":
                getBookByIndex(zoznamknih);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "6":
                System.out.println("Počet knih v kniznici je : " + getCountOfAllBooks(zoznamknih));
                System.out.println("Zadaj svoju volbu:");
                break;

            case "7":
                removeBookByIndex(zoznamknih);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "8":
                removeAllBooks(zoznamknih);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "0":
                Collections.sort(zoznamknih);
                System.out.println("Knihy boli zoradene podla abecedy");
                vypisDynamickePole(zoznamknih);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "m":
                vypisMenu();
                break;
            case "q":
                System.out.println("Koniec programu");
                sc.close();
                return;

            default:
                for (int i = 0; i < 50; ++i) System.out.println();
                vypisMenu();

        }


    }
    }

    public static void vypisMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>      (m)= MENU,....                 (q)= quit : ");
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>       1)= Zadaj novu knihu ,          (q)= quit : ");
        System.out.println("MENU>      (2)= Vypíš zoznam knih,          (q)= quit : ");
        System.out.println("MENU>      (3)= Vypíš knihu podľa indexu    (q)= quit : ");
        System.out.println("MENU>      (6)= Vypíš počet knih,           (q)= quit : ");
        System.out.println("MENU>      (7)= Vymaž knihu podľa indexu    (q)= quit : ");

        System.out.println("MENU>      (8)= Zmaž všetky knihy,          (q)= quit : ");
        System.out.println("MENU>      (0)= Sortuj,....                 (q)= quit : ");


        System.out.println("---------------------------------------------------");
        System.out.println("Zadaj svoju volbu:");

    }

}
