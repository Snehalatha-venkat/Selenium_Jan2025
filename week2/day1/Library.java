package week2.day1;

public class Library {

	 String	addBook(String bookTitle)
	{
		System.out.println ("Book Added successfully"+ "-----" + bookTitle);
		return bookTitle;
	}
	
	 public void issueBook()
	 {
		 System.out.println ("Book Issued successfully"); 
	 }
	
	public static void main(String[] args) {
		// Creating Library object
		
		Library lib = new Library();
		lib.addBook("Eye of the Needle");
		lib.issueBook();
	}
}
