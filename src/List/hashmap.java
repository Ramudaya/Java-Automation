package List;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		Map<Integer, Object> m = new HashMap<>();
		
		m.put(null, 8);
		m.put(9, "uday");
		m.put(null, 88);
		m.put(null, 'm');
		m.put(9, false);
		m.put(23, 7888.989f);
		m.put(98, null);
		m.put(7, 69);
		m.put(9, "ud");
		
		System.out.println(m);
		
		Object object = m.get(7);
		System.out.println(object);
		
		boolean containsKey = m.containsKey(989);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("ud");
		System.out.println(containsValue);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = m.values();
		System.out.println(values);
	}
	
		
		
	
	
	

}
