
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        String S ,S1;
        while((S = br.readLine()) != null && (S1 = br.readLine()) != null){
            String text[]= S.split(" ");
            String text2[] = S1.split(" ");
            for (int i =0;i<text.length;i++) {
                if(text[i].contains("av")){
                    System.out.println(text[i]);
                }
            }
            for (int i =0;i<text2.length;i++) {
                if(text2[i].contains("av")){
                    System.out.println(text2[i]);
                }
            }
        }
    }
}
