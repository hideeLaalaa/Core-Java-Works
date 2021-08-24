//Time1 class maintains the time in 24 hour format
package com.deitel.jhtp.ch08;
import javax.swing.JOptionPane;

public class time1 
{	//*** TIME1 8.1 ***//
/*	private int hour;
	private int minute;
	private int second;
	
	//set a new time using universal time
	//throw an exception if hr,sec,min is invalid
	public void setTime(int h,int m,int s)
	{
		//validate hour,minute and sec
		if((h>=0&&h<24)&&(m>=0&&m<60)&&(s>=0&&s<60))
		{
			hour=h;
			minute=m;
			second=s;
		}
		else
			throw new IllegalArgumentException(
					"hour,minute and/or second was out of range");
	}//end method setTime

	// convert to string in universal time format (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format("%d:%02d:%02d", hour,minute,second);
	}/// end universal
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",
				((hour==0||hour==12)?12:hour%12),
				minute,second,(hour<12?"AM":"PM"));
	}//end toString
*/
	//*** TIME2 8.5***//
	/*
	private int hour,minute,second;
	
	//no argument constructor
	public time1(){
		this(0,0,0);
	}
	
	public time1(int h){
		this(h,0,0);
	}
	
	public time1(int h,int m){
		this(h,m,0);
	}
	
	public time1(int h,int m,int s){
		setTime(h,m,s);
	}
	//time1 object supplied
	public time1(time1 time){
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	
	public void setTime(int h,int m,int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h){
		if(h>=0&&h<24)
			hour=h;
		else
			throw new IllegalArgumentException("hour must be 0-23");
	}
	
	public void setMinute(int m){
		if(m>=0&&m<60)
			minute=m;
		else
			throw new IllegalArgumentException("minute must be 0-59");
	}
	
	public void setSecond(int s){
		if(s>=0&&s<60)
			second=s;
		else
			throw new IllegalArgumentException("second must be 0-59");
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d %s", 
				( (getHour()==0||getHour()==12) ? 12 : getHour()%12 ),
				getMinute(),getSecond(),(getHour()<12?"AM":"PM"));
	}
	
}//end time1
*/
	

}