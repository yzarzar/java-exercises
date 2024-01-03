package methodOverloading;

public class OverloadingCalculation2 {
    
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(Long a, Long b) {
        System.out.println("Long arg method invoked");
    }

    public static void main(String[] args) {
         OverloadingCalculation2 obj = new OverloadingCalculation2();

         obj.sum(20, 20);
    }
}
