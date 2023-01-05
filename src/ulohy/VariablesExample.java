package ulohy;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
/*
 Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže použivateľ meniť cez premenné.
 Text bude vyzerať nasledovne:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */
//TODO print grade with comma

public class VariablesExample {
    public static void main(String[] args) {
        String text1 = "Študent Jozef Mrkvička sa narodil ";
        String date = "03.12.2000";
        String text2 = ", z maturitnej skúšky má známku ";
        float grade = 1.5f;
        grade ++;

        String text3 = " a od septembra ";
        int year = 2022;
        String text4 = " nastúpi do nového zamestnania ako Java programátor.\n";
        String text5 = "V Bratislave dňa ";
        String currentDate = "18.06.2022";
        String gradeWithComma = String.format("%.1f",grade);

        //String wholeText= text1+date+text2+gradeWithComma+text3+year+text4+text5+currentDate;
        //LocalDate today =LocalDate.now();

        /*
        // Moje riešenie
        String today= DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());
        String wholeText= text1+date+text2+gradeWithComma+text3+year+text4+text5+today;
        System.out.println(wholeText);
        */

        // Dominika riešenie
       Locale locale = new Locale("sk", "SR");
       DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String today = dateFormat.format(new Date());


        String wholeText= text1+date+text2+gradeWithComma+text3+year+text4+text5+today;
        System.out.println(wholeText);


    }
}
