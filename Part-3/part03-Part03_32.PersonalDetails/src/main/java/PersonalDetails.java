
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int count = 0;
        String s;
        int x=0;
        int updated=0;
        String p=" ";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            s = parts[0];
            sum  += Integer.valueOf(parts[1]);
            count += 1;
            x=s.length();
            if(x>updated){
                updated=x;
                p=s;
            }
        }
        System.out.println("Longest name: "+p);
        System.out.println("Average of the birth years: "+ (1.0*sum/count));
    }
}
