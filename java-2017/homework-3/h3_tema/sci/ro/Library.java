
package ro.sci.h3_tema;
public class Library {

	public static void main(String[] args){
		
		DataBase dataBase = new DataBase(); 
		
		Album a1 = new Album("Copilarie Dan", 12, "glossy");
		Album a2 = new Album("Poze Liceu", 45, "plain");
		Album a3 = new Album("Mari opere de arta", 200, "glossy");
		Novel n1 = new Novel("Harry Potter", 312, "Adventure");
		
		dataBase.addBook(a1);
		dataBase.addBook(a2);
		dataBase.addBook(a3);
		dataBase.addBook(n1);
		
		dataBase.listBooks();
		
		dataBase.delBook(a3);
		
		dataBase.listBooks();
		
		

	}	

}

