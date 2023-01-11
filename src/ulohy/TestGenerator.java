package ulohy;
import java.util.Random;

public class TestGenerator {

    public static void main(String[] args) {


int counter=0;
final int minimalvalue=150;

        for (int i = 1; i<100;i++)
        {
          Random rn=new Random();
          int randomValue=rn.nextInt(30)+minimalvalue;
           if (randomValue==150) counter++;

          //          int randomValue = (int) ((Math.random() * 10)+1);
            System.out.println(randomValue);
        }
        System.out.println("je tam co hladam " + "vyskytlo sa " + counter);

    }
}


