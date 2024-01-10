package Task_6;

/*
Создайте массив из 6 работников и напишите цикл,
который выводит информацию о сотруднике с наибольшей зарплатой.
 */
public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[6];
        workers[0] = new Employee("Артём", 50000.0);
        workers[1] = new Employee("Виктория", 60000.0);
        workers[2] = new Employee("Алексей", 55000.0);
        workers[3] = new Employee("Хайк", 70000.0);
        workers[4] = new Employee("Мария", 48000.0);
        workers[5] = new Employee("Клим", 75000.0);

        // Поиск сотрудника с наибольшей зарплатой
        Worker highestPaid = EmployeeManager.highestPaidEmployee(workers);

        // Вывод информации о сотруднике с наибольшей зарплатой
        System.out.println("Сотрудник с наибольшей зарплатой:");
        System.out.println(highestPaid.getName());
        System.out.println(highestPaid.getSalary());

    }
}
