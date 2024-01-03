package copyValue;

public class Student7 {
    
    int id;
    String name;

    Student7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student7(){}

    void display() {
        System.out.println(id + ". " + name);
    }

    public static void main(String[] args) {
        Student7 student1 = new Student7(23, "Zaw One");
        Student7 student2 = new Student7();

        student2.id = student1.id;
        student2.name = student1.name;

        student1.display();
        student2.display();
    }
}
