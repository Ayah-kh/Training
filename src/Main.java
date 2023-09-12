import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers={1,1,2,2,2,3,4,4,5,5,5};
        Set<Integer> set=new HashSet<>(Arrays.asList(numbers));
        System.out.println("list = " + set);
        Set<Integer> set1=Set.of(5,6,4,7,8,9);
    }


}