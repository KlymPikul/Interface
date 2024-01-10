package Task_6;

public class EmployeeManager {
    public static Worker highestPaidEmployee(Worker[] workers) {
        Worker highestPaid = workers[0];
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary() > highestPaid.getSalary()) {
                highestPaid = workers[i];
            }
        }
        return highestPaid;
    }
}

