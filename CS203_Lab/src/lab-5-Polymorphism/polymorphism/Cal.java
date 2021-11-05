package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Cal {
		
	 
public  double calculateSalaries(ArrayList<Employee> employees) {
	double totalSalary = 0;
	 for (Employee e : employees) {
		 totalSalary += e.getSalary();
	 }
	return  totalSalary;
}
}
