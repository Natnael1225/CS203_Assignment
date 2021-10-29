package assignment_3;


public class Colledge {

	public static void main(String[] args) {
		
		Student[] student = new Student[2];
		
		student[0] = new Student();
		student[0].name ="Kahn";
		student[0]= new Student();
		student[0].name ="Kittu";
		student[1]= new Student();
		student[1].name ="Munna";
		
		for(Student element : student) {
			System.out.println(element.name +"~");
			
			//The output is Kittu ~ and Munna ~
		}
		
		

	}

}
