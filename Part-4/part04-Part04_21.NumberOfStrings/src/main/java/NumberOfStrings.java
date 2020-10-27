
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(count>0){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }else{
                count +=1;
            }
        }
        System.out.println(count-1);
    }
}
