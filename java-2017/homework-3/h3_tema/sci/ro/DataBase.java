package ro.sci.h3_tema;
import java.util.ArrayList;
/**
*obj that handles the list of books*
*adds and delets books from library
*lists all books in library
*/
public class DataBase {
	
	ArrayList<Book> list;
	/**
	 *cunstructor for dataBase 
	 *creates list of books
	 */
	public DataBase(){
		list = new ArrayList<Book>();
	}
	/**
	* method that adds a book in the list
	*@param b = an type book obj
	*/
	public void addBook(Book b){
		list.add(b);
	}
	/**
	* method that delets a book from the list
	*@param b = an type book obj
	*/
	public void delBook(Book b){
		list.remove(b);
	}
	/**
	* method that displays all the books in the list
	*/
	public void listBooks(){
		System.out.println(list.toString());
	}

}
