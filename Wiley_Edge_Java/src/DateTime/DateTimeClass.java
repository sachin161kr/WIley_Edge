package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
	  
		LocalDate myDate = 	 LocalDate.now();
		
		System.out.println(myDate);
		
		LocalDateTime myDateTime = LocalDateTime.now();
		
		//System.out.println("Before Format "+myDateTime);

		DateTimeFormatter myDateFormat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myDateFormat2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter myDateFormat3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		DateTimeFormatter myDateFormat4 = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
		
		String modDateTime = myDateTime.format(myDateFormat1);
		
		String format1 = myDateTime.format(myDateFormat1);
		String format2 = myDateTime.format(myDateFormat2);
		String format3 = myDateTime.format(myDateFormat3);
		String format4 = myDateTime.format(myDateFormat4);
		
		System.out.println("After format 1 : "+format1);
		System.out.println("After format 2 : "+format2);
		System.out.println("After format 3 : "+format3);
		System.out.println("After format 4 : "+format4);
		
		String dateStr = "26/04/2023";
		
		LocalDate date = LocalDate.parse(dateStr,myDateFormat2);
		
		System.out.println(date);
	}

}
