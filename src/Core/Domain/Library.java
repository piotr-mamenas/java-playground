package Core.Domain;

import java.util.List;

public class Library {
	
	public List<Client> Clients;
	public List<Employee> Employees;
	public String Name;
	public Address Address;
	
	public Library() {
		
	}
	
	public boolean payEmployees() {
		return true;
	}
}
