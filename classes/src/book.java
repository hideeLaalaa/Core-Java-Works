
public enum book {
	//declare constants of enum type
/*	JHTP("Java how to program","2012"),
	CHTP("C how to program","2007"),
	IW3HTP("Internet & world wide web How to program","2008"),
	CPPHTP("C++ how to program","2012"),
	VBHTP("Visual basic how to program","2011"),
	CSHARPHTP("Visual c# 2010 How to program","2011");
	
	private final String title;
	private final String copyrightYear;
	
	book(String bookTitle,String year) {
		title =  bookTitle;
		copyrightYear = year;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getCopyrightYear(){
		return copyrightYear;
	}
*/
	
	//declare traffic light constants
	RED(15),
	GREEN(30),
	YELLOW(3);
	
	private int time;
	
	book(int time){
		this.time=time;
	}
	
	public int getTime(){
		return this.time;
	}
	
}
