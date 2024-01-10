package Task_3;

public class PhysicalPerson implements Client {
    private String name;
    private String surName;
    private int age;

    public PhysicalPerson(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + " Surname: " + surName + " Age: " + age);
    }
}
