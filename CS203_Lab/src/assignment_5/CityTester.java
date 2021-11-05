package assignment_5;


import java.util.Arrays;


public class CityTester {

	public static void main(String[] args) {
		
		City city = new City("Fairfield", 86);
		City city2 = new City("Ottama", 66);
		City city3 = new City("Charlotte", 56);
		City city4 = new City("Atlana", 56);
		City city5 = new City("Monroe", 56);
		City city6 = new City("Dallas", 30);
		
		City [] ctities = {city, city2,city3,city4,city5,city6};
		
		for(City ans : ctities) {
			System.out.println("Before Sorting: "+ans);
		}
		System.out.println("----------------------");
		
		//Arrays.sort(ctities);
		Arrays.sort(ctities, new CitySortByName());
		
		
		for(City ans : ctities) {
			System.out.println("After Sorting by temperature: "+ans);
		}
		
		
		/*
		 * System.out.println("Sorting by ArrayList"); ArrayList<City> citylist = new
		 * ArrayList<>(); citylist.add(city); citylist.add(city2); citylist.add(city3);
		 * citylist.add(city4); citylist.add(city5); citylist.add(city6);
		 * 
		 * Collections.sort(citylist);
		 * 
		 * for(City ans : ctities) {
		 * System.out.println("After Sorting by temperature: "+ans); }
		 */
		//System.out.println(citylist);
	}

}
