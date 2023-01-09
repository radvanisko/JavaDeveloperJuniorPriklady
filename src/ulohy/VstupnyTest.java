package ulohy;
import java.util.Scanner;
/*

        09.01.2023
        Úloha č. 1
        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie
*/


public class VstupnyTest {
    private double percento;

    public static void main(String[] args) {

        System.out.println("Zadaj na kolko percent si zmakol test?");
        System.out.println();
        Scanner scn = new Scanner(System.in);
        double percento = scn.nextDouble();

        if (percento > 90) {
            System.out.println("Mas znamku A");
        } else {
            if (percento > 75) {
                System.out.println("Mas znamku B");
            } else {
                if (percento > 65) {
                    System.out.println("Tesne, ale mas C ");
                } else {
                    System.out.println("nedal; si to");
                }
            }
        }
    }
}