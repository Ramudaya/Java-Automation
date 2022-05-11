package Exception;

import java.util.ArrayList;
import java.util.List;

public class indexoutofbound {
	
	public static void main(String[] args) {
		List<Integer>it = new ArrayList<>();
		it.add(768);
		it.add(77);
		it.add(null);
		
		Integer integer = it.get(3);
		System.out.println(integer);
		

}
}
