
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();
            if(line.equals("")) {
                break;
            }
            
        
            String[] text= line.split(" ");
            System.out.println(text[text.length - 1]);
        } 
    }
}
