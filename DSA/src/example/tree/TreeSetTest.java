package example.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest 
{
	public static void main(String[] args) {
	
	TreeSet<Employee> ts=new TreeSet<Employee>();
	
	Employee emp1=new Employee(101, "Sampada", 50000);
	Employee emp2=new Employee(102, "Sakshi", 60000);
	Employee emp3=new Employee(103, "Radha", 40000);
	
	ts.add(emp3);
	ts.add(emp1);
	ts.add(emp2);
	
	Iterator<Employee> e= ts.iterator();
	while(e.hasNext())
	{
		Employee emp=e.next();
		System.out.println("Employee is "+emp);
	}
	
	}
}
