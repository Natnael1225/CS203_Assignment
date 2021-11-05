package assignment_5;

public class City  implements Comparable<City>  {

	private String cityName;
	private double temperature;
	
	public City() {
		this.cityName ="Charlotte";
		this.temperature= 70;
	}
	
	public City(String cityName, double temperature) {
		this.cityName = cityName;
		this.temperature = temperature;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	
	@Override
	public String toString() {
		return "CityName: " + cityName + ", temperature: " + temperature;
	}
	
	@Override
	public int compareTo(City o) {
		return  (int) (temperature - o.temperature);
	}
//	@Override
//	public int compareTo(City o) {
//		if(temperature != o.temperature) return  (int) (temperature - o.temperature);
//		
//		else
//		return cityName.compareToIgnoreCase(o.cityName);
//		 //&&cityName.compareToIgnoreCase(o.cityName) ;
//	}

	
	
}
