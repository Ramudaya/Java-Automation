package List;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashentry {
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
		
		int size = m.size();
		System.out.println(size);
		
		Set<Entry<Integer, Object>> entrySet = m.entrySet();
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
			Set<Entry<Integer,Object>> entrySet2 = m.entrySet();
			for (Entry<Integer, Object> entry2 : entrySet) {
				System.out.println(entry2);
			}
		}
	}

}
