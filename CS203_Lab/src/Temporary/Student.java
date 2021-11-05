package Temporary;

public class Student {
	private String fname;
	private String lname;
	private int id;
	private String address;
		
	public Student(String fname, String lname, int id, String address) {
		
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.address = address;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
