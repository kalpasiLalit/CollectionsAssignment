package secondQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {

    Double Age;
    Double Salary;
    String Name;


    @Override
    public int compare(Employee o1, Employee o2) {
        Double first = o1.Salary;
        Double second = o2.Salary;

        int age = o1.Age.compareTo(o2.Age);
        return o1.Name.compareTo(o2.Name) ;
    }

}
public  class SecondQuestion {
    public static void main(String[] args) {

        Employee empOne = new Employee();
        Employee empTwo = new Employee();
        Employee empThree = new Employee();
        Employee empFour = new Employee();

      //  List<String> list2 = new ArrayList<String>();
        // initializing fields of Employee Class ..
        empOne.Name = "lalit kalpasi";
        empOne.Age = 21.0;
        empOne.Salary = 30000.0;

        empTwo.Name = "amit kalpasi";
        empTwo.Age = 22.0;
        empTwo.Salary = 100000.0;

        empThree.Name = "sumit pathak";
        empThree.Age = 22.4;
        empThree.Salary = 800000.0;

        empFour.Name = "rahul kandpal";
        empFour.Age = 22.0;
        empFour.Salary = 5000.0;

        // creating the list of instances of class employee
        List<Employee> list = new ArrayList<>();
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
        list.add(empFour);

        //sorting in the based on name
        Collections.sort(list, new Employee());
        for (Employee e : list) {
            System.out.println("name:  "+ e.Name + " age: "+ e.Age  + " salary: " + e.Salary);
        }

        System.out.println("*************sorting based on salary**************");
       // sorting in the based of salary
        Collections.sort(list,new SalaryComparator());
        for (Employee e : list) {
            System.out.println("name:  "+ e.Name + " age: "+ e.Age  + " salary: " + e.Salary);
        }
    }
}
