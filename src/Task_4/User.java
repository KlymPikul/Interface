package Task_4;

public class User implements Authorization {
    private String password;

    public User(String password) {
        this.password = password;
    }

    @Override
    public boolean checkPassword(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }


}
