package Task_3;

public class LegalPerson implements Client {
    private String companyName;
    private String registrationNumber;

    // Конструктор класса
    public LegalPerson(String companyName, String registrationNumber) {
        this.companyName = companyName;
        this.registrationNumber = registrationNumber;
    }

    // Реализация метода интерфейса для отображения информации о юридическом лице
    @Override
    public void displayInfo() {
        System.out.println("Name of the company: " + companyName + ", Company number: " + registrationNumber);
    }
}
