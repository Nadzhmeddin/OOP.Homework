package Homework_3;

import java.util.Set;
import java.util.TreeSet;

public class Homework3Main  {
    /**
   * Реализовать класс Сотрудник (Employee) c полями:
   * 1. Имя
   * 2. Возраст
   * 3. Зарплата
   * 4. Наименование департамента
   *
   * Необходимо:
   * 1. Создать список из разных сотрудников (штук 20)
   * 2. Отсортировать список по возрастанию возраста, по убыванию зарплаты, и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
   * Подумать о том, какую сортирвку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
   */
    
    
    public static void main(String[] args) {

        // Создаем лист из сотрудников с указанием Имени, Возраста, Зарплаты и наименования депортамента.

        Set<Employee> employeeList = new TreeSet<>();
        employeeList.add(new Employee("Владимир", 30, 150, "Охранник"));
        employeeList.add(new Employee("Сергей", 32, 250, "Менеджер"));
        employeeList.add(new Employee("Евгений", 25, 200, "Логист"));
        employeeList.add(new Employee("Александр", 45, 350, "Помощник директора"));
        employeeList.add(new Employee("Юрий", 62, 400, "Охранник"));
        employeeList.add(new Employee("Ярослав", 52, 320, "Бухгалтер"));
        employeeList.add(new Employee("Владислав", 22, 170, "Уборщик"));
        employeeList.add(new Employee("Даниил", 75, 230, "Сопровожденец"));
        employeeList.add(new Employee("Ярополк", 60, 410, "Дальнобойщик"));
        employeeList.add(new Employee("Артем", 44, 300, "Водитель"));
        employeeList.add(new Employee("Дмитрий", 67, 290, "Механик"));
        employeeList.add(new Employee("Антон", 56, 100, "Уборщик"));
        employeeList.add(new Employee("Георгий", 82, 95, "Дворник"));
        employeeList.add(new Employee("Святослав", 44, 500, "Заместитель директора"));
        employeeList.add(new Employee("Денис", 34, 430, "Старший бухгалтер"));
        employeeList.add(new Employee("Захар", 90, 440, "Упаковщик"));
        employeeList.add(new Employee("Илья", 41, 105, "Представитель"));
        employeeList.add(new Employee("Валерий", 29, 295, "Секретарь"));
        employeeList.add(new Employee("Вадим", 39, 345, "Заведующий столовой"));
        employeeList.add(new Employee("Василий", 79, 540, "Технадзор"));
        employeeList.add(new Employee("Виктор", 89, 670, "Директор"));

        System.out.println(employeeList);

        employeeList.DeptComparator((e1,e2) -> String.compare(e1.nameDept, e2.nameDept));

        

        // 

        // 
        // SalaryComparator salaryComparator = new SalaryComparator();
        // DeptComparator deptComparator = new DeptComparator();
        // Set<Employee> employeeList2 = new TreeSet<>(deptComparator);

        // employeeList2.add(new Employee("Владимир", 30, 150, "Охранник"));
        // employeeList2.add(new Employee("Сергей", 32, 250, "Менеджер"));
        // employeeList2.add(new Employee("Евгений", 25, 200, "Логист"));
        // employeeList2.add(new Employee("Александр", 45, 350, "Помощник директора"));
        // employeeList2.add(new Employee("Юрий", 62, 400, "Охранник"));
        // employeeList2.add(new Employee("Ярослав", 52, 320, "Бухгалтер"));
        // employeeList2.add(new Employee("Владислав", 22, 170, "Уборщик"));
        // employeeList2.add(new Employee("Даниил", 75, 230, "Сопровожденец"));
        // employeeList2.add(new Employee("Ярополк", 60, 410, "Дальнобойщик"));
        // employeeList2.add(new Employee("Артем", 44, 300, "Водитель"));
        // employeeList2.add(new Employee("Дмитрий", 67, 290, "Механик"));
        // employeeList2.add(new Employee("Антон", 56, 100, "Уборщик"));
        // employeeList2.add(new Employee("Георгий", 82, 95, "Дворник"));
        // employeeList2.add(new Employee("Святослав", 44, 500, "Заместитель директора"));
        // employeeList2.add(new Employee("Денис", 34, 430, "Старший бухгалтер"));
        // employeeList2.add(new Employee("Захар", 90, 440, "Упаковщик"));
        // employeeList2.add(new Employee("Илья", 41, 105, "Представитель"));
        // employeeList2.add(new Employee("Валерий", 29, 295, "Секретарь"));
        // employeeList2.add(new Employee("Вадим", 39, 345, "Заведующий столовой"));
        // employeeList2.add(new Employee("Василий", 79, 540, "Технадзор"));
        // employeeList2.add(new Employee("Виктор", 89, 670, "Директор"));

        // System.out.println(employeeList2);
        
    }
    
}
