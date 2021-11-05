package assignment_4;

public class EmailAddress extends TypeValues {

	private String emailAddress ;
	
	public EmailAddress() {
		super(1);
		this.emailAddress="Lily@gmail.com";
		
	}

	public EmailAddress(int type,String emailAddress) {
		super(type);
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "EmailAddress: "+ emailAddress;
	}
}
