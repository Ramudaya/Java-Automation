package Collections;

public class stringmethod {
	public static void main(String[] args) {
		
		String s = "welcome   to    the   world";
		
		int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals( "welcome to the world");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("welcomE   To    the   worLd");
	System.out.println(equalsIgnoreCase);

	}
}
