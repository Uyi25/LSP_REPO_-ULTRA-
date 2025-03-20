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

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d", title, author, ISBN, yearPublished);
    }
}

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

