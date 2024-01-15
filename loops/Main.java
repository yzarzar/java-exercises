package loops;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int weeks = 4;
        int days = 7;
        int months = 12;
        int years = 4;

        for (int year = 1; year <= years; year++) {
            System.out.println("Year : " + year);
            
            for (int month = 1; month <= months; month++) {
                System.out.println("  Month : " + month);
                
                for (int week = 1; week <= weeks; week++) {
                    System.out.println("    Week : " + week);
                    
                    for (int day = 1; day <= days; day++) {
                        System.out.println("      Day : " + day);
                    }
                }
            }
        }
    }
}
