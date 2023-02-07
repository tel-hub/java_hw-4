import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("####### Level 1 #######");

        System.out.println("degrees Celsius >");

        double celsius = Double.parseDouble(keyboard.next());

        double fahrenheit = 32 + celsius * 9 / 5;

        System.out.println("degrees Fahrenheit " + fahrenheit);

        System.out.println("####### Level 2 #######");

        Scanner keyboard2 = new Scanner(System.in);

        System.out.println("any text >");

        String text = keyboard2.nextLine();

        System.out.println("uppercase text " + text.toUpperCase());

        System.out.println("text length " + text.length());

        int count = Math.min(20, text.length());

        System.out.println("first " + count + " symbols " + text.substring(0, count) + (count < 20 ? "" : "..."));
    }
}
