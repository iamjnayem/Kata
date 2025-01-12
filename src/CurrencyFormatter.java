import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        Locale usLocale = Locale.US;
        String usCurrency = NumberFormat.getCurrencyInstance(usLocale).format(amount);
        System.out.println("US: " + usCurrency);

        Locale indiaLocale = new Locale("en", "In");
        String indiaCurrency = NumberFormat.getCurrencyInstance(indiaLocale).format(amount);
        System.out.println("India: " + "Rs." + indiaCurrency.substring(1));

        Locale chinaLocale = Locale.CHINA;
        String chinaCurrency = NumberFormat.getCurrencyInstance(chinaLocale).format(amount);
        System.out.println("China: " + chinaCurrency);

        Locale franceLocale = Locale.FRANCE;
        String franceCurrency = NumberFormat.getCurrencyInstance(franceLocale).format(amount);
        System.out.println("France: " + franceCurrency);

    }
}
