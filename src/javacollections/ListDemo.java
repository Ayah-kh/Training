package javacollections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

//        System.out.println("fruits = " + fruits);

        List<Integer> first5PrimeNumbers = new ArrayList<>();
        first5PrimeNumbers.add(2);
        first5PrimeNumbers.add(3);
        first5PrimeNumbers.add(5);
        first5PrimeNumbers.add(7);
        first5PrimeNumbers.add(11);

//        System.out.println("first5PrimeNumbers = " + first5PrimeNumbers);

        List<Integer> first10PrimeNumbers = new ArrayList<>(first5PrimeNumbers);
//        System.out.println("first10PrimeNumbers = " + first10PrimeNumbers);

        List<Integer> next5=new ArrayList<>();
        next5.add(13);
        next5.add(17);
        next5.add(19);
        next5.add(23);
        next5.add(29);

        first10PrimeNumbers.addAll(next5);
//        System.out.println("first10PrimeNumbers = " + first10PrimeNumbers);

        List<String> programLanguage = new ArrayList<>();
        System.out.println("programLanguage.isEmpty() = " + programLanguage.isEmpty());

        programLanguage.add("C");
        programLanguage.add("Java");
        programLanguage.add("C++");
        programLanguage.add("Python");
        programLanguage.add(".net");

        System.out.println("programLanguage.isEmpty() = " + programLanguage.isEmpty());
        System.out.println("programLanguage.size() = " + programLanguage.size());
        System.out.println("programLanguage = " + programLanguage);

        String lang = programLanguage.get(1);
        System.out.println("lang = " + lang);




    }
}