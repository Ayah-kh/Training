package DesignPatterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafeSingleton {

    private String[] letters = {"a","b","c","d","e"};

    private List<String> data = Arrays.asList(letters);

    private  static ThreadSafeSingleton instance;

    private static boolean delayMe = true;

    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null) {
            if (delayMe) {
                delayMe = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    private ThreadSafeSingleton(){
        Collections.shuffle(data);
    }

    public void printData() {
        for (String datum : data) {
            System.out.printf("%s", datum);
        }
        System.out.println();
    }

}


