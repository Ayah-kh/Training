package javacollections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hi");
        list.add("Hello");
        list.add(null);
        System.out.println("list = " + list);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(2) = " + list.get(3));
    }
}