package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    Employee(){
    }

    Employee(int id, String firstName, String lastName, double salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int  id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o){
        return this.getId()-o.getId();
    }

    public static void main(String[] args) {
        Employee Shubham = new Employee(1,"Shubham","Ambilwade",76000);
        Employee Omkar = new Employee(3,"Omkar","Chepte",56000);
        Employee Rushi = new Employee(2,"Rushi","Chepte",79000);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Shubham);
        employeeList.add(Omkar);
        employeeList.add(Rushi);

        System.out.println("Before Sorting : "+employeeList);

        Collections.sort(employeeList);
        System.out.println("After Sorting : "+employeeList);
    }
}
