public class TriangleApp {
    public static void main(String[] args) {
        // Tworzenie obiektu o nazwie triangle klasy Triangle o adanych wymiarach a,b,c
        Triangle triangle = new Triangle(3,4,5);
        if  (triangle.checkTriangle(triangle) == true)
        {
            System.out.println("\nTrojkąt jest prostokątny.");
        } else {
            System.out.println("\nTrojkąt nie jest prostokątny.");
        }
    } //koniec main
} // koniec klasy TriangleApp

