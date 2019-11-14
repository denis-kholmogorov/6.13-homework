package Company;

public class SalesManager implements Employee {

    private int salary;
    private int sales;

    public SalesManager(int salary, int sales){
        if (salary >= 0 && sales >= 0) {
            this.salary = salary;
            this.sales = sales;
        }
        else{
            System.out.println("Зарплата и продажи не могут быть отрицательными");
        }
    }

    @Override
    public int getMonthSalary() {
        return salary + sales;
    }
}
