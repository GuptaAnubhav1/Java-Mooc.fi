
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int total = number * hours * minutes * seconds;
        System.out.println(total);

    }
}
