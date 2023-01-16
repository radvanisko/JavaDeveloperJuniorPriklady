package ulohy;

import java.util.Scanner;

public class VypocetUtvarovMenu {

    public static void main (String[] args ){

        String volba;
        Scanner sc1 = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("MENU>  s= vypocet parametrov obdlznika ,  q= quit : ");
                System.out.println("Zadaj svoju volbu");
                sc1 = new Scanner(System.in);
                volba = sc1.next();

                if(volba.equals("s")) {
                    System.out.println("tu by som chcel spusti program na vypocet parametrov obdlznikaq");


                    // tu by som chcel spustit class VypocetObdlznikMetoda;
                    VypocetObdlznikMetoda.main(null);

                                    }

                    if(volba.equals("q")) {
                    System.out.println("koniec") ;sc1.close();break;}
                    }

            catch  (Exception e ){
                System.out.println("Zadana blbost  - mas zadat polomer, cize hodnotu");

            }



        }


    }

}
