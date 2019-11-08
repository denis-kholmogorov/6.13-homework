import Company.Company;
import Company.Employee;

public class TopManager implements Employee {

    private int salary;

    public TopManager(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        if (Company.getIncome() >= 10000000){
            return salary + 100000;
        }
        return salary;

    }
}



