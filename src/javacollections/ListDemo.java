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

        System.out.println("fruits = " + fruits);

        List<Integer> first5PrimeNumbers = new ArrayList<>();
        first5PrimeNumbers.add(2);
        first5PrimeNumbers.add(3);
        first5PrimeNumbers.add(5);
        first5PrimeNumbers.add(7);
        first5PrimeNumbers.add(11);

        System.out.println("first5PrimeNumbers = " + first5PrimeNumbers);

        List<Integer> first10PrimeNumbers = new ArrayList<>(first5PrimeNumbers);
        System.out.println("first10PrimeNumbers = " + first10PrimeNumbers);


    }
}