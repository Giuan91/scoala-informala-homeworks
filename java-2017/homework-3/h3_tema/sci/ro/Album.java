package ro.sci.h3_tema;

/**subclass of obj book*/

public class Album extends Book {

	private String paper;
	/**
	*Constructor of object "album"
	*@param t = title
	*@param p = number of pages
	*@param pa = paper type
	*/
	public Album(String t, int p, String pa) {
		super(t, p);
		this.setPaper(pa);
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}
	/**
	*method that returns the textual representation of album
	*/
	@Override
	public String toString(){
		return newLine + "Album" + newLine + " Title: " + super.getTitle() + " Page num: " + this.getPageNum()
		+ " Paper: " + getPaper();
	}
}
