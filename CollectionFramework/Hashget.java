/*
import java.util.*;

public class Hashget {
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Hi", 10);
        map.put("4", 15);
        map.put("Hello", 20);
        map.put("Welcomes", 25);
        map.put("You", 30);

        System.out.println("Initial Mappings are: " + map);

        System.out.println("The Value is: " + map.get("Hi"));

        System.out.println("The Value is: " + map.get("You"));
    }
}
*/



import java.util.*;

public class Hashget {
    public static void main(String[] args)
    {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(10, "Hi");
        map.put(15, "4");
        map.put(20, "Hello");
        map.put(25, "Welcomes");
        map.put(30, "You");

        System.out.println("Initial Mappings are: " + map);

        System.out.println("The Value is: " + map.get(25));

        System.out.println("The Value is: " + map.get(10));
    }
}
