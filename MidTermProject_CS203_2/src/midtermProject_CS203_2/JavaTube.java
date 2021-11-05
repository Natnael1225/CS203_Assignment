package midtermProject_CS203_2;

public class JavaTube {
	
	public class sortVideoByTilte{
	 // later use sort Video by title;
		
	}
	public class sortVideoByTitle{
		
	}
	
	//Main Method Stared
	public static void main(String[] args) {
		
		Video v = new Video();
		GamingVideo v2 = new GamingVideo("Limitless","Gaming show", 10, 2000,100,5);
		
		System.out.println(v2.getGameName());
		
		//System.out.println(v);
		
		Recipe r = new Recipe("Shiro Recipe","Onion, Tomato, oil, Garlic, Water,ChickPeaPowder, jalapeno",
			"Saute the onion, tomato, garlic with oil for 5 min then add water and the ChickPeaPowder",10,30,4);
		CookingVideo cv = new CookingVideo(r,"Cooking Show",5,1000,200,5 );
		System.out.println(cv);
		cv.printRecipe();
		System.out.println(v2.equals(cv));
		String  res = cv.getCookingRecipe().getIngredents();
		System.out.println(res);
		
		Video[] add = {v, v2, cv};
		for( Video list : add) {
			System.out.println(list);
			}
		
//		VideoList vlist = new VideoList(add, 2);
//		System.out.println(vlist.toString());
		
	}

}
