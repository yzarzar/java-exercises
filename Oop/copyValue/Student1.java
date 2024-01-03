package copyValue;

public class Student1 {
    
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student1(Student1 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + ". " + name);
    }

    public static void main(String[] args) {
        Student1 student = new Student1(1, "Student1");
        Student1 student2 = new Student1(student);

        student2.display();
    }
}
