package lab_3;

public class EmailAddress {
	
	private int type;
	private String emailAddress;
	
	public EmailAddress() {
		this.type =1;
		this.emailAddress="Lily@gmail.com";	
	}
		
	public EmailAddress(int type, String emailAddress) {
		this.type = type;
		this.emailAddress = emailAddress;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Type "+type  +" EmailAddress: "+ emailAddress;
	}	
	
}
