package Task_5;

public class Manager implements Employee {
    private String name;
    private double monthlySalary;

    public Manager(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        System.out.println(name);
        System.out.println(monthlySalary);
        System.out.println();
    }

}
