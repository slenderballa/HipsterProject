package hipster.model;

import hipster.model.Book;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I dont mean to sound like a hipster, but, ";
		hipsterPhrases[2] = "Insert sarcastic phrase here";
		hipsterPhrases[3] = "I was into lifting weights before it was cool";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Eric Carle");
		firstBook.setTitle("The Very Hungry Caterpillar");
		firstBook.setSubject("Childrens");
		firstBook.setPageCount(14);
		firstBook.setPrice(5.99);
		
		secondBook = new Book();
		secondBook.setAuthor("Dotor Seuss");
		secondBook.setTitle("Green Eggs and Ham");
		secondBook.setSubject("Childrens");
		secondBook.setPageCount(22);
		secondBook.setPrice(6.99);
		
		thirdBook = new Book( 28, "Munro Leaf", "The Story of Ferdinand" "Childrens", 12.99 );
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
		
	}
	
	
	
	
	
}
