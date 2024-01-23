import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double interest = scanner.nextDouble();
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        double factor = (Math.pow((1 + ((interest/100)/12)), (period * 12)));
        double mortgagor = principal * ((((interest/100)/12) * factor)/(factor - 1));
        String mortgage = NumberFormat.getCurrencyInstance().format(mortgagor);
        System.out.println("Mortgage Payments: " +  mortgage);


    }
}