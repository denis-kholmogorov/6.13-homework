package Company;

import Company.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getMonthSalary() > o2.getMonthSalary()){
            return 1;
        }
        if (o1.getMonthSalary() < o2.getMonthSalary()){
            return -1;
        }
        return 0;
    }
}
