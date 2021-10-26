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
	
	
	public Breed  getBreed() {
		return breed;
	}
	public double getWeight() {
		return weight;
	}
	
	class Breed{
		private  String name;
		private  double averageWgt;
		
		
		public Breed(String name, double averageWgt) {
			this.name = name;
			this.averageWgt = averageWgt;
		}

		public String getName() {
			return name;
		}
		
		public double getAverageWgt() {
			return averageWgt;
		}
		
		
		
	}

}
