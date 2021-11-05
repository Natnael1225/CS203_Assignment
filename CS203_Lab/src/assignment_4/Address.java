package assignment_4;

public class Address  extends TypeValues{
	
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address() {
		super(1);
		this.street ="1352 Winfield dr";
		this.city ="Charlotte";
		this.state= "Nc";
		this.zip=25639;
	}

	public Address(int type, String street, String city, String state, int zip) {
		super(type);
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return super.toString() + "street: " + street + ", city:" + city + ", state:" + state + ", zip: " + zip ;
	}
	
	
	
	
}
