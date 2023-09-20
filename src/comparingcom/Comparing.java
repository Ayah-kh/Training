package comparingcom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparing {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell",16,800));
        laptops.add(new Laptop("Apple",8,1200));
        laptops.add(new Laptop("Acer",12,700));

        laptops.forEach(System.out::println);
        System.out.println("======================================");
        laptops.sort(Comparator.comparingInt(Laptop::getPrice));
        laptops.forEach(System.out::println);


    }
}
