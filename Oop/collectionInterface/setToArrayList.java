package collectionInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class setToArrayList {
    
    public static void main(String[] args) {
        
        HashSet<String> name = new HashSet<>();

        name.add("John");
        name.add("Doe");
        name.add("Olivia");
        name.add("Rodrigo");

        
        ArrayList<String> people = new ArrayList<>();

        people.addAll(name);

         System.out.println(people);
        //System.out.println(name);
    }
}
