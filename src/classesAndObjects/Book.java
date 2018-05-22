package classesAndObjects;

public class Book {

	private String title;
	private String author;
	private int isbn;
	private int numberOfPages;
	public String getTitle() {
		return title;
	}

//Getters 'n Setters
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	
//Additional methods
	
	
	
//toString()
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", numberOfPages=" + numberOfPages
				+ "]";
	}
}
