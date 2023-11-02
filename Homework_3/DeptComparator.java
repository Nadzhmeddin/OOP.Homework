package Homework_3;

import java.util.Comparator;

public class DeptComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return String.compare(e1.nameDept, e2.nameDept);
    }

    
    
}
