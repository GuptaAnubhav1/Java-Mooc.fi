import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count =1;
        while(count>0){
            System.out.print("Name:");
            String name1 = scanner.nextLine();
            if(name1.isEmpty()){
                break;
            }
            System.out.print("Duration:");
            int time1 = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name1, time1));
            count +=1;
        }
        
        System.out.println("");
        System.out.print("Program's maximum duration?");
        int max = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram program : programs){
            if(program.getDuration()<=max){
            System.out.println(program.toString());
            }
        }
    }
}
