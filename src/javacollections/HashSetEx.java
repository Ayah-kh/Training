package javacollections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    }
}
