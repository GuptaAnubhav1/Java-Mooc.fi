
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int ans;
        while(count>0){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }else{
                int num = Integer.parseInt(input);
                ans = num*num*num; 
                count +=1;
            }
            System.out.println(ans);
        }
        
    }

}

