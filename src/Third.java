
import java.util.*;

class  SpecialStack<T>  {

int defaultSize = 10;
int index = 0;

    T[] array1;

     public SpecialStack() {

         array1 = (T[]) new Object[defaultSize];

     }

     void  push(T obj){
      array1[index] = obj;
      index++;
  }

//      T getMin(){
//          List<T> list = Arrays.asList(array1);
//          Collections.sort(list);
//          return list.get(0);
//      }


    T  pop(){
          T lastE = null;
           if(index != 0) {
           lastE = array1[index-1];
           array1[index - 1] = null;
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

     @Override
     public String toString() {
         return Arrays.toString(array1);
     }


 }

public  class Third {
    public static void main(String[] args) {
        SpecialStack<Integer> list = new SpecialStack();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        System.out.println(list.toString());
        System.out.println("pop element : "+ list.pop());
        System.out.println("after pop: "+ list.toString());
        System.out.println("isEmpty: "+list.isEmpty());
        System.out.println("isFull: "+list.isFull());

        System.out.println();


    }
}
