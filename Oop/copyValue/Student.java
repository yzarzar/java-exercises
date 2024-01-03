package copyValue;

public class Student {
    
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + ". " + name);
    }

    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Student1");
        Student student2 = new Student(student1);

        student1.display();
        student2.display();
    }
}
