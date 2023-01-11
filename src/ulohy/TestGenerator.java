package ulohy;
import java.util.Random;

public class TestGenerator {

    public static void main(String[] args) {


int counter=0;
final int minimalvalue=1;

        for (int i = 1; i<1000;i++)
        {
          Random rn=new Random();
          int randomValue=rn.nextInt(10)+minimalvalue;
           if (randomValue==0) counter++;

          //          int randomValue = (int) ((Math.random() * 10)+1);
//            System.out.println(randomValue);
        }
        System.out.println("je tam co hladam " + "vyskytlo sa " + counter);

    }
}


