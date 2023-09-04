import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=5;
        System.out.println("n = " + n);
        System.out.println("n++ = " + n++);
        System.out.println("n = " + n);
        System.out.println("++n = " + ++n);

        int age=15;
        if (age>18){
            System.out.println("welcome, age: "+age);
        }
        else{
            System.out.println("to school, age: "+age);
        }
        System.out.println("test");
        System.out.println("=========================");

        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome ,"+i);
        }


    }
}