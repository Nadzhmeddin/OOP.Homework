package Homework_3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

    // в классе переопределена сортировка возраста по возростанию. 
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getAge(), employee2.getAge());
    }
}
