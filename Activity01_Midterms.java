import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Activity01_Midterms
 {
 	public static void main (String[] args) throws Exception
 		{
 			Scanner scan = new Scanner(System.in);
 			Date d = new Date();
 			SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
 			Calendar cal = new GregorianCalendar();
 			
 			System.out.print("Enter your Birthdate:");
 			String input_bday = scan.nextLine();
 			Date bday = format.parse(input_bday);
 			
 			int year = cal.get(Calendar.YEAR);
 			cal.setTime(bday);
 			int byear = cal.get(Calendar.YEAR);
 			
 			int age = year - byear;
 			System.out.print("My age: " +age);
 	}

    	
    		
    }
