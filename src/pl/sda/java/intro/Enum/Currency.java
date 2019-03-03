package pl.sda.java.intro.Enum;

public enum Currency {

    PLN("zł",1.00),
    USD("$", 3.80),
    EUR("€",  3.28),
    JEN("J", 0.20),
    GPB("Ł", 4.99);

    private String symbol;
    private double kurs;

    Currency(String symbol, double kurs) {
        this.symbol = symbol;
        this.kurs = kurs;
    }
} // koniec public enum
