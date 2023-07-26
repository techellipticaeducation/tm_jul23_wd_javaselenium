package training;

public class SwitchDemo {
	public static void main(String[] args) {
		
		// input weekday name
		// output - number of
		// monday = 1
		// tuesday = 2
		// Wed = 3
		// Thu = 4
		// Friday = 5
		// Saturday = 6
		// Sunday = 7
		
		// else if -> we can make problem while wrting
		
		// equality
		
		// Mon, Tue, wed, thu, fri, sat, sun
		String weekdayname = "Friday";
		int weekdaynumber = 0;

		switch(weekdayname) {
		case "Sunday":
		case "Sun":
			weekdaynumber = 7;
			break;
		case "Monday":
		case "Mon":
			weekdaynumber = 1;
			break;
		case "Tuesday":
		case "Tues":
			weekdaynumber = 2;
			break;
		case "Wednesday":
		case "Wed":
			weekdaynumber = 3;
			break;
		case "Thursday":
		case "Thu":
			weekdaynumber = 4;
			break;
		case "Friday":
		case "Fri":
			weekdaynumber = 5;
			break;
		case "Saturday":
		case "Sat":
			weekdaynumber = 6;
			break;
		default:
			weekdaynumber = -1;
		}

		System.out.println(weekdayname + " - " + weekdaynumber);
		
		
//		if(  weekdayname.equals("Sunday") || weekdayname.equals("Sun")) {
//			weekdaynumber = 7;
//		}else if(weekdayname.equals("Monday") || weekdayname.equals("Mon")) {
//			weekdaynumber = 1;
//		}else if(weekdayname.equals("Tuesday") || weekdayname.equals("Tue")) {
//			weekdaynumber = 2;
//		}else if(weekdayname.equals("Wednesday") || weekdayname.equals("Wed")) {
//			weekdaynumber = 3;
//		}else if(weekdayname.equals("Thursday")) {
//			weekdaynumber = 4;
//		}else if(weekdayname.equals("Friday")) {
//			weekdaynumber = 5;
//		}else if(weekdayname.equals("Saturday")) {
//			weekdaynumber = 6;
//		}
		
	}
}
