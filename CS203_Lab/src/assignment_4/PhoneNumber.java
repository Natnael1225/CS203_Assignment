package assignment_4;

public class PhoneNumber extends TypeValues {

	//private int type ;
	private int number ;
	
	public PhoneNumber() {
		super(1);
		this.number=604235205;
	}

	public PhoneNumber(int type, int number) {
		super(type);
		this.number = number;
	}

	@Override
	public String toString() {
		return  super.toString() +"PhoneNumber:" + number ;
	}
	
	
}
