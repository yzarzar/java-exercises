package object;

/**
 * Calculation
 */
public class Calculation {

    void fact(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i ++) {
            fact = fact + 1;
        }

        System.out.println("factorial is " + fact);
    }

    public static void main(String[] args) {
        new Calculation().fact(5);
    }
}