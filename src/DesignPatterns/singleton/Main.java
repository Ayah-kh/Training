package DesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton inst1= new LazySingleton();
        LazySingleton inst2= new LazySingleton();

        inst1.printData();
        inst2.printData();
    }
}
