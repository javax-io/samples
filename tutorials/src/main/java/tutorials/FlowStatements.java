package tutorials;
/**
 * 
 */
public class FlowStatements {
    /**
     * Using if statememnt to return day of week
     */
    static String dayOfWeek(int day) {
        if(day == 0) {
            return "S";
        } else if(day == 1) {
            return "M";
        } else if(day == 2) {
            return "T";
        } else if(day == 3) {
            return "W";
        } else if(day == 4) {
            return "T";
        } else if(day == 5) {
            return "F";   
        } else if(day == 6) {
            return "S";   
        } else {
            return "?";   
        }
    }
    
    //print with addition string to make len
    static void printTab(String s, int len) {
        System.out.print(s);
        while(len -- > s.length()) {
            System.out.print(" ");
        }
    }
    
    //print a month calendar with first day and number of day of month
	public static void main(String[] args) {
	    int firstDay = Integer.valueOf(args[0]);//0-6
	    int daysOfMonth = Integer.valueOf(args[1]);
	    
		//print heading
		for(int i = 0; i < 7; i ++) {
		    printTab(dayOfWeek(i), 5);
		}
		System.out.println();
		
		//padding until first day
		for(int i = 0; i < firstDay; i ++) {
		    printTab("", 5);
		}
		//print each row
		for(int i = 1; i <= daysOfMonth; i ++) {
		    printTab(String.valueOf(i), 5);
		    if((i + firstDay) % 7 == 0) {
		        System.out.println();
		    }
		}
	}
}
