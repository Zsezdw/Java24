package pl.sda.java.intro.Enum;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;
    private double calculate;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

     public double calculate(double a, double b){
         double result = 0.0;
         switch (this){ // wartość enuma, do której się odwołujemy w miejscu użycia w kodzie main
             case PLUS:
             result= a+b;
             break;
             case MINUS:
                 result= a-b;
                 break;
             case MULTIPLY:
                 result= a*b;
                 break;
             case DIVIDE:
                 result= a/b;
                 break;
         }
         return result;
    }
}
