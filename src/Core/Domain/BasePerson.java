package Core.Domain;

import java.util.List;

public abstract class BasePerson {
	public int Id;
	public String FirstName;
	public String LastName;
	public List<Address> Addresses;
	
	public BasePerson() {
	}
	
	public String getName() {
		return this.FirstName + this.LastName;
	}
}
