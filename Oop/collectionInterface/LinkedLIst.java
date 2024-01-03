package collectionInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIst {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("List : " + numbers);

        int number = numbers.get(2);
        System.out.println("This is the number : " + number);

        int indexOf = numbers.indexOf(2);
        System.out.println("IndexOf : " + indexOf);

        int removerNumber = numbers.remove(1);
        System.out.println("number is removed :" + removerNumber);

        boolean removeAll = numbers.removeAll(numbers);
        System.out.println("Remove All : " + removeAll);
    }
}
