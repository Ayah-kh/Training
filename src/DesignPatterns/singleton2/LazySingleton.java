package DesignPatterns.singleton2;

public class LazySingleton {

    //Private instance variable
    private static LazySingleton instance = null;

    //private constructor
    private LazySingleton(){

    }

    //Public static getter
    public static LazySingleton getInstance(){
        if (instance==null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}
