package currencycoverter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExchangerImplEuroIntoRSD implements CurrencyExchanger {
    @Override
    public void exchange(double amount) {
        Double exchangedAmount = amount*117.5;
        System.out.println("Exchanged amount is: " + NumberFormat.getCurrencyInstance(
                new Locale("sr", "RS")).format(exchangedAmount));
    }
}
