package Core.Domain;

import java.util.List;

public class Rental {
	public List<Book> Books;
	
	public BasePerson RentingPerson;
	public int RentingPersonId;
	
	public Rental(BasePerson rentingPerson) {
		this.RentingPerson = rentingPerson;
	}
	
	public void addBook(Book book) {
		Books.add(book);
	}

}
