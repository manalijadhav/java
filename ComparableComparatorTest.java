
public class ComparableComparatorTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Suresh",40000);
		Employee e2 = new Employee(98,"Haresh",45000);
		Employee e3 = new Employee(198,"Jayesh",85000);
		
		System.out.println("e1 "+e1);
		System.out.println("e2 "+e2);
		System.out.println("e3 "+e3);
		
		e1.compareWithAnother(e2);
		
		EmployeeSalaryComparator empSalCmp = new EmployeeSalaryComparator();
		empSalCmp.compare(e1, e2);
		
		//e1.compareWithItSelf();
		
		//e1.compareWithAnother(e2); // e1 is the invoker reference
						//and e2 is passed as an object - usesA
		
		//e1.compareSeniority(e2);
	}
}
class Employee
{
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	void compareSeniority(Employee ref) { //exclusive
		if(employeeNumber < ref.employeeNumber) {
			System.out.println(employeeName+" is senior to "+ref.employeeName);
		}
		else {
			System.out.println(employeeName+" is junior to "+ref.employeeName);
		}
	}
	
	public Employee(int acno, String achn,double salary)
	{
		employeeNumber=acno;
		employeeName=achn;
		employeeSalary=salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	void compareWithItSelf() {
		System.out.println(employeeName+" Comparing with itself "+" what the salary ? "+employeeSalary);
	}
	
	void compareWithAnother(Employee ref) {
		System.out.println("Comparable....");
		System.out.println(employeeName +"  comparing with "+ref.employeeName);
		if(employeeSalary > ref.employeeSalary) {
			System.out.println(employeeName+"'s salary is higher than "+ref.employeeName);
		}
		else {
			System.out.println(employeeName+"'s salary is lesser than "+ref.employeeName);
		}
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
}



class EmployeeSalaryComparator //NO -> isA  NO->hasA  
{
							//usesA
	void compare(Employee ref1, Employee ref2) {
		System.out.println("Comparator....");
//		System.out.println("Comparing "+ref1.getEmployeeSalary()+ " with "+ref2.getEmployeeSalary() );
		if(ref1.getEmployeeSalary() < ref2.getEmployeeSalary()) {
			System.out.println(ref1.getEmployeeName()+"'s salary is lesser than "+ref2.getEmployeeName());
		}
		else {
			System.out.println(ref1.getEmployeeName()+"'s salary is higher than "+ref2.getEmployeeName());
		}
	}
}

class EmployeeSeniorityComparator
{
	void compare(Employee ref1, Employee ref2) {
//		System.out.println("Comparing "+ref1.getEmployeeSalary()+ " with "+ref2.getEmployeeSalary() );
		if(ref1.getEmployeeNumber() < ref2.getEmployeeNumber()) {
			System.out.println(ref1.getEmployeeName()+" senior to "+ref2.getEmployeeName());
		}
		else {
			System.out.println(ref1.getEmployeeName()+" junior to "+ref2.getEmployeeName());
		}
	}
}















