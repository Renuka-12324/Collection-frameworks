import java.util.Collections;
import java.util.Vector;

public class BinarySearch {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(3);
        v.add(34);
        v.add(31);
        v.add(12);
        v.add(98);

        Collections.sort(v);
        System.out.println("sorted elements: "+ v);

        int index = Collections.binarySearch(v,34);
        System.out.println("Index of given element is: "+index);
    }
}
