package Task_5;

public class Programmer implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println(name);
        System.out.println(hourlyRate);
        System.out.println(hoursWorked);
        System.out.println(calculateSalary());
        System.out.println();
    }
}
