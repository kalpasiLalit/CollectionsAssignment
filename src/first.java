import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class first {
    List<Float> list = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    void inputNumbers(){
        System.out.println("Enter 5 Float numbers: ");
        for (int i =0; i< 5 ;i++){
            list.add(in.nextFloat());
        }

    }

    float addNumbers(){
        Iterator<Float> i = list.iterator();
        float sum = 0;
        while (i.hasNext()){

           sum += i.next();
        }
        return  sum ;
    }
    public static void main(String[] args) {

       first obj = new first();
       obj.inputNumbers();
        System.out.println("sum: " + obj.addNumbers());
    }
}
