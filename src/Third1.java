
import java.util.*;

class SpecialStack1  {


    int index=0;
    int defaultSize = 10;
    int[] array = new int[defaultSize];


    void  push(int ele){
        array[index] = ele;
        index++;
    }

    Integer getMin() {
        int minEle = array[0];
        for (int i =1;i < array[index];i++){
            if(minEle > array[i]){
                minEle = array[i];
            }
        }
        return  minEle;
    }

    Integer  pop(){
        int lastE = 0;
        if(index !=0)  {
            lastE = array[index - 1];
            array[index - 1] = 0;
            index--;
        }
        return  lastE;
    }
    boolean isEmpty(){
        if (index == 0)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if (defaultSize == index)
            return true;
        else
            return false;
    }




}

public  class Third1 {
    public static void main(String[] args) {
        SpecialStack1 list = new SpecialStack1();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        System.out.println(Arrays.toString(list.array));
        System.out.println("pop element : "+ list.pop());
        System.out.println("after pop: "+Arrays.toString(list.array));
        System.out.println("isEmpty: "+list.isEmpty());
        System.out.println("isFull: "+list.isFull());
        System.out.println("minimum value: " + list.getMin());

        System.out.println();


    }
}
