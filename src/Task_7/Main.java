package Task_7;
/*
Создайте массив из 6 работников и напишите цикл,
который выводит информацию о сотруднике с наибольшей зарплатой.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Manager("Виктория", 50000);
        employees[1] = new Manager("Мария", 60000);
        employees[2] = new Manager("Клим", 75000);
        employees[3] = new Manager("Екатерина", 55000);
        employees[4] = new Manager("Дмитрий", 70000);
        employees[5] = new Manager("Хайк", 80000);

        Employee highestPaidEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > highestPaidEmployee.getSalary()) {
                highestPaidEmployee = employee;
            }
        }


        System.out.println("Сотруднике с наибольшей зарплатой:");
        System.out.println("Имя: " + highestPaidEmployee.getName());
        System.out.println("Зарплата: " + highestPaidEmployee.getSalary());

    }
}
