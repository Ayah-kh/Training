package DesignPatterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingleton {
    private String[] letters = {"a","b","c","d","e"};

    private List<String> data = Arrays.asList(letters);

    public LazySingleton (){
        Collections.shuffle(data);
    }

    public void printData() {
        for (String datum : data) {
            System.out.printf("%s", datum);
        }
        System.out.println();
    }

}


