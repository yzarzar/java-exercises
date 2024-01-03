package student;

public class TestStudent4 {
    public static void main(String[] args) {
        
        Student1 student1 = new Student1();
        Student1 student2 = new Student1();

        student1.insertRecord(10, "Kio");
        student2.insertRecord(20, "Tom Son");

        student1.displayInformation();
        student2.displayInformation();
    }
}
