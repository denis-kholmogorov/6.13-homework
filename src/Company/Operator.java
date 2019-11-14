package Company;

public class Operator implements Employee {
    private int salary;

    public Operator(int salary){
        if (salary >= 0 ) {
            this.salary = salary;
        }
        else{
            System.out.println("Зарплата не может быть отрицательной");
        }
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
