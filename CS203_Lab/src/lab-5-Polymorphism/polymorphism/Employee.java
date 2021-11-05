package polymorphism;

public class Employee {

	private int employeeId;
	private String name;
	private String department;
	private double salary;
	private String position;
		
	public Employee(int employeeId, String name, String department, double salary, String position) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.position = position;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
public double addBonus() {
 return this.salary +200;	
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (position == null) {
		if (other.position != null)
			return false;
	} else if (!position.equals(other.position)) {
		return false;
	}
	return true;
}
public void  printEmployeeDetails() {
	System.out.println("\nEmployeeId: "+ employeeId +
	" \nName: "+ name+ " \nDepartment: "+ department+
	" \nSalary: $"+ salary+ " \nPosition: "+ position);
}
	
}
