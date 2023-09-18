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

        fruits.addFirst("Strawberry");
        System.out.println("fruits = " + fruits);

        fruits.addLast("orange");
        System.out.println("fruits = " + fruits);
        System.out.println("============================");
        String first = fruits.getFirst();
        String last = fruits.getLast();
        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("fruits = " + fruits);
        String s = fruits.get(3);
        System.out.println("s = " + s);
        System.out.println("============================");
        String s1 = fruits.removeFirst();
        String s2 = fruits.removeLast();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("fruits = " + fruits);
        String s3 = fruits.remove(1);
        System.out.println("s3 = " + s3);
        System.out.println("fruits = " + fruits);

    }
}
