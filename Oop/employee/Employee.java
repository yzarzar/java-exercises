package employee;

public class Employee {

    int id;
    String name;
    double salary;

    void insert(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + ". " + name + " (" + salary + ")");
    }
}
