package ulohy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



/*

Úloha č. 2
        Vytvorte knižnicu (Library), kde bude môcť používateľ zadať knihy (názvy) cez konzolu kým nezadá slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.
        Dodatočná úloha: Vytvorte metódu (getCountOfAllBooks), ktorá zistí počet kníh. Použili sme metódu ArrayList.size();
        Dodatočná úloha č.1: Vytvorte metódu (getFirstBook), ktorá vypíše prvú knihu.
        Dodatočná úloha č.2: Vytvorte metódu (getLastBook), ktorá vypíše poslednú knihu.
        Dodatočná úloha č.3: Vytvorte metódu (getBookByIndex), ktorá vypíše akúkoľvek knihu podľa indexu.
        Dodatočná úloha č.4: Vytvorte metódu (removeBookByIndex), ktorá odstráni akúkoľvek knihu podľa indexu.
        Dodatočná úloha č.5: Vytvorte metódu (removeAllBooks), ktorá zmaže všetky knihy.
        Dodatočná úloha č.6: Vytvorte metódu (findBookByName), ktorá vypíše, či v zozname existuje alebo nie.
        Pomôcka:
public static List<String> findUsingLoop(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        for(String str: list) {
        if (str.contains(search)) {
        matches.add(str);
        }
        }
        return matches;
        }
        Zdroj: https://www.baeldung.com/java-search-string-arraylist
        Dodatočná úloha č.7: Vytvorte metódu (findBooksByFulltextSearch), ktorá vypíše knihu / všetky knihy podľa časti názvu alebo vypíše, že neexistuje žiadna.
        Pomôcka:
public static List<String> findUsingLoop(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        for(String str: list) {
        if (str.contains(search)) {
        matches.add(str);
        }
        }
        return matches;
        }
        Zdroj: https://www.baeldung.com/java-search-string-arraylist
        Menu s možnosťami
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Zadaj index knihy, ktorú zobrazujeme
        Zobraz názov poslednej knihy
        Zobraz názov prvej knihy
        Zobraz počet všetkých kníh
        Vymaž konkrétnu knihu (podľa indexu)
        Zadaj index knihy, ktorú odstraňujeme
        Vymaž všetky knihy
        Quit = skončí zadávanie novej knihy


*/




public class BooksLibraryWithMenu {

    public  static void vypisDynamickePole (ArrayList<String> dynpole){

        System.out.print("Zoznam knih : "+ "{" );
        for (int i = 0; i < dynpole.size(); i++) {
            System.out.print(dynpole.get(i) +",");
        }
        System.out.print("}");
        System.out.println();

        // prechadzame vsetkymi prvkami dynamickeho pola knihy, SPOSOB c.2
        for (String kniha:dynpole) {
            System.out.println(kniha);
        }

    }

    public static int getCountOfAllBooks(ArrayList<String> dynpole){
        return  dynpole.size();
    }

    public static void removeAllBooks(ArrayList<String> dynpole){

        Scanner sc2 = new Scanner(System.in);
                sc2 = new Scanner(System.in);
        System.out.println("Vazne chces zmazat cely zoznam ? (Y/n)");

        if (sc2.next().equals("Y")) dynpole.removeAll(dynpole);

    }
    public static String getFirstBook (ArrayList<String>dynpole ) {

        String prvakniha;
        return prvakniha=dynpole.get(dynpole.size());

    }
    public  static void getBookByIndex (ArrayList<String> dynpople){

        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Zadaj cislo indexu knihy, ktory chces vypísať - v zozname je pocet knih :" + dynpople.size());

         int index;
         index= sc2.nextInt();
        if (index>dynpople.size()) System.out.println(" v kniznici nemas tolko knih");
        else System.out.println( "V knižnici máš pod číslom  " + index+1 + "  knihu s nazvom :" + dynpople.get(index));
    }

    public static void main (String[] args ){

        ArrayList <String> zoznamknih= new ArrayList<String>();
        String menuvolba;
        Scanner sc = new Scanner(System.in);

        sc = new Scanner(System.in);

        while (true) {
                System.out.println();
            System.out.println("---------------------------------------------------");
                System.out.println("MENU>       1)= Zadaj novu knihu ,          (q)= quit : ");
                System.out.println("MENU>      (2)= Vypíš zoznam knih,          (q)= quit : ");
                System.out.println("MENU>      (3)= Vypíš knihu podľa indexu    (q)= quit : ");
                System.out.println("MENU>      (6)= Vypíš počet knih,           (q)= quit : ");

                System.out.println("MENU>      (8)= Zmaž všetky knihy,          (q)= quit : ");
                System.out.println("MENU>      (0)= Sortuj,....                 (q)= quit : ");


            System.out.println("---------------------------------------------------");
                System.out.println("Zadaj svoju volbu:");
                menuvolba = sc.next();

                if(menuvolba.equals("1")) {

                    Scanner sc1 = new Scanner(System.in);
                    String nazovknihy;
                    System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

                    while (true)
                    {
                        nazovknihy=sc1.next();
                        if (nazovknihy.equals("quit")) {break;}
                        if (!nazovknihy.equals("")) { zoznamknih.add(nazovknihy);}
                    }


                    /*
                    while (!nazovknihy.equals("quit"))
                    {
                        nazovknihy=sc1.next();
                        if (!nazovknihy.equals("")) { zoznamknih.add(nazovknihy);}
                    }
*/

                }
            if(menuvolba.equals("2")) {vypisDynamickePole(zoznamknih);  }
            if(menuvolba.equals("3"))   {getBookByIndex(zoznamknih);                }


            if(menuvolba.equals("8")) {removeAllBooks(zoznamknih);  }
            if(menuvolba.equals("6")) { System.out.println("Počet knih v kniznici je : " + getCountOfAllBooks(zoznamknih));  }
            if(menuvolba.equals("0")) {Collections.sort(zoznamknih);}

            if(menuvolba.equals("q")) { System.out.println("Koniec programu") ;sc.close();break;}




            }



        }


    }


