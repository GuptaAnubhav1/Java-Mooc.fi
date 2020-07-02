
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max =0;
        int oldest = 0;
        String current=" ";
        String updated = " ";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String name[] = input.split(",");
            max = Integer.valueOf(name[1]);  
            current = name[0];
            if(max>oldest){
                oldest=max;
                updated= current;
            }
         
        }
        System.out.println("Name of the oldest: "+updated);
    }
}
