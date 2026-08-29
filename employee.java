package package7;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	class Employee {
	    String name;
	    String department;
	    int salary;
	    Employee(String name, String department, int salary) {
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }
	    public String toString() {
	        return name + "-" + department + "-" + salary;
	    }
	}
	public class employee {
	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("Ravi", "IT", 60000),
	            new Employee("Anil", "HR", 50000),
	            new Employee("Priya", "IT", 50000),
	            new Employee("Amit", "HR", 60000),
	            new Employee("Rahul", "AI", 50000)
	        );
	        employees.sort(
	            Comparator.comparing((Employee e) -> e.department)
	                .thenComparing((Employee e) -> e.salary, Comparator.reverseOrder())
	                .thenComparing(e -> e.name)
	        );
	        for (Employee e : employees) {
	            System.out.println(e);
	        }
	    }
}
