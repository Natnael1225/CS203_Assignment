package midtermProject_CS203_2;

import java.util.Arrays;

public class CookingVideo  extends Video implements  CookingVideos{
	
	private Recipe recipe;
	
	public  CookingVideo() {
		super();
		this.recipe = new Recipe();//  check this default for class Recipe !!!!!!
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

	@Override
	public String[] getIngredientsList() {
		String[] ingredentsList = recipe.getIngredents().split(",");	     // we need to implement some thing inside
		return ingredentsList;  // list the ingredents as string change by comas as String Array
	}

	@Override
	public Recipe getCookingRecipe() {// what are the things to check here
		
		return getRecipe();
	}

	@Override
	public void printRecipe() {  // Check with this implemention may be get address or for loop
		System.out.println("Dish: "+ recipe.getRecipeName()+ " \nIngredents: "+ Arrays.toString(getIngredientsList())+ "\n Direction: "+
	recipe.getInstructions() + " Prep Time: "+ recipe.getPreTime()+" Cooking Time: "+ recipe.getCookTime()+ 
	"Serving Size: "+ recipe.getServings());
		
	
	}

	
}
