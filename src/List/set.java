package List;

import java.util.HashSet;
import java.util.Set;

public class set {
	
	public static void main(String[] args) {
		Set<Object> s = new HashSet<>();
		
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