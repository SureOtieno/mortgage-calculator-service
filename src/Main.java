import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float interest = 0;
        int period = 0;
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        while (true){ System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if (interest > 0 && interest <= 30)
                break;
            System.out.println("Value must be between 0 and 30");
}
        while (true){
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

            double factor = (Math.pow((1 + ((interest / PERCENT) / MONTHS_IN_YEAR)), (period * MONTHS_IN_YEAR)));
            double mortgagor = principal * ((((interest / PERCENT) / MONTHS_IN_YEAR) * factor) / (factor - 1));
            String mortgage = NumberFormat.getCurrencyInstance().format(mortgagor);
            System.out.println("Mortgage Payments: " + mortgage);



    }
}