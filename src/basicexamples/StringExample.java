package basicexamples;

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        int number = 10;
        System.out.println("The length of the number is: " + number); // is not possible to get lenght of number in same way as in String

        String txt2 = "locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7


        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);


        String firstName2 = "Jan ";
        String lastName2 = "Zitniak";
        System.out.println(firstName2.concat(lastName2));

    }
}
