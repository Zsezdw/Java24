package pl.sda.java.intro;

public class FamilyTest {
    public static void main(String[] args) {
        Person Father = new Person("Jan","Nowak", 35);
        Person Mother = new Person("Anna","Nowak", 31);
        Person Child = new Person("Adam", "Nowak", 7);
        System.out.println("\n---");
        System.out.println(Mother.toString());
        System.out.println("Dane ojca:" + Father.getName() +" "+ Father.getSurname() + " " + Father.getAge());
        //System.out.println("Dane matki:" + Mother.getName() +" "+ Mother.getSurname() + " " + Mother.getAge());
        System.out.println("Dane dziecka" + Child.getName() + " " + Child.getSurname() + " " + Child.getAge());

    } // end psvm
} // end class


