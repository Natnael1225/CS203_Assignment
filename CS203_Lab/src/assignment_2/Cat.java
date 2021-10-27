package assignment_2;

/**
 * All is valid in this class
 * @author lwamt
 *
 */
 class Cat {
	private  String name;
	private  Breed breed;
	private  double weight;
	
	
	public Cat(String name, Breed breed, double weight) {
		this.name= name;
		this.breed= breed;
		this.weight= weight;
		
	}
	public String name() {
		return name;
	}
		
	public Breed  getBreed() {
		return breed;
	}
	public double getWeight() {
		return weight;
	}
	

}
