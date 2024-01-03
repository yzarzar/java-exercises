package constructor;

public class Student {
    
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + ". " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student(12, "Fucking Teacher");
        Student student2 = new Student( 23, "Robert Oliver");

        student1.display();
        student2.display();
    }
}
