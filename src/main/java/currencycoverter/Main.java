package currencycoverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyExchangerImplEuroIntoRSD euroIntoRSD = new CurrencyExchangerImplEuroIntoRSD();
        CurrencyExchangerImplRSDIntoEuro rsdIntoEuro = new CurrencyExchangerImplRSDIntoEuro();

        System.out.println("Choose one of to options: ");
        System.out.println("1 - for converting into dinars");
        System.out.println("2 - for converting into euros");
        System.out.print("Your option: ");

        try{
            int exchange = sc.nextInt();
            if (exchange >0 && exchange <=2) {
                switch (exchange) {
                    case 1: {
                        System.out.print("Enter your amount: ");
                        double amount = sc.nextDouble();
                        if (!(amount >= 0)) {
                            System.out.print("You must enter amount that is not negative: ");
                            amount = sc.nextDouble();
                        }
                        euroIntoRSD.exchange(amount);
                    }
                    break;
                    case 2: {
                        System.out.print("Enter your amount: ");
                        double amount = sc.nextDouble();
                        if (!(amount >= 0)) {
                            System.out.print("You must enter amount that is not negative: ");
                            amount = sc.nextDouble();
                        }
                        rsdIntoEuro.exchange(amount);
                    }
                    break;
                    default:
                        System.out.println("You must enter a positive number.");
                        break;
                }
            }else {
                System.out.println("Wrong input! Enter either 1 or 2.");
                main(args);
            }
        }catch (InputMismatchException e){
            System.out.println("Do not enter letters or characters! Enter either 1 or 2.");
            main(args);
        }
    }
}
