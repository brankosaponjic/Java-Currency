package currencycoverter;

import java.util.InputMismatchException;

public class CurrencyConverter {

    public static Double dinarToEuro(double amount) {
        try {
            if (amount >= 0) {
                amount /= 117.5;
            } else throw new InputMismatchException();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Enter positive number.");
        }
        return amount;
    }

    public static Double euroToDinar(double amount) {
        try {
            if (amount >= 0) {
                amount *= 117.5;
            } else throw new InputMismatchException();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Enter positive number.");
        }
        return amount;
    }
}
