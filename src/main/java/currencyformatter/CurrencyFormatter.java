package currencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        double payment = sc.nextDouble();
        sc.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(payment);
        String germany = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(payment);
        String serbia = NumberFormat.getCurrencyInstance(new Locale("sr", "RS")).format(payment);


        System.out.println("US: " + us);
        System.out.println("UK: " + uk);
        System.out.println("Germany: " + germany);
        System.out.println("Serbia: " + serbia);
    }
}
