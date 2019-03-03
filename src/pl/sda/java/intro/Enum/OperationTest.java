package pl.sda.java.intro.Enum;

public class OperationTest {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(1.1,2.2));
        System.out.println(Operation.MINUS.calculate(1.1,2.2));
        System.out.println(Operation.MULTIPLY.calculate(1.1,2.2));
        System.out.println(Operation.DIVIDE.calculate(1.1,2.2));
    }
}
