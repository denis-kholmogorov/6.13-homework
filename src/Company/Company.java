package Company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private static int income;
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

    public List<Employee> getTopSalaryStaff(int count){
        employees.sort(new SalaryComparator().reversed());
        return employees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count){
        employees.sort(new SalaryComparator());
        return employees.subList(0, count);
    }

    public int getCountEmployee(){
        return employees.size();
    }
}
