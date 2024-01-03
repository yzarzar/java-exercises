package rectangle;

public class Rectangle {
    
    int length;
    int width;

    void insert(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println(length * width);
    }
}
