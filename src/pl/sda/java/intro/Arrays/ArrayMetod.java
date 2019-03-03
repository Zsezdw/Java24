package pl.sda.java.intro.Arrays;

public class ArrayMetod {



    public static void main(String[] args) {
        //tworzenie obiektu:
        Tablica test=new Tablica();
        String[] tablica= {"Jeden","Dwa","Trzy","Cztery"};
        // wykorzystanie metody na utworzonym obiekcie
        //test.wyswietl(tablica); <-- Pierwsza metoda zrobienia
        test.wyswietl("jeden","dwa","trzy", "cztery");  // <- Druga metoda zrobienia, ale za pomocą varargs

    }

} // Tu sie kończy klasa
