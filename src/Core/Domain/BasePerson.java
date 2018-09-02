package Core.Domain;

public abstract class BasePerson {
	public int Id;
	public String FirstName;
	public String LastName;
	public String AddressLine1;
	public String AddressLine2;
	public String AddressLine3;
	public String PostCode;
	
	public BasePerson() {
		
	}
	
	public String getName() {
		return this.FirstName + this.LastName;
	}
	
	public void setAddress(String addressLine1, String addressLine2, String addressLine3) {
		this.AddressLine1 = addressLine1;
		this.AddressLine2 = addressLine2;
		this.AddressLine3 = addressLine3;
	}
}
