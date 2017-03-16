package ch11;

public class CalendarEx9 {
	public static void main(String[] args){
		System.out.println("2004. 5. 31 :" + getDayOfWeek(2004, 5, 31));
		System.out.println("2002. 6. 1 :" + getDayOfWeek(2002, 6, 1));
		System.out.println("2004. 5.1 - 2004.4.28:" + dayDiff(2004,5,1,2004,4,28));
		
	}
	
	public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isLeapYear(int year){
		return ((year%4 == 0)&&(year%100 != 0)||(year%400==0));
	}
	
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2){
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
	}
			
	public static int getDayOfWeek(int year, int month, int day){
		return convertDateToDay(year, month, day)%7 + 1;
	}
	
	public static int convertDateToDay(int year, int month, int day){
		int numOfLeapYear = 0;
		
		for(int i=1; i<year; i++){
			if(isLeapYear(i))
				numOfLeapYear++;
		}
		
		int toLastYearDaySum = (year-1) * 365 + numOfLeapYear;
		
		int thisYearDaySum = 0;
		
		for(int i=0; i<month-1; i++){
			thisYearDaySum += endOfMonth[i];
		}
		
		thisYearDaySum += day;
		
		return toLastYearDaySum + thisYearDaySum;
	}
}
