package ro.sci.h3_tema;

/**subclass of obj book*/

public class Novel extends Book {
	private String type;
	/**
	*Constructor of object "novel"
	*@param t = title
	*@param p = number of pages
	*@param ty = genre type
	*/
	public Novel(String t, int p, String ty){
		super(t,p);
		this.setType(ty);
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	/**
	*method that returns the textual representation of novel
	*/
	@Override
	public String toString(){
		return newLine + "Novel " + newLine + " Title: " + super.getTitle() + " Page num: " + this.getPageNum()
		+ " Type: " + getType();
	}	

}
