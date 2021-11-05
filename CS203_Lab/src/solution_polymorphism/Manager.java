package solution_polymorphism;

public class Manager {
	Employee em;

//	public Manager(Employee em) {
//		super();
//		this.em = em;
//	}
	
	public Manager(int employeeId, String name, String department, double salary, String position) {
		em = new  Employee( employeeId,  name,  department,  salary,  position);
	}
	

}
