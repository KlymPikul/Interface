package Task_7;

public class Manager implements Employee {
    private String name;
    private double salary;

    public Manager (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
