package pl.sda.java.intro.encapsulation.task;

public class ZadStrings {
    public static void main(String[] args) {
        String text = "   Ala ma kota";
        String text2 = "Ola ma psa";
        System.out.println("Wynik metody length:" + text.length()); //tekst "Ala ma kota" ma 11 znaków
        System.out.println("Wynik metody toUpperCase:" + text.toUpperCase()); //Zmieni cały tekst na wielkie litery
        System.out.println("Wynik metody konkatenacji:" + text + text2); // I metoda (konkatenacja to łączenie za pomocą plus
        System.out.println("------------------------");
        System.out.println("Wynik metody konkatenacji:" + text.concat(" ").concat(text2)); // II metoda konkatenacji
        System.out.println(" Simon says:" + text);
        System.out.println(text);
        System.out.println(text.trim()); // trim -> usuwanie białych znaków, np. spacji


    } //koniec psvm
} // koniec klasy
