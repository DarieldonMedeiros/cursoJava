package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarPrice;
    public static double dollar;

    public static double dollarToReal() {
        return dollar * (1 + IOF) * dollarPrice;
    }
}
