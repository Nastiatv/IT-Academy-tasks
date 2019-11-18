package Task29;

import java.util.HashMap;
import java.util.Map;


public class FrequencyDictionary {
	
		String text="мама папа я вместе дружная семья семья я";
		String [] words=text.split(" ");
		
		Map<String, Integer> fd=new HashMap<>();{
	
		for(String i:words) {
			if(fd.containsKey(i)) {
int val=fd.get(i);
fd.remove(i);
fd.put(i, val+1);
			
			} else {
				fd.put(i, 1);
			}
			
		
	
		}
}
}