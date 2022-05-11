package List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
	public static void main(String[] args) {
		Set<Object> s = new LinkedHashSet<>();
		
		s.add("hhsj");
		s.add(900);
		s.add(98983);
		s.add(889.99f);
		s.add(null);
		s.add(null);
		s.add(900);
		
		System.out.println(s);

}
}
