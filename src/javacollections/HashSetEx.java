package javacollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> languages= new HashSet<>();
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python");
        languages.add("Scala");

        System.out.println("languages = " + languages);
        languages.add("Java");
        System.out.println("languages = " + languages);

        int[] arr= {11,12,12,8,963,74,56,20,33,66,54,23,13,14,20};
        Set<Integer> collect = IntStream.of(arr).boxed()
                .collect(Collectors.toSet());
        System.out.println("collect = " + collect);

//        Set<Integer> integers=new HashSet<>(Arrays.asList(arr));
//        System.out.println("integers = " + integers);

    }
}
