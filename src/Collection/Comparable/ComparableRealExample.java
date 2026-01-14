package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employees implements Comparable<Employees>{
    private int empId;
    private String empName;
    private double salary;

    Employees(int empId, String empName, double salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }

    public String toString(){
        return "Employee { Id -> "+empId+", Name -> "+empName+", Salary -> "+salary+" }";
    }
    public int compareTo(Employees e){
        //return Double.compare(this.salary, e.salary);
        return this.empId-e.empId;
    }
}

public class ComparableRealExample {
    public static void main(String[] args) {
        Employees emp1 = new Employees(103,"Sumit",87000);
        Employees emp2 = new Employees(101,"Rushi",67000);
        Employees emp3 = new Employees(102,"Prathamesh",89000);

        List<Employees> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("List before sort : "+list);

        Collections.sort(list);
        System.out.println("List after sort : "+list);
    }
}
