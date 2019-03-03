package pl.sda.java.intro.encapsulation.task;

public class Zadanie3Petla {
    public static void main(String[] args) {
        System.out.println("Pierwsza metoda - FOR");
        //char znak;
        // Rozwiązanie metodą for:
        int licznik;
        for (licznik='A'; licznik<='Z'; licznik=licznik+2){
            System.out.print((char)licznik +" ");
        } // koniec pętli

        System.out.println("\nDruga metoda - while");
        //Rozwiązanie pętlą while
        licznik='A';
        while (licznik<='Z'){
            System.out.print((char)licznik);
            licznik=licznik+2;


        } // koniec while

    } // koniec psvm
}
