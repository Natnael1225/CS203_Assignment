package midtermProject_CS203_2;

public class Recipe  implements Cloneable{
	
	private String recipeName;
	private String ingredents;  // This consists d/t ingredents ... may be Array
	private String instructions;
	private int preTime;
	private int cookTime;
	private int servings;
	
	
	public Recipe() {

		this.recipeName = "Pecan Pie";//"Shiro recipe";
		this.ingredents =  "Pecan , Flour, Water" ;//"Onion, Tomato, oil, Garlic, Water,ChickPeaPowder, jalapeno";
		this.instructions = " Pour Water on the top of the flour. Mix throughly. Add Pecans. Bake for 30 min.";//"Saute the onion, tomato, garlic with oil for 5 min then add the ChickPeaPowder";
		this.preTime = 15; 
		this.cookTime = 30;
		this.servings = 4;
	}
	
	public Recipe(String recipeName, String ingredents, String instructions, int preTime, int cookTime, int servings) {
	
		this.recipeName = recipeName;
		this.ingredents = ingredents;
		this.instructions = instructions;
		this.preTime = preTime;
		this.cookTime = cookTime;
		this.servings = servings;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getIngredents() {
		return ingredents;
	}

	public void setIngredents(String ingredents) {
		this.ingredents = ingredents;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public int getPreTime() {
		return preTime;
	}

	public void setPreTime(int preTime) {
		this.preTime = preTime;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	@Override    // we need to do some thing
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();  ///// we need to implement
	}


	

}
