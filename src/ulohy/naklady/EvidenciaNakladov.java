package ulohy.naklady;

/*
06.02.2023
        Vytvorte aplikáciu na evidenciu nákladov v domácnosti. Využitie zapúzdrenia (encapsulation) a objektového programovania v Jave.

        Čo by mohla obsahovať informácie o nákladovej položke?
        Popis nákladu (čo), kategória, kto zadal, cena, dátum (aktuálny dátum).

        Menu s možnosťami
        Zadaj novú nákladovú položku *
        Zobraz všetky nákladové položky *
        Spočítaj sumu nákladov *
        Vyhľadaj náklad podľa názvu
        9.    Koniec aplikácie *
        * povinná funkcionalita

        Dodatočná úloha: Vyhľadaj náklady podľa dátumu od, do a zároveň by sčítalo výšku nákladov.*/



import ulohy.bookcaseobjektovo.model.KnihaObject;
import ulohy.bookcaseobjektovo.model.ZoznamObjekt;
import ulohy.naklady.model.NakladyStruktura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static ulohy.bookcase.KniznicaEvidencia.*;
import static ulohy.bookcase.KniznicaEvidencia.vypisDynamickePole;

public class EvidenciaNakladov {
    public static void vypisMenu() {
        System.out.println();
        System.out.println(" ---------- EVIDENCIA VYDAVKOV ---------");
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>      (m)= MENU,....                   (q)= quit : ");
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>      (1)= Zadaj novu položku ,          (q)= quit : ");
        System.out.println("MENU>      (2)= Vypíš zoznam položiek         (q)= quit : ");
        System.out.println("MENU>      (3)= Spočítaj sumu položiek        (q)= quit : ");
//        System.out.println("MENU>      (6)=                             (q)= quit : ");
//        System.out.println("MENU>      (7)=                             (q)= quit : ");
//
//        System.out.println("MENU>      (8)=                             (q)= quit : ");
//        System.out.println("MENU>      (9)=                             (q)= quit : ");
//        System.out.println("MENU>      (0)=                             (q)= quit : ");


        System.out.println("---------------------------------------------------");
        System.out.println("Zadaj svoju volbu:");

    }

    public static void main(String[] args) {
        vypisMenu();
        String menuvolba;
        Scanner sc = new Scanner(System.in);

        ArrayList<NakladyStruktura> zoznamNakladov= NakladyStruktura.naplnTestovacimiUdajmi();

//        NakladyStruktura nakladyStruktura=new NakladyStruktura();

//
//        nakladyStruktura.setPopisNakladu("Hypoteka");
//        nakladyStruktura.setKategoria("byvanie");
//        nakladyStruktura.setSuma(500);
//
//        zoznamNakladov.add(nakladyStruktura);
//
//        nakladyStruktura = new NakladyStruktura();
//
//        nakladyStruktura.setPopisNakladu("Internet");
//        nakladyStruktura.setKategoria("byvanie");
//        nakladyStruktura.setSuma(50);
//
//        zoznamNakladov.add(nakladyStruktura);



        while (true) {
            menuvolba = sc.next();

            switch (menuvolba) {
                case "1":
                    Scanner sc1 = new Scanner(System.in);
                    String vstup;
                    double vstupcena=0;
                    System.out.println("Zadaj novú položku do zoznamu nákladov");

                    vstup = sc1.next();

                        if (!vstup.equals("")) {
                            NakladyStruktura polozka=new NakladyStruktura();
//                            System.out.println("Zadal si toto: " + vstup);
                            polozka.setPopisNakladu(vstup);

                            System.out.println("Zadaj Sumu :");
                            try
                            {
                                 vstupcena = sc1.nextDouble();

                            }
                            catch (Exception e) {

                                System.out.println(" Nezadal si spravne hodnotu nakladu, táto položka sa nezapísala");
                                System.out.println("Zadaj svoju volbu:");
                                break;
                            }

//                            System.out.println("Zadal si toto: " + vstupcena);
                            polozka.setSuma(vstupcena);

                            sc1 = new Scanner(System.in);

                            System.out.println("Zadaj obdobie :");
                            vstup = sc1.nextLine();
//                            System.out.println("Zadal si toto: " + vstup);
                            polozka.setDatumZadania(vstup);


                            System.out.println("Zadany naklad:");
                            System.out.println(polozka.getPopisNakladu());
                            System.out.println(polozka.getDatumZadania());
                            System.out.println(polozka.getSuma());

                            zoznamNakladov.add(polozka);

                        }

                    vypisMenu();
                    break;

                case "2":
                    System.out.println("Zoznam tvojich nakladov");

                    for (NakladyStruktura  polozka1 : zoznamNakladov) {

                        System.out.println(polozka1.getPopisNakladu()+"  "+polozka1.getDatumZadania()+ " " + polozka1.getSuma()); ;
//                        System.out.println(polozka1.toString());

                    }


                    System.out.println("Zadaj svoju volbu:");

                    break;

                case "3":
                    double suma=0;

                    for (NakladyStruktura  polozka1 : zoznamNakladov) {
                        suma=suma+polozka1.getSuma();
                    }

                    System.out.println("Suma tvojich nakladov je: " +suma);
                    System.out.println();

                    System.out.println("Zadaj svoju volbu:");
                    break;

                case "6":

                    System.out.println("Zadaj svoju volbu:");
                    break;

                case "7":

                    System.out.println("Zadaj svoju volbu:");
                    break;

                case "8":

                    System.out.println("Zadaj svoju volbu:");
                    break;

                case "0":


                    System.out.println("Zadaj svoju volbu:");
                    break;

                case "m":
                    vypisMenu();
                    break;
                case "q":
                    System.out.println("--------Koniec programu----------");
                    sc.close();
                    return;

                default:
                    for (int i = 0; i < 50; ++i) System.out.println();
                    vypisMenu();

            }


        }
    }

}
