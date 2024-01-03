package constructor;

public class Student3 {
    
    int id;
    String name;

    void display() {
        System.out.println(id + ". " + name);
    }

    public static void main(String[] args) {
        Student3 student1 = new Student3();
        Student3 student2 = new Student3();

        student1.display();
        student2.display();
    }
}
