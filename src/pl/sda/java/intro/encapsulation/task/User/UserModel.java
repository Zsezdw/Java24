package pl.sda.java.intro.encapsulation.task.User;

public class UserModel {
    private String firstName;
    private String lastName1;
    //private String lastName2;
    private int age;

    // konstruktor:
    public UserModel(String firstName, String lastName1,/*String lastName2*/ int age) {
        this.firstName = firstName;
        this.lastName1 = lastName1;
        //this.lastName2 = lastName2;
        this.age = age;
    }

    // getter:
    public String getFirstName() {
        return firstName;
    }

    public String getLastName1() {
        return lastName1 /*+ "-" + lastName2*/;
    }

    public int getAge() {
        return age;
    }
}

//refactoring


