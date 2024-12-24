
import java.util.*;

class ArrayToCollection {
    public static void main(String[] args)
    {
//        String countryArray[] = { "India","Pakistan","Afganistan","Srilanka" };
//        List<String> countryList = new ArrayList<>();
//        Collections.addAll(countryList, countryArray);                                       // using addAll()
//        System.out.println("Converted ArrayList elements: " + countryList);


        String countryArray[] = { "India","Pakistan","Afganistan","Srilanka" };
        List<String> countryList = Arrays.asList(countryArray);                               //using Arrays.asList()
        System.out.println("Converted ArrayList elements: " + countryList);
    }
}