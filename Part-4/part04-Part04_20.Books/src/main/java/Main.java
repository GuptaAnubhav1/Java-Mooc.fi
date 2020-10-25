import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> information = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count =1;
        while(count>0){
            System.out.print("Title:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Pages:");
            int num = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            information.add(new Book(name, num, year));
        }
        System.out.print("What information to be printed?");
        String input = scanner.nextLine();
        for(Book book:information){
            if(input.equals("everything")){    
                System.out.println(book.toString());
            }if(input.equals("name")){
                System.out.println(book.getTitle());
            }
        }
        
        }
    }

