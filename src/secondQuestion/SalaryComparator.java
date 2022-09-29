package secondQuestion;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        Double first = o1.Salary;
        Double second = o2.Salary;
        if (first == second) {
            return 0;
        }
        else if (first > second)
            return 1;
        else
            return -1;
          }

    }

