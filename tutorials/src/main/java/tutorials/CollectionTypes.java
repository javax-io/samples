package tutorials;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTypes {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(args);
		
		//revert the list
		Collections.reverse(list);
		System.out.println("Reversed list: " + list);
		
		//sort the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
        //same using stream filter and print
        System.out.println("Elements with length > 1:");
        list.stream()
        	.filter(s -> s.length() > 1)
        	.forEach(s -> System.out.println(s));
	}
}
