import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,4,6,5};

        if(equal(arr1,arr2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static boolean equal(int arr1[],int arr2[]) {
        int N = arr1.length;
        int M = arr2.length;

        if (N != M)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < N; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;

    }
}
