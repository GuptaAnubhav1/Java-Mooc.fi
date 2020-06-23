

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int var = Integer.valueOf(scanner.nextLine());
        
        int found = 0, x;
        for(x=0; x<array.length;x++){
            if(array[x]==var){
                found = 1;
                break;
            }else{
                found = 0;               
            }
        }
        if(found==1){
            System.out.println(var+" is at index "+x +".");
        }else{
            System.out.println(var+" was not found.");
        }
    }

}
