//Utwórz klasę Triangle i napisz metodę isRectangular(), która jako argumenty przyjmować będzie trzy liczby całkowite.
// Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
//Wzór który może pomóc: c2 = a2 + b2

public class Triangle {

    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //konstruktor obiektów Triangle:
    public Triangle (double a, double b, double c){
        this.a= a;
        this.b= b;
        this.c= c;


    } // koniec konstruktora Triangle

//Metoda sprawdzająca, czy trójkąt jest prostokątny:

    public  boolean checkTriangle(Triangle trojkat){
        if (trojkat.c*trojkat.c == (trojkat.a*trojkat.a+trojkat.b*trojkat.b))
        {
            return true;
        } else return false;



    } // koniec  CheckTriangle

} // Koniec dla klasy