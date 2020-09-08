package currencycoverter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose one of to options: ");
        System.out.println("1 - for converting into dinars");
        System.out.println("2 - for converting into euros");
        System.out.print("Your option: ");

        int exchange = sc.nextInt();

        switch (exchange) {
            case 1: {
                System.out.print("Enter your amount: ");
                double amount = sc.nextDouble();
                Double exchangedAmount = CurrencyConverter.euroToDinar(amount);
                System.out.println("Exchanged amount is: " + NumberFormat.getCurrencyInstance(
                        new Locale("sr", "RS")).format(exchangedAmount));
            }
            break;
            case 2: {
                System.out.print("Enter your amount: ");
                double amount = sc.nextDouble();
                Double exchangedAmount = CurrencyConverter.dinarToEuro(amount);
                System.out.println("Exchanged amount is: " + NumberFormat.getCurrencyInstance(
                        Locale.GERMANY).format(exchangedAmount));
            }
            break;
            default:
                System.out.println("You must enter a positive number.");
                break;
        }

    }
}
