package tutorials;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * 
 */
public class RegularExpressions {
	public static void main(String[] args) {
	    //create pattern & matcher
		Pattern pattern = Pattern.compile(args[0]);
		Matcher matcher = pattern.matcher(args[1]);
		
		//find or test for matches with matcher.matches()
		int found = 0;
        while (matcher.find()) {
        	System.out.println("Found text: [" + matcher.group()
        		+ "] starting at: [" + matcher.start() + "] ending at: [" + matcher.end() + "]");
            
        	//capture groups if any
            for(int i = 1; i <= matcher.groupCount(); i ++) {
                System.out.println("Group: [" + i + "]: " + matcher.group(i));
            }
            found ++;
        }
        
        //summary
        if(found == 0){
        	System.out.println("Not found any match");
        } else {
        	System.out.println("Found " + found + " matches.");
        }
	}
}
