package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> numberMapping = new HashMap<>();

        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        System.out.println("numberMapping = " + numberMapping);

        System.out.println("numberMapping.containsKey(\"Four\") = " + numberMapping.containsKey("Four"));
        System.out.println("numberMapping.containsValue(3) = " + numberMapping.containsValue(3));

        for (Map.Entry<String,Integer> entry: numberMapping.entrySet()){
            System.out.println("Key: "+entry.getKey()+
                    ", value: "+entry.getKey());
        }

        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        numberMapping.forEach((K,V)-> System.out.println(K+" K:V "+V));
        System.out.println("=========================================");

        Map<StudentCol,Integer> studentMap = new HashMap<>();
        studentMap.put(new StudentCol(1,"Ramesh","Fadatare"),10);
        studentMap.put(new StudentCol(2,"Tony","Stark"),20);
        studentMap.put(new StudentCol(3,"umesh","Fadatare"),30);
        studentMap.put(new StudentCol(3,"umesh","Fadatare"),40);

        System.out.println(studentMap);


    }
}
