package assignment_5;

public class Student  implements Comparable<Student>{

	private String lastName;
	private int idNumber;
	
public Student() {
	this.lastName= "Fish";
	this.idNumber = 1235;
}
public Student(String lastName, int idNumber) {
	this.lastName= lastName;
	this.idNumber = idNumber;
}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
//	@Override
//	public int compareTo(Student o) {
//		return (idNumber - o.idNumber);
//	}
	@Override
	public int compareTo(Student o) {
		return lastName.compareToIgnoreCase(o.lastName);
	}
	@Override
	public String toString() {
		return "LastName:" + lastName + ", idNumber: " + idNumber;
	}
	
	
}
