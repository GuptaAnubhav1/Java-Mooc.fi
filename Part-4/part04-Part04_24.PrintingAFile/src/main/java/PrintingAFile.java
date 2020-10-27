
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {
        try(Scanner reader = new Scanner(Paths.get("data.txt"))) {
            while(reader.hasNextLine()){
                String input = reader.nextLine();
                System.out.println(input);
            }
        }
    }
}
