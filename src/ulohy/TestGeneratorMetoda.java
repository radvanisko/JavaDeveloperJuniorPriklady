package ulohy;

import java.util.Random;

public class TestGeneratorMetoda {

    static int generuj(int min, int max) {

        int range = max - min;
        Random rn = new Random();
        return rn.nextInt((range) + 1) + min;

    }

    public static void main(String[] args) {
        int counter = 0;
        //final int minimalvalue = 1;

        //System.out.println(randomvalue);

        for (int i = 1; i < 100; i++) {
            int randomvalue = generuj(10, 35);
            System.out.println(randomvalue);
            if (randomvalue == 100) counter++;

        }

        System.out.println("je tam co hladam " + "vyskytlo sa " + counter);


    }
}
