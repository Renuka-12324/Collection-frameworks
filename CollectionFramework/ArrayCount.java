import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayCount {
   /* public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int count = numbers.length;

        System.out.println("The array has " + count + " elements.");
    }
    */



    /*     //ArrayList
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Ani");
            names.add("Bob");
            names.add("Charlie");

            int count = names.size();

            System.out.println("The ArrayList has " + count + " elements.");
        }
     */


    public static void main(String[] args){
        int[] numbers = {1,2,3,1,4,2,5,3,6};
        Map<Integer,Integer> count = new HashMap<>();

        for(int num:numbers){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        System.out.println("Elements count: ");
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }
    }

}