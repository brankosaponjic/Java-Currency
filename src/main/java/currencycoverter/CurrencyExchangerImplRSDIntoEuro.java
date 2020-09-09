package currencycoverter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExchangerImplRSDIntoEuro implements CurrencyExchanger {
    @Override
    public void exchange(double amount) {
        Double exchangedAmount = CurrencyConverter.dinarToEuro(amount);
        System.out.println("Exchanged amount is: " + NumberFormat.getCurrencyInstance(
                Locale.GERMANY).format(exchangedAmount));
    }
}
