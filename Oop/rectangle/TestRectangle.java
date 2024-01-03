package rectangle;

public class TestRectangle {
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.insert(20, 32);
        rectangle2.insert(25, 50);

        rectangle1.display();
        rectangle2.display();
    }
}
