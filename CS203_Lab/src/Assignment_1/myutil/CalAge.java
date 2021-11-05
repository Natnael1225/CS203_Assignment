package myutil;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;


public class CalAge {
	
	private  int todayDate;
	private int  birthDay ;
	private double age ;
	
	
	public CalAge(int todayDate , int  birthDay) {
		LocalDate today =  LocalDate.now();
		this.todayDate = today.getYear();
		LocalDate dateTeller = LocalDate.of(1999, 04, 15);
		this.birthDay =dateTeller.getYear();
		 age = todayDate - birthDay;
	}
	
	public double getAge() {
		return age;
	}
	
//	public double calAge(int year, int birth) {
//	
//		LocalDate today =  LocalDate.now();
//		year = today.getYear();
//		LocalDate birthDay = LocalDate.of(1999, 04, 15);
//		 birth = birthDay.getYear();
//		 age =  year - birth;
//	   return age;
//	}
	


//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
//	public int getMonth() {
//		return month;
//	}
//	public void setMonth(int month) {
//		this.month = month;
//	}

	
//	public  double yearMonth(double year, double month) {
//	 double result = (currentYear - year)+( currentMonth - month)/10;
//	 return result;
//	}

}
