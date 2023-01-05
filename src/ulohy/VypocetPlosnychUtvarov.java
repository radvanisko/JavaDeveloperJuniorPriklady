package ulohy;
import java.util.Scanner;
public class VypocetPlosnychUtvarov {
    public static void main(String[] args) {

        // obvod kruhu
        final double pi=Math.PI;

        System.out.println("Zadaj polomer kruhu :");
        Scanner sc1 = new Scanner(System.in);
        double polomer = sc1.nextDouble();
        sc1.close();

        double obvod= 2*Math.PI/polomer;
        double obsah= polomer*polomer*pi;

        System.out.printf("Obvod kruhu s polomerom  %.2f  je  %.4f",polomer,obvod);
        System.out.println();
        System.out.printf("Obsah kruhu s polomerom  %.2f  je  %.4f",polomer,obsah);

    }

}
