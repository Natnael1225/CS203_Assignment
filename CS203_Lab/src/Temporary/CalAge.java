package Temporary;

import java.time.MonthDay;
import java.time.Year;


public class CalAge {
	
	private static int currentYear = Year.now().getValue();
	private  static int currentMonth  = MonthDay.now().getMonthValue();
	
	private int  year ;
	private int month ;


	public CalAge() {
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	
	public  double yearMonth(double year, double month) {
	 double result = (currentYear - year)+( currentMonth - month)/10;
	 return result;
	}

}
