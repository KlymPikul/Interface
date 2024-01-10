package Task_5;
/*
Создайте интерфейс "Employee", содержащий метод для расчета заработной платы и метод для вывода информации о сотрудника.
Реализуйте интерфейс для классов "Programmer" и "Manager".
 */
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Klym", 30.0, 40);
        Manager manager = new Manager("Hayk", 7000.0);

        programmer.displayInfo();
        manager.displayInfo();
    }
}
