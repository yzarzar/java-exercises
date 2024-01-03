package object;

public class TestRectangle {
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(),
        rectangle2 = new Rectangle(),
        rectangle3 = new Rectangle();

        rectangle.insert(10, 20);
        rectangle2.insert(98, 34);
        rectangle3.insert(23, 34);

        rectangle.calculateArea();
        rectangle2.calculateArea();
        rectangle3.calculateArea();
    }
}
