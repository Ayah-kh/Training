package DesignPatterns.singleton2;

public class EagerSingleton {

    //Private instance variable
    private static EagerSingleton instance = new EagerSingleton();

    //private constructor
    private EagerSingleton() {
    }

    //Public static getter
    public static EagerSingleton getInstance(){
        return instance;
    }
}
