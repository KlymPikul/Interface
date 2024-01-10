package Task_3;
/*
Создайте интерфейс "Client", который содержит метод для отображения информации о клиенте.
Реализуйте интерфейс для классов "PhysicalPerson" и "LegalPerson".
 */
public class Main {
    public static void main(String[] args) {
        PhysicalPerson physicalPerson = new PhysicalPerson("Klym", "Pikul", 34);
        LegalPerson legalPerson = new LegalPerson("Nike", "FC019114");


        physicalPerson.displayInfo();
        legalPerson.displayInfo();

    }
}
