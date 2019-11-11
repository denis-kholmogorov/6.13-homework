import Company.Company;
import Company.Employee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(20000000);

        int salary;
        int sales;

        for (int i = 0; i < 90; i++){
            salary = (int)(20000 + Math.random() * 100000);
            company.acceptEmployee(new Operator(salary));
        }

        for (int i = 0; i < 90; i++){
            salary = (int)(20000 + Math.random() * 150000);
            sales = (int) ((Math.random() * 100000) * 0.05);
            company.acceptEmployee(new SalesManager(salary, sales));
        }

        for (int i = 0; i < 90; i++){
            salary = (int)(40000 + Math.random() * 200000);
            company.acceptEmployee(new TopManager(salary));
        }
        System.out.println("Количество сотрудников - " + company.getCountEmployee());

        System.out.println("Сотрудники с максималльной зарплатой - ");

        ArrayList<Employee> maxSalary = company.getTopSalaryStaff(10);
        for (Employee man: maxSalary){
            System.out.println(man.getMonthSalary() + " у.е.");
        }

        System.out.println("\nСотрудники с минимальной зарплатой - ");

        ArrayList<Employee> minSalary = company.getLowestSalaryStaff(10);
        for (Employee man: minSalary){
            System.out.println(man.getMonthSalary() + " у.е.");
        }
    }
}
