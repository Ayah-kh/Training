package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List <Employee> employees=new ArrayList<>();
        employees.add(new Employee(10,"Ramesh",30,400000));
        employees.add(new Employee(20,"Santosh",29,350000));
        employees.add(new Employee(30,"Sanjay",30,450000));
        employees.add(new Employee(40,"Pramod",29,500000));

        Collections.sort(employees,new MySort());

        employees.forEach(s-> System.out.println(s));



    }
}

class MySort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary()-o1.getSalary());
    }
}
