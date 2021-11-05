package assignment_4;

public class TypeValues {

	private int type;	
	
 public TypeValues() {
	this.type = 0;
}
	public TypeValues(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return  "Type: " + type ;
	}

	
}
