package lab_3;

public class PhoneNumber {
	
	private int type;
	private int number ;
	
	
	public PhoneNumber() {
		this.type = 1;
		this.number=604235205;
	}
	public PhoneNumber(int type, int number) {
		this.type = type;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return  "Type "+type +" PhoneNumber:" + number ;
	}
}
