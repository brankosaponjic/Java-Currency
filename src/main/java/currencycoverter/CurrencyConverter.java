package currencycoverter;

public class CurrencyConverter {

    public static Double dinarToEuro(double amount) {
        return amount /= 117.5;
    }

    public static Double euroToDinar(double amount) {
        return amount *= 117.5;
    }
}
