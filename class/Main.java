import java.util.ArrayList;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String branch;
    double salary;
    double rating;

    Employee(int id, String name, String branch, double salary, double rating) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.salary = salary;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Branch: " + branch +
               ", Salary: " + salary +
               ", Rating: " + rating;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rahul", "IT", 50000, 4.5));
        employees.add(new Employee(2, "Priya", "HR", 45000, 4.2));
        employees.add(new Employee(3, "Aman", "Finance", 55000, 4.7));
        employees.add(new Employee(4, "Neha", "IT", 60000, 4.8));
        employees.add(new Employee(5, "Arjun", "Sales", 40000, 4.0));
        employees.add(new Employee(6, "Simran", "HR", 48000, 4.3));
        employees.add(new Employee(7, "Karan", "Finance", 52000, 4.1));
        employees.add(new Employee(8, "Anjali", "IT", 65000, 4.9));
        employees.add(new Employee(9, "Vikram", "Sales", 42000, 3.9));
        employees.add(new Employee(10, "Pooja", "HR", 47000, 4.4));

        // employees.stream()
        //  .filter(e -> e.rating >= 4.0)
        //  .forEach(System.out::println);

        // employees.stream()
        //  .filter(e -> e.branch.equals("IT"))
        //  .forEach(System.out::println);

        // employees.stream()
        //  .map(e -> e.name) 
        //  .forEach(System.out::println);

        // If you want only names after sorting their slary
        // employees.stream()
        // .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))  // salary is sorted in descending order 
        // .map(e -> e.name)
        // .forEach(System.out::println);
        
        // find the highest salary using max->teriminal option  
        Employee highestRated = employees.stream()
        .max((e1, e2) -> Double.compare(e1.rating, e2.rating))
        .orElse(null);

        System.out.println(highestRated);

        



    }
}