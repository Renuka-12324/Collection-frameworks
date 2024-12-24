
import java.util.Collections;
import java.util.List;



//public class MaxMinEle{
//    public static void main(String[] args){
//        List<Integer> l = List.of(1,23,43,12,9);
//        int max = MaxFun(l);
//        System.out.println("The max value is: "+ max);
//}
//
//    public static int MaxFun(List<Integer> l){
//        int max = l.get(0);
//        for(int num:l){
//            if (num > max){
//                max = num;
//            }
//        }
//        return max;
//    }
//}







////with using max()
///
//public class MaxMinEle{
//    public static void main(String[] args){
//        List<Integer> l = List.of(1,23,43,126,9);
//        int num = Collections.max(l);
//        System.out.println("The max value is: "+ num);
//    }
//}







//with using min()

//public class MaxMinEle{
//    public static void main(String[] args){
//        List<Integer> l = List.of(1,23,43,126,9);
//        int num = Collections.min(l);
//        System.out.println("The max value is: "+ num);
//    }
//}







// without using min()

public class MaxMinEle{
    public static int MinFun(List<Integer> l){
        int num = l.get(0);
        for(int min:l){
            if(min <num){
                min = num;
            }
        }
        return num;
    }

    public static void main(String[] args){
        List<Integer> l = List.of(1,23,43,126,9);
        int min = MinFun(l);
        System.out.println("The min value is: "+ min);
    }
}

