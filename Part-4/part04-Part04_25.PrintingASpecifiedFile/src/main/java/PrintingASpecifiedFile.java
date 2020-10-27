
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(input))) {
            while(reader.hasNextLine()){
                String lines = reader.nextLine();
                System.out.println(lines);
                        
            }
        }

    }
}
