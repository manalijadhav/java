import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		Book b1 = new Book(123,"Java PL","James Gosling",1);
		Book b2 = new Book(123,"Java PL","James Gosling",2);
		Book b3 = new Book(123,"Java PL","James Gosling",3);
			
		Book b4 = b1;
		Book b5 = b2;
		
		System.out.println("b1 "+b1.hashCode());
		System.out.println("b2 "+b2.hashCode());
		System.out.println("b3 "+b3.hashCode());
		
		System.out.println("Got 1 book ( its the content for the container)");
		
		System.out.println("Book Shelf is ready.. (its a container)...");
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding the book in the book shelf....");
		bookShelf.add(b1);
		bookShelf.add(b2);
		bookShelf.add(b3);
		bookShelf.add(b4);
		bookShelf.add(b5);
		
		
		Iterator<Book> iter = bookShelf.iterator();
		
		while(iter.hasNext()) {
			Book bk = iter.next();
			System.out.println("bk "+bk);
		}
		
	}
}
class Book  // extends Object
{
	int bookNumber;
	String bookName;
	String authorName;
	int edition;
	

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}

	public Book(int bookNumber, String bookName, String authorName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	

	public Book(int bookNumber, String bookName, String authorName, int edition) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.authorName = authorName;
		this.edition = edition;
	}

	

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", authorName=" + authorName + ", edition="
				+ edition + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookNumber;
		result = prime * result + edition;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		
		
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		
		
		if (bookNumber != other.bookNumber)
			return false;
		
		
		if (edition != other.edition)
			return false;
		
		return true;
	}

	
	

	
	
	
}
