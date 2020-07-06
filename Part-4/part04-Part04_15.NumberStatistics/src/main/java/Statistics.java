
import java.util.ArrayList;

public class Statistics {
    private int count;
    private int sum;
    private final ArrayList<Integer> list = new ArrayList<>();
    public Statistics(){
        
    }
    public void addNumber(int number){
        this.count+=1;
        this.sum += number;
        this.list.add(number);
        int y=0;
        for(int i=0;i<list.size();i++){
            y +=list.get(i);
        }
        this.sum = y;
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        if(this.count>0){
            return 1.0* this.sum/this.count;
        }else{
            return 0.0;
        }
    }

}
    

