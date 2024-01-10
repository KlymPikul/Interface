package Task_1;
/*
Создайте интерфейс "Bank", который содержит метод для расчета процентной ставки.
Реализуйте этот интерфейс для классов "SavingsAccount" и "CreditAccount".
 */
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CreditAccount creditAccount = new CreditAccount();

        System.out.println(savingsAccount.calculateInterestRate());
        System.out.println(creditAccount.calculateInterestRate());
    }
}
