package example.tree;

public class Employee implements Comparable<Employee>
{
	int empId;
	String name;
	float salary;
	
	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(Employee o) 
	{
		System.out.println("Comparing "+empId+" with "+o.empId);
		
		return Integer.compare(empId, o.empId);
	}
	
	
}
