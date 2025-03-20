/**
 * 
 */
package org.howard.edu.lsp.midterm.question2;

/**
 * 
 */
public class Book {
    private String title, author, ISBN;
    private int yearPublished;
    /**
     * Constructs a new Book object with the specified details.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The unique ISBN number of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title; this.author = author; this.ISBN = ISBN; this.yearPublished = yearPublished;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getYearPublished() { return yearPublished; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }
    /**
     * Returns a string representation of the book.
     * The string includes the title, author, ISBN, and year of publication.
     */
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d", title, author, ISBN, yearPublished);
    }
}
/**
 * A driver class to test the functionality of the Book class.
 * This class creates instances of the Book class and demonstrates
 * the use of its methods, including equality comparison and string representation.
 */
class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false
        System.out.println(book1);
    }

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub

	}

