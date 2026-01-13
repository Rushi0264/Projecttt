package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;
    private String empDept;
    private double salary;

    Employee(int empId, String empName, String empDept, double salary){
        this.empId=empId;
        this.empName=empName;
        this.empDept=empDept;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee : {Employee ID ->"+empId+", Employee Name -> "+empName+", Employee Dept -> "+empDept+", Salary -> "+salary+"}";
    }

    @Override
    public int compareTo(Employee e){
        return Double.compare(e.salary, this.salary);
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        Employee e1 = new Employee(103,"Avinash","Computer",45000);
        Employee e2 = new Employee(101,"Angad","Software",56000);
        Employee e3 = new Employee(102,"Sopan","Development",87000);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println("Before sort : "+empList);

        Collections.sort(empList);
        System.out.println("After sort : "+empList);
    }
}
