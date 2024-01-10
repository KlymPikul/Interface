package Task_4;
/*
Создайте интерфейс "Authorization", содержащий метод для проверки правильности введенного пароля.
Реализуйте интерфейс для классов "User" и "Admin".
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("userPassword");
        Admin admin = new Admin("adminPassword");

        System.out.println(user.checkPassword("userPassword"));
        System.out.println(admin.checkPassword("admin"));
    }
}
