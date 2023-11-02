package Homework_3;

public class Employee implements Comparable<Employee> {
    
    private String name;
    private int age;
    public double salary;
    public String nameDept;

    public Employee(String name, int age, double salary, String nameDept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.nameDept = nameDept;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getNameDept() {
        return nameDept;
    }
    public void setNameDept(String nameDept) {
        this.nameDept = nameDept;
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.nameDept.compareTo(employee.nameDept);
        return result;
    }

    
    @Override
    public String toString() {
        return "(" + name +" " + age + "  " + salary + " " +nameDept + ")\n";
    }

    }

