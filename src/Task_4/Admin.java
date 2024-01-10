package Task_4;

public class Admin implements Authorization {
    private  String pasword;

    public  Admin(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public boolean checkPassword(String enteredPassword) {
        return  this.pasword.equals(enteredPassword);
    }
}
