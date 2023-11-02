package Homework_3;

import java.util.Comparator;

public class SalaryComparator implements Comparator <Employee> {

    // Создали сортировку списка по возростанию зарплаты, начиная с максимальной до минимума. 
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee2.salary, employee1.salary);
    }
    
}
