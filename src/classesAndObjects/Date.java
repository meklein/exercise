package classesAndObjects;

public class Date {
	
//Constructors
	
	public Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public Date() {
		
	}

/*Create a class called Date that includes three pieces of information as instance variables 
 * 1. Month (type int) 2. Day (type int) 3. Year (type int). 
 */
	
	private int month;
	private int day;
	private int year;
	
//Getters 'n Setters
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
//Define additional methods
	
	public String displayDate() {
		return month+"/"+day+"/"+year;
	}
	
//toString
	
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
	
}
