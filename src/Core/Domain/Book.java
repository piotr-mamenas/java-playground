package Core.Domain;

import java.util.List;

public abstract class Book {
	
	public String Title;
	public List<Author> Authors;
	public String ISBN;
	
	public Book(String title, List<Author> Authors, String isbn) {
		this.Title = title;
		this.Authors = Authors;
		this.ISBN = isbn;
	}
}
