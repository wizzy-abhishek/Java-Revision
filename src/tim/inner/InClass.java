package tim.inner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InClass {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                List.of(new Employee("TCS" , 1001 , "Abhishek"),
                        new Employee("Infosys" , 1100 ,"Jaddu"),
                        new Employee("Wipro" , 1002 , "Gargi"),
                        new Employee("Infosys" , 1003 , "Abc"))
        );


        Employee.EmployeeCompare<Employee> employeeCompare
                = new Employee.EmployeeCompare<>();

        employees.sort((Comparator<? super Employee>) (q,w) -> q.company.compareTo(w.company));

        for (var e : employees){
            System.out.println(e.toString());
        }
    }
}

class Employee {

     String name ;

    private int id ;

     String company ;

    public Employee() {
    }

    public Employee(String company, int id, String name) {
        this.company = company;
        this.id = id;
        this.name = name;
    }

    public static class EmployeeCompare<T extends  Employee>
    implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            int cmp = o1.company.compareTo(o2.company);
            if (cmp == 0) {
                return Integer.valueOf(o1.id).compareTo(Integer.valueOf(o2.id));
            }
            return cmp ;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
