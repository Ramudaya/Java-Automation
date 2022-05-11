package Stringsplit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Keyword.string;

public class linkedhashmap {
	public static void main(String[] args) {
		String s = "welcome to the wonderla to be have fun in the wonderla";
		
		String[] sp = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<>();
		for (String st : sp) {
			
			if (m.containsKey(st)) {
				Integer in = m.get(st);
				m.put(st, in+1);
				System.out.println(m);

			} 

			
			
		
		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if (entry.getValue()>1) {
			
		
		System.out.println(entry);
	}
	
}
	
		
	}
}


