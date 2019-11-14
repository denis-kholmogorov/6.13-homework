import Company.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(20000000);
        int incomeCompany = Company.getIncome();
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
            company.acceptEmployee(new TopManager(salary, incomeCompany));
        }
        System.out.println("Количество сотрудников - " + company.getCountEmployee());

        System.out.println("Сотрудники с максималльной зарплатой - ");

        List<Employee> maxSalary = company.getTopSalaryStaff(10);
        for (Employee man: maxSalary){
            System.out.println(man.getMonthSalary() + " у.е.");
        }

        System.out.println("\nСотрудники с минимальной зарплатой - ");

        List<Employee> minSalary = company.getLowestSalaryStaff(10);
        for (Employee man: minSalary){
            System.out.println(man.getMonthSalary() + " у.е.");
        }
    }
}
