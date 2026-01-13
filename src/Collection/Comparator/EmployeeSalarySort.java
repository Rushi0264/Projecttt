package Collection.Comparator;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}

public class EmployeeSalarySort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Rushi", 45000));
        list.add(new Employee(102, "Shubham", 30000));
        list.add(new Employee(103, "Gaurav", 60000));

        Collections.sort(list, new SalaryComparator());
        System.out.println(list);
    }
}