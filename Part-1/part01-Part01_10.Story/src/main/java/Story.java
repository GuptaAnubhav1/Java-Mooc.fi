
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I will tell you a story, but I need some information first.\n" +
                            "What is the main character called?");
        String reply = scanner.nextLine();
        System.out.println("What is their job?");
        String reply1 =scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+ reply + ", who was "+ reply1 + ".");
        System.out.println("On the way to work, "+ reply + " reflected on life.");
        System.out.println("Perhaps "+ reply + " will not be " + reply1 + " forever.");
        
        
        

    }
}
