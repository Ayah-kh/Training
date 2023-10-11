package DesignPatterns.singleton;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        LazySingleton inst1=LazySingleton.getInstance();
//        LazySingleton inst2= LazySingleton.getInstance();
//
//        System.out.println("inst1.hashCode() = " + inst1.hashCode());
//        inst1.printData();
//
//        System.out.println("inst2.hashCode() = " + inst2.hashCode());
//        inst2.printData();



            new DataPrinter().start();
            new DataPrinter().start();

    }
}
class DataPrinter extends Thread{
    @Override
    public void run() {
        ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
        System.out.println("instance.hashCode() = " + instance.hashCode());
        instance.printData();
    }
}