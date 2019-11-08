import Company.Employee;

public class SalesManager implements Employee {

    private int salary;
    private int sales;

    public SalesManager(int salary, int sales){
        this.salary = salary;
        this.sales = sales;
    }

    @Override
    public int getMonthSalary() {
        return salary + sales;
    }
}
