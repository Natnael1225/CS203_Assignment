package polyasset;

public class Assets  implements Comparable<Assets>{
	

	 private int serialNumber;
	 private  String category ;
	 private int quantity;
	 
	 	 
	public Assets(int serialNumber, String category, int quantity) {
		this.serialNumber = serialNumber;
		this.category = category;
		this.quantity = quantity;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getuantityQ() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	 
	@Override
	public String toString() {
		return "SerialNumber:" + serialNumber + ", Category:" + category+ "Quantity: "+ quantity ;
	}
	@Override
	public int compareTo(Assets o) {
		
		return  this.getCategory().compareTo(o.category);
	}	 
}
