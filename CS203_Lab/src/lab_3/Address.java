package lab_3;

public class Address {
	
	private  int  type;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address() {
		this.type = 1;
		this.street ="1352 Winfield dr";
		this.city ="Charlotte";
		this.state= "Nc";
		this.zip=25639;
	}

	public Address(int type, String street, String city, String state, int zip) {
		this.type =type;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Type"+type + " street: " + street + ", city:" + city + ", state:" + state + ", zip: " + zip ;
	}

}
