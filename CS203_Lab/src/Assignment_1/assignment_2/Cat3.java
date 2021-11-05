package assignment_2;

public class Cat3 {

	
	private static final String DEFAULT_NAME = "No name";
	private static final int DEFAULT_HGT = 6;
	private static final double DEFAULT_WGT = 10.0;
	private String name;
	private int height;
	private double weight;

	
	public Cat3( ) {
		//assign defaults to all data members
		this(DEFAULT_NAME,DEFAULT_HGT, DEFAULT_WGT);
		}
	
	public Cat3(String name) {
		//assign the passed name to the data member
		//use defaults for height and weigh
		this(name, DEFAULT_HGT, DEFAULT_WGT);
		}
	public Cat3(String name, int height) {
		//assign passed values to name and height
		//use default for weight
		this(name, height, DEFAULT_WGT);
	}
	public Cat3(String name, double weight) {
		//assign passed values to name and weight
		//use default for height
		this(name, DEFAULT_HGT, weight);
	}
	
	public Cat3(String name, int height, double weight) {
		this.name = name;
		this.height= height;
		this.weight= weight;
	}
}
