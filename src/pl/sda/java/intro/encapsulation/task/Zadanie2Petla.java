package pl.sda.java.intro.encapsulation.task;

public class Zadanie2Petla {
    public static void main(String[] args) {
       int a;
       int n; // wykładnik potęgi
       int wynik;

       a=2;
       n=8;
       wynik=1;
       for(int i=1; i<=n; i++){
           wynik=wynik*a;
       }//koniec pętli
        System.out.println("wynik=" + wynik);
    } // koniec psvm
}
