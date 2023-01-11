package ulohy;
import java.util.Random;
import java.util.Scanner;

public class UhadniCislo {

    public static void main(String[] args) {

        int number = 0;
//        int randomValue = (int) (Math.random() * 101);
        int counter = 0;

        Random rn=new Random();
        int randomValue=rn.nextInt(100)+1;

        System.out.println(randomValue);
        System.out.println("Prave som si vymyslel číslo od 0-100 - uhadni ake?");
        System.out.println();

        Scanner sc1 = new Scanner(System.in);
        System.out.println(" Zadaj svoje cislo");
        number = sc1.nextInt();
        counter++;

        if (randomValue == number) {
            System.out.println("Si kuzelnik, uhadol si moje cislo hned");
               }

       else {
            do {
                if (number > randomValue) {
                    System.out.println("Tvoje cislo je vacsie skus znova");
                } else {
                    System.out.println("Tvoje cislo je mensie skus znova");
                }
//                sc1 = new Scanner(System.in);
                System.out.println(" Zadaj svoje cislo");
                number = sc1.nextInt();
                counter++;
            }

            while (number != randomValue);
            System.out.println();
            System.out.println("No konecne ,uhadol si na " + counter + "." + "pokus");
        }

    }
        }

