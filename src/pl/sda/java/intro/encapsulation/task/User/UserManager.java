package pl.sda.java.intro.encapsulation.task.User;

public class UserManager {
    public UserModel user;

    private void createUser(String firstName, String lastName1, int age) {
        user = new UserModel(firstName, lastName1, age );
    }

    protected UserModel getUser() {
        return user;
    }
}
