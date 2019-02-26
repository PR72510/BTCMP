import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sol4 {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(22,10000,"Luis"));
        list.add(new Employee(25,15000,"Chris"));
        list.add(new Employee(23,9000,"Mario"));
        list.add(new Employee(30,20000,"Gerrard"));
        list.add(new Employee(26,5000,"Leo"));

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.salary - o1.salary);
            }
        });

        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}

class Employee{
    double age, salary;
    String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String toString(){
        return  this.age + " " + this.salary + " " + this.name;
    }
}
