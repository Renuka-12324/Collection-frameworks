import java.util.*;

class LinkedHash {

    public static void main(String args[]) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(3, "Hi");
        lhm.put(2, "Hello");
        lhm.put(1, "Everyone");

        System.out.println(""+ lhm);

        lhm.put(2,"Welcome");
        System.out.println(""+lhm);           //Update

        lhm.remove(1);
        System.out.println(lhm);
    }
}