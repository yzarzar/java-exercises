package methodOverriding;

public class Test {
    
    public static void main(String[] args) {
        
        Sbi sbi = new Sbi();
        Axis axis = new Axis();
        Icici icici = new Icici();

        System.out.println(sbi.getRateOfInterest());
        System.out.println(axis.getRateOfInterest());
        System.out.println(icici.getRateOfInterest());
    }
}
