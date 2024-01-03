package constructorOverloading;

public class Student {
    
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + ". " + name + " (age : " + age + ")");
    }

    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Hill Nic", 23),
        student2 = new Student(3, "Zur Dick", 12);

        student1.display();
        student2.display();
    }
}
