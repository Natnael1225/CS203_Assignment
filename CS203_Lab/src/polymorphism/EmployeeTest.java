package polymorphism;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee manager = new Manager(1254,"Lily","Programmer",80000,"junior");
		
		Employee manager2 = new Manager(1634,"Mehari","manager",80000,"supervisor");
		
		manager.printEmployeeDetails();
	  System.out.println("After add the bouns: $"+manager.addBonus());
	
	  System.out.println("Checks equality by postion: "+manager.getPosition().equals(manager2.getPosition()));
	  
	  Employee clerk = new Clerk(4586,"Mercy","Nurse",20000,"Senior");
	  Employee clerk2 = new Clerk(6986,"Arkan","sales",9000,"Senior");
	  Employee clerk3 = new Clerk(6986,"Andre","crew",10000,"Senior");
		
	  System.out.println("Checks equality by postion: "+clerk.getPosition() .equals(clerk3.getPosition()));
	  clerk.printEmployeeDetails();
	  System.out.println("After add the bouns: $"+clerk.addBonus());
	  System.out.println("Checks equality by postion: "+clerk2.getPosition().equals(clerk3.getPosition() ));
	  
	 
  }
	  
	}


