import java.util.HashMap;
import java.util.Map;

class Employee1  {

     String name ;
     int age ;
     String designation;

    public Employee1(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
}
public class Fourth {

    public static void main(String[] args) {

        Employee1 employeeOne = new Employee1("lalit ",22,"SE");
        Employee1 employeeTwo = new Employee1("mohan",22,"QE");
        Employee1 employeeThree = new Employee1("rohit",23,"devops");
        Employee1 employeeFour = new Employee1("vineet",24,"AEM");



        HashMap<Employee1, Double> map = new HashMap<>();
        map.put(employeeOne,30000.0);
        map.put(employeeTwo,40000.0);
        map.put(employeeThree,50000.0);
        map.put(employeeFour,60000.0);

        for (Map.Entry<Employee1,Double> e: map.entrySet()) {
            Employee1 ex=e.getKey();
            System.out.println("name:: " + ex.name + " " + "age:: " + ex.age +" " +
                         "Designation:: "  +    ex.designation +" " +"salary :: "+e.getValue());

        }


    }

}
