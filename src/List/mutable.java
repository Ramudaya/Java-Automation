package List;

public class mutable {

public static void main(String[] args) {
	
	StringBuffer b = new StringBuffer("marun");
	StringBuffer b1 = new StringBuffer("aravind");
	StringBuffer b2 = new StringBuffer("prabha");
	StringBuffer b3 = new StringBuffer("marun");
	
	System.out.println(System.identityHashCode(b2));
	System.out.println(System.identityHashCode(b3));
	System.out.println(System.identityHashCode(b1));
	System.out.println(System.identityHashCode(b));
		
	System.out.println("'append'");
	
	StringBuffer b4 = b.append(b2);
	System.out.println(System.identityHashCode(b4));
	
	
}
}
