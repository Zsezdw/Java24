package pl.sda.java.intro.Arrays;

public class Tablica {
  // private String[] numbers; //= String[4]; // ={"Jeden","Dwa","Trzy","Cztery"};

    //public void wyswietl(String[] mojaTablica){ <- pierwszy sposób
    public void wyswietl(String... mojaTablica){ // <- drugi sposób z varargs
        for (String i : mojaTablica) {
            System.out.print(" " + i);
        } // Tu się kończy FOR
    } // Tu się kończy metoda wyświetl


    // Tworzenie konstruktora:


//    public Tablica(String s1, String s2, String s3, String s4) {
//        this.numbers[0] = s1;
//        this.numbers[1] = s2;
//        this.numbers[2] = s3;
//        this.numbers[3] = s4;
//    }


    } //main
