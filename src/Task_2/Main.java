package Task_2;
/*
Создайте интерфейс "Transport", который содержит метод для расчета расхода топлива.
Реализуйте интерфейс для классов "Car" и "Airplane".
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();

        System.out.println(car.calculateFuelConsumption());
        System.out.println(airplane.calculateFuelConsumption());
    }
}
