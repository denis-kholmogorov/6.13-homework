package Company;

public class TopManager implements Employee {

    private int salary;
    private int incomeCompany;

    public TopManager(int salary, int incomeCompany) {
        if (salary >= 0 && incomeCompany >= 0) {
            this.salary = salary;
            this.incomeCompany = incomeCompany;
        }
        else{
            System.out.println("Зарплата и прибыль не может быть отрицательной");
        }
    }

    @Override
    public int getMonthSalary() {
        if (incomeCompany >= 10000000){
            return salary + 100000;
        }
        return salary;

    }
}



