import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello world!");

        String name="ayah";
        System.out.println( "enter name: ");
//        name=scanner.nextLine();



        String phone="6468787";
        int number= Integer.parseInt(phone);
        System.out.println("number = " + number);
        String phone2= String.valueOf(number);
        int age=26;
        int oldAge=24;
        age =oldAge;
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}