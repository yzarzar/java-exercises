package student;

public class TestStudent1 {
    
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.id = 1;
        student1.name = "John Doe";

        student2.id = 2;
        student2.name = "Jim Rocky";

        System.out.println(student1.id + ". " + student1.name);
        System.out.println(student2.id + ". " + student2.name);
    }
}
