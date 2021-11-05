package polymorphism;

public class Manager extends Employee {


public Manager(int employeeId, String name, String department, double salary, String position){
	
super(employeeId, name, department,  salary, position);	
}

@Override
public double addBonus() {
	
	return this.getSalary()+ 300;
}


}