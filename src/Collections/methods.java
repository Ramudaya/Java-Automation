package Collections;

public class methods {
public static void main(String[] args) {
		
		String s = "welcome   to   the   world";
		
		int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals( "welcome to the world");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("welcomE   To    the   worLd");
	System.out.println(equalsIgnoreCase);
	
	char charAt = s.charAt(24);
	System.out.println(charAt);
	
	int indexOf = s.indexOf('l');
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf('l');
	System.out.println(lastIndexOf);
	
	int lastIndexOf2 = s.lastIndexOf('l',8);
	System.out.println(lastIndexOf2);
	
     int indexOf2 = s.indexOf('w', 5);	
     System.out.println(indexOf2);
}
}
