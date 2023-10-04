package Training1.javacollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C","C++","Java","Spring","Hibernate");
//basic loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));

        }
        System.out.println("1===========================");

        //Enhanced for loop
        for (String cours : courses) {
            System.out.println(cours);
        }
        System.out.println("2===========================");

        //Basic loop with iterator

        //iterator with while loop

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            String course = iterator.next();
            System.out.println(course);
        }

        // java 8 -straam and lambda
        System.out.println("java 8 ===========================");
        courses.stream().forEach(course-> System.out.println(course));

        courses.forEach(course-> System.out.println(course));


    }
}
