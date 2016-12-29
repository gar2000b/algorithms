/*package com.onlineinteract.codility.live_test.task3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
	public static int solution(int Y, String A, String B, String W) {

		// Map<String, Month> monthMap = new LinkedHashMap<String, Month>();
		// monthMap.put("January", new Month("January", 31));
		// monthMap.put("February", new Month("February", February));
		// monthMap.put("March", new Month("March", 31));
		// monthMap.put("April", new Month("April", 30));
		// monthMap.put("May", new Month("May", 31));
		// monthMap.put("June", new Month("June", 30));
		// monthMap.put("July", new Month("July", 31));
		// monthMap.put("August", new Month("August", 31));
		// monthMap.put("September", new Month("September", 30));
		// monthMap.put("October", new Month("October", 31));
		// monthMap.put("November", new Month("November", 30));
		// monthMap.put("December", new Month("December", 31));

		Map<String, Integer> daysMap = new HashMap<String, Integer>();
		daysMap.put("Monday", Monday);
		daysMap.put("Tuesday", Tuesday);
		daysMap.put("Wednesday", Wednesday);
		daysMap.put("Thursday", Thursday);
		daysMap.put("Friday", Friday);
		daysMap.put("Saturday", Saturday);
		daysMap.put("Sunday", Sunday);

		// work out date for the monday of first month given W e.g: 2016 Jan 1st
		// is Friday.
		// total month days till first month
		int monthPosBegin = monthMap.get(A);
		int monthPosEnd = monthMap.get(B);

		int totalDaysTillFirstMonday = 0;
		// total days till first monday.

		for (int i = 0; i < monthPosBegin; i++) {
			totalDaysTillFirstMonday += monthArray[i];
		}

		int firstDay = daysMap.get(W);
		totalDaysTillFirstMonday = totalDaysTillFirstMonday - firstDay;

		// then remove number of days from end month.
		int daysEndMonth = monthArray[monthPosEnd];
		totalDaysTillFirstMonday = totalDaysTillFirstMonday - daysEndMonth;

		int totalNumberOfConsecutiveWeeksTillBegin = totalDaysTillFirstMonday / 7;

		int totalNumberOfWeeksbetweenPeriod = 0;

		for (int i = monthPosBegin; i <= monthPosEnd; i++) {
			totalNumberOfWeeksbetweenPeriod += monthArray[i];
		}

		totalNumberOfWeeksbetweenPeriod = totalNumberOfWeeksbetweenPeriod / 7;

		// totalNumberOfWeeksbetweenPeriod =
		// totalNumberOfConsecutiveWeeksTillBegin -
		// totalNumberOfWeeksbetweenPeriod;
		// note: incomplete - I still have to work out when the Monday begins in
		// start month and last sunday of end month.

		// return number of whole weeks inclusive of month.
		return totalNumberOfWeeksbetweenPeriod;
	}

	private class Month {
		private String name = "";
		private int noOfDays = 0;

		public Month(String name, int noOfDays) {
			this.name = name;
			this.noOfDays = noOfDays;
		}

		public String getName() {
			return name;
		}

		public int getNoOfDays() {
			return noOfDays;
		}
	}
	
	private class CalendarYear {
		
		int year = 0;
		int February = 28;

		int Monday = 0;
		int Tuesday = 1;
		int Wednesday = 2;
		int Thursday = 3;
		int Friday = 4;
		int Saturday = 5;
		int Sunday = 6;
		
		Month[] monthArray;
		int[] monthPosition = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October"};
		
		public CalendarYear(int year) {
			this.year = year;
			
			if (year % 4 == 0) {
				February = 29;
			}
			
			Month[] monthArray = { new Month("January", 31),
					new Month("February", February), new Month("March", 31),
					new Month("April", 30), new Month("May", 31),
					new Month("June", 30), new Month("July", 31),
					new Month("August", 31), new Month("September", 30),
					new Month("October", 31), new Month("November", 30),
					new Month("December", 31) };
			
			this.monthArray = monthArray;
		}

	}
}*/