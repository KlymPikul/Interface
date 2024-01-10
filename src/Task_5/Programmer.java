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
    public double salary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void info() {
        System.out.println(name);
        System.out.println(hourlyRate);
        System.out.println(hoursWorked);
        System.out.println(salary());
        System.out.println();
    }
}
