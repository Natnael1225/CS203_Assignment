package midtermProject_CS203_2;

import java.util.Arrays;
import java.util.Comparator;



public class JavaTube {
	//In side the Inner class -  sorting video by their tile
	public class sortVideoByTitle  implements Comparator<Video>{

		@Override
		public int compare(Video o1, Video o2) {
			
			return o1.getTitle().compareToIgnoreCase(o2.getTitle());
		}
	 
		
	}
	//In side the Inner class -  sorting video by their Views
	static class sortVideoByViews implements Comparator<Video>{

		@Override
		public int compare(Video o1, Video o2) {
			
			return o1.getViews() - o2.getViews();
		}
		
	}
	
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~===========================================================	
//Main Method Started
	
	public static void main(String[] args) {

//Creating CookingVideo  objects
		Recipe recipe = new Recipe("Shiro Recipe", "Onion, Tomato, oil, Garlic, Water,ChickPeaPowder",
				"Saute the onion, tomato, garlic with oil for 5 min then add water and the ChickPeaPowder", 10, 30, 4);
		CookingVideo cookVideo = new CookingVideo(recipe, "TopChief", 5, 1000, 200, 5);

		Recipe recipe2 = new Recipe("Banana Chocolate", "bread, egg, milk, cocoa powder, Water,banana, chocolate chip",
				"Combine all ingredients in a microwaveable mug.Cook for 2-3 minutes.", 3, 8, 6);

		CookingVideo cookVideo2 = new CookingVideo(recipe2, "Cooking Time", 7, 1000, 150, 10);

		Recipe recipe3 = new Recipe(" Omelette", " egg, bell pepper, ham, spinach, pepper",
				"add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.", 3,
				10, 2);

		CookingVideo cookVideo3 = new CookingVideo(recipe3, "Chef at Home", 6, 20000, 300, 9);

		Recipe recipe4 = new Recipe("BBQ Chicken", "Chicken.,Tortilla chips.,Green onion.,Guacamole.,Salt.,Pepper.",
				"Mix the chicken with the barbecue sauce, Spread the pico de gallo, cheese, and green onions evenly on top, then microwave "
						+ "for about 1-3 minutes.",
				3, 10, 2);

		CookingVideo cookVideo4 = new CookingVideo(recipe4, "Chef's Table", 7, 12000, 360, 12);
//----------------------------------------------------------------------------------------------------------------
// Creating  of GamingVideo  objects		
		GamingVideo gameVideo1 = new GamingVideo("Limitless", "SNL show", 10, 2000, 100, 5);
		GamingVideo gameVideo2 = new GamingVideo("Big Papa", "Reality show", 10, 2000, 100, 7896);
		GamingVideo gameVideo3 = new GamingVideo("Mad Dog", "Night show", 9, 300, 8500, 569);
		GamingVideo gameVideo4 = new GamingVideo("Ranger", "Kids Gaming", 6, 500, 9600, 150);
		GamingVideo gameVideo5 = new GamingVideo("Ratchet", "Gaming Entertainment", 8, 2000, 100, 5896);

		System.out.println("~~~~~~~~~~~~~~~~~~Calling the method inside the GamingVideo~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// System.out.println(gameVideo2.getGameName());

		System.out.println("~~~~~~~~~~~~~Calling the equals method inside the Video class~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// System.out.println(gameVideo2.equals(gameVideo3));
		System.out.println("~~~~~~~~~~~~~~~~~~~~Printing all ingredient list~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String res = cookVideo.getCookingRecipe().getIngredents();
		// System.out.println(res);
		// --------------------------------------------------------------------------------------------
		System.out.println();
//Creating  an Array of Video objects
		Video[] allVideos = { gameVideo1, gameVideo2, gameVideo3, gameVideo4, gameVideo5, cookVideo, cookVideo2, cookVideo3,cookVideo4 };

//Creating  an Array of CookingVideo objects
		CookingVideo[] CookingVideos = { cookVideo, cookVideo2, cookVideo3 ,cookVideo4};

//Creating  an Array of GamingVideo objects		
		GamingVideo[] gamingVideos = { gameVideo1, gameVideo2, gameVideo3, gameVideo4, gameVideo5 };

		System.out.println("~~~~~~~~~~To print Before Sorting all Videos by Watch Time~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		videoPrinter( allVideos);
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//To sort all the Videos Naturally(Acending order)
		Arrays.sort(allVideos);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~To print After Sorting all Videos by Watch Time~~~~~~~~~~~~~");
		videoPrinter(allVideos);
		
//Calling inner class to print sort by Title using member class	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~To print Before Sorting all Videos by Title~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		videoPrinter( allVideos);
		JavaTube tube = new JavaTube();
		JavaTube.sortVideoByTitle  title = tube.new sortVideoByTitle();
		Arrays.sort(allVideos, tube.new sortVideoByTitle());
		System.out.println("~~~~~~~~~~~~To print After Sorting all Videos by Title~~~~~~~~~~~~~");
		videoPrinter(allVideos);
		System.out.println();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Calling inner class to print sort by view  using Static class		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~To print Before Sorting all Videos by View~~~~~~~~~~~~~~~~~~~~~");
		videoPrinter(allVideos);
		JavaTube.sortVideoByViews  view =  new JavaTube.sortVideoByViews();
		Arrays.sort(allVideos, new  JavaTube.sortVideoByViews());
		System.out.println("~~~~~~~~~~~~To print After Sorting all Videos by View~~~~~~~~~~~~~");
		videoPrinter(allVideos);
		System.out.println();

//Create local inner class  and sorting cookingVideo by ingredient list
		class Local implements Comparator<CookingVideo> {

			@Override
			public int compare(CookingVideo o1, CookingVideo o2) {

				return o1.getIngredientsList().length - o2.getIngredientsList().length;
			}

		}
		System.out.println("~~~~~~~~~~~~To print local class Sorting all Videos by  IngridientsList~~~~~~~~~~~~~");
		System.out.println();
// ------------~~~~~~~~~~~~~Call the local class to run inside the main
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~To print Before Sorting all Videos ByIngridientsList~~~~~~~~~~~~~~~~~~~~~");
		JavaTube.sortCookingVideoByIngridientsList(CookingVideos);
		Local local = new Local();
		Arrays.sort(CookingVideos, local);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~To print After Sorting all Videos ByIngridientsList~~~~~~~~~~~~~~~~~~~~~");
		JavaTube.sortCookingVideoByIngridientsList(CookingVideos);
		System.out.println();
		
//~~~~~~~~~~~~Anonymous inner class sorting by CookingVideoByServingSizeDescending 
				Arrays.sort(CookingVideos); //// CookingVideoByServingSizeDescending

	System.out.println("----------------------------------");
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
// to print CookingVideos using  a method printAllcookingVideo
	
				printAllcookingVideo(CookingVideos);
				
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//  to print all the Recipes using printAllcookingRecipies method
				
				printAllcookingRecipies(CookingVideos);
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
// Sort the gaming videos array using the game name property with a lambda expression
				
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~To sort by name in Lamda Expression~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
				Arrays.sort(gamingVideos,((o1, o2) -> (o1.getName().compareTo(o2.getName()))));
		        printAllGamingVideos(gamingVideos);
		        
		        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~				
//Creating VideoList  objects and adding to list
   System.out.println("~~~~~~~~Creating VideoList  objects and adding to list~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");							
								VideoList vlist = new  VideoList();
								vlist.add(cookVideo);
								vlist.add(cookVideo2);
								vlist.add(cookVideo3);
								vlist.add(cookVideo4);
								vlist.add(gameVideo1);
								vlist.add(gameVideo2);
								vlist.add(gameVideo3);
								vlist.add(gameVideo4);
								vlist.add(gameVideo5);
						
								System.out.println(vlist.toString());
}	
		//System.out.println(vlist.toString());

		//cv.printRecipe();
		
		
		
		// printAllcooking();
//		for(Video result : allVideos) {
//			System.out.println("After Sorting by temperature: "+result);
//		}


	

// used this method to print CookingVideo by ingredient list length
	public static void sortCookingVideoByIngridientsList(CookingVideo[] cooking) {
		for (CookingVideo result : cooking) {
			System.out.println(result);
		}

	}

	public static void videoPrinter(Video[] video) {
		for (int i = 0; i < video.length; i++) {
			System.out.println(video[i]);
		}
	}
	// used this method to print CookingVideo their recipe
	public static void printAllcookingRecipies(CookingVideo[] recipe) {
		for (int i = 0; i < recipe.length; i++) {
			System.out.println(recipe[i].printRecipe());

		}
	}
	
	public static void printAllcookingVideo(CookingVideo[] cook) {
		for (int i = 0; i < cook.length; i++) {
			System.out.println(cook[i]);

		}
	}
	public static void printAllGamingVideos(GamingVideo[] gamingVideos){
	        for (GamingVideo gamingVideo : gamingVideos)
	            System.out.println(gamingVideo);
	    }

//	public static void printAllcookingVideo(VideoList cook) {
//		for (int i = 0; i < cook.size(); i++) {
//			System.out.println(cook.get(i));
//		}
//	}

}
