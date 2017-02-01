package ro.sci.h3_tema;

public class Book {
	private String title;
	private int pageNum;
	/**
	*Constructor of object "novel"
	*@param t = title
	*@param p = number of pages
	*/
	
	public Book(String t, int p){
		this.setTitle(t);
		this.setPageNum(p);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	
	final String newLine = System.getProperty("line.separator");
	/**
	*method that returns the textual representation of book
	*/
	@Override
	public String toString(){
		return "Title: " + this.title + " Page num: " + this.pageNum;
}
	
}