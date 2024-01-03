package employee;

public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.insert(1, "Olivia", 200.50);
        employee2.insert(2, "Tram", 23.5);
        employee3.insert(3, "Mark Ford", 3000.50);

        employee1.display();
        employee2.display();
        employee3.display();
    }
}
