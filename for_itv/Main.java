package for_itv;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public int plusNumber(int x, int y) {
        int plus = x + y;
        return plus;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("PLease Enter a number : ");
        int lastNumber = scanner.nextInt();
        int result = main.plusNumber(firstNumber, lastNumber);
        System.out.println("Plusing " + firstNumber + " and " + lastNumber + " is " + result);
    }
}