package Collections;

import java.util.List;
import java.util.Vector;

public class objectcreation {
	public static void main(String[] args) {
		List<Object>l = new Vector<>();
		
		l.add(1233);
		l.add("kp karupu");
		l.add(878676.87878f);
		l.add(8777);
		l.add(null);
		System.out.println(l);
		
		l.add(758);
		System.out.println(l);
		
		boolean contains = l.contains(65);
		System.out.println(contains);
		
		int indexOf = l.indexOf(8777);
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf(1233);
		System.out.println(lastIndexOf);
		
		Object object = l.get(4);
		System.out.println(object);
		
		Object set = l.set(3, 'c');
		System.out.println(set);
		
		Object remove = l.remove(2);
		System.out.println(remove);
		
		l.clear();
		System.out.println(l);
		
		
		
		
	}

}
