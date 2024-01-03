package methodOverriding;

public class Bike1 extends Vehicle{

    void run() {
        System.out.println("Vehicle is running safely");
    }
    
    public static void main(String[] args) {
        
        Bike1 bike1 = new Bike1();
        bike1.run();
    }
}
