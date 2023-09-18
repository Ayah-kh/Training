package javacollections;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {


        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");

        System.out.println("fruits = " + fruits);
        fruits.add(2,"watermelon");
        System.out.println("fruits = " + fruits);
    }
}
