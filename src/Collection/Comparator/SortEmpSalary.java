package Collection.Comparator;

import java.util.*;

class Employees {
    int id;
    double salary;

    Employees(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + salary;
    }
}

public class SortEmpSalary {
    public static void main(String[] args) {

        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees(1, 45000));
        list.add(new Employees(2, 30000));
        list.add(new Employees(3, 60000));

        Collections.sort(list, new Comparator<Employees>() {
            @Override
            public int compare(Employees e1, Employees e2) {
                return Double.compare(e1.salary , e2.salary);
            }
        });

        System.out.println(list);
    }
}
