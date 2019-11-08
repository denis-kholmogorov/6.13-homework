package Company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Company {

    private static int income;
    private ArrayList<Employee> minSalary = new ArrayList<Employee>();
    private ArrayList<Employee> maxSalary = new ArrayList<Employee>();
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Company(int income){
        if(income >= 0) {
            Company.income = income;
        } else {
            System.out.println("Прибыль не может быть меньше 0");
        }
    }
    public static int getIncome(){
        return income;
    }

    public void acceptEmployee(Employee employee){
        employees.add(employee);
    }

    public void dismissEmployee(Employee employee){
        employees.remove(employee);
    }
    public ArrayList<Employee> getTopSalaryStaff(int count){
        employees.sort(new ReverseSalaryComparator());
        for(int i = 0; i < count; i++){
            maxSalary.add(employees.get(i));
        }
        return maxSalary;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count){
        employees.sort(new SalaryComparator());
        for(int i = 0; i < count; i++){
            minSalary.add(employees.get(i));
        }
        return minSalary;
    }

    public int getCountEmployee(){
        return employees.size();
    }
}
