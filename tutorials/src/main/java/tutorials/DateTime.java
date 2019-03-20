package tutorials;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.ZoneId;
import java.util.Date;

/**
 * As of java8 date time objects are handy. Highly recommended to use LocalXxxx to manipulate date time.
 */
public class DateTime {
	public static void main(String[] args) {
	    //now
		System.out.println("System Now:" + System.currentTimeMillis());
		System.out.println("Instant Now:" + Instant.now());
		
		System.out.println("Date Now:" + new Date());
		System.out.println("Local Now:" + LocalDateTime.now());
		
		//time zone and offset details
		ZoneId zoneId    = ZoneId.systemDefault();
		LocalDateTime dt = LocalDateTime.now();
		ZonedDateTime zdt= dt.atZone(zoneId);
		
		ZoneOffset offset = zdt.getOffset();
		int secondsOfHour = offset.getTotalSeconds() % 3600;
		System.out.println("Zone: " + zoneId);
		System.out.println("Offset: " + offset);
		System.out.println("Seconds: " + secondsOfHour);
	}
}