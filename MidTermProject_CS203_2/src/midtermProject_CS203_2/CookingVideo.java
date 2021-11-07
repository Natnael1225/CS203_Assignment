package midtermProject_CS203_2;

import java.util.Arrays;

public class CookingVideo  extends Video implements  CookingVideos{
	
	private Recipe recipe;
	
	public  CookingVideo() {
		super();
		this.recipe = new Recipe("Banana Chocolate","bread, egg, milk, cocoa powder, Water,banana, chocolate chip",
				"Combine all ingredients in a microwaveable mug.Cook for 2-3 minutes.",3,8,68 );
	}

	public CookingVideo(Recipe recipe, String title, double durationInMinutes, int views, int likes, double watchTime) {
		super(title, durationInMinutes,views, likes,watchTime);
		this.recipe = recipe;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	// list the ingredients as string separate by comma's and return as String Array
	@Override
	public String[] getIngredientsList() {
		String[] ingredentsList = recipe.getIngredents().split(",");	 
		return ingredentsList;  
	}

	@Override
	public Recipe getCookingRecipe() {
		
		return getRecipe();
	}

	@Override
	public String printRecipe() {  // Check with this implemention may be get address or for loop
		return "Dish: "+ recipe.getRecipeName()+ " \nIngredents: "+ Arrays.toString(getIngredientsList())+ "\nDirection: "+
	recipe.getInstructions() + " Prep Time: "+ recipe.getPreTime()+" Cooking Time: "+ recipe.getCookTime()+ 
	" Serving Size: "+ recipe.getServings();
		
	
	}
	@Override
	public String toString() {
		return  "Dish: "+ recipe.getRecipeName()+ " \nIngredents:"+ printIngredents(getIngredientsList())+ "Direction: "+
				recipe.getInstructions() + " Prep Time: "+ recipe.getPreTime()+" Cooking Time: "+ recipe.getCookTime()+ 
				" Serving Size: "+ recipe.getServings() + super.toString() ;
	}

//	@Override
//	public String toString() {
//		return  "Dish: "+ recipe.getRecipeName()+ " \nIngredents: "+ Arrays.toString(getIngredientsList())+ "\nDirection: "+
//				recipe.getInstructions() + " Prep Time: "+ recipe.getPreTime()+" Cooking Time: "+ recipe.getCookTime()+ 
//				" Serving Size: "+ recipe.getServings() + super.toString() ;
//	}

  public String printIngredents(String [] s) {
	  String res ="";
	  for(String resu: s) {
		  res += resu +"\n";
	  }
	  return res;

  }
	

	
}
