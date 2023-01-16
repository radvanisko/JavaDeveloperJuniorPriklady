package ulohy;

import java.util.Scanner;

public class VypocetUtvarovMenu {

    public static void main (String[] args ){

        String volba;
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);

        while (true) {
                System.out.println();
            System.out.println("---------------------------------------------------");
                System.out.println("MENU>  s= vypocet parametrov obdlznika ,  q= quit : ");
            System.out.println("---------------------------------------------------");
                System.out.println("Zadaj svoju volbu:");
                volba = sc.next();

                if(volba.equals("s")) {
                    System.out.println("Program na vypocet parametrov obdlznika ");
                    VypocetObdlznikMetoda.main(null);

                                    }

                    if(volba.equals("q")) {
                    System.out.println("koniec") ;sc.close();break;}

            }



        }


    }


