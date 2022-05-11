package Collections;

public class methodtypes {

	public static void main(String[] args) {
		String a = "Today special Briyani";
		
		int length = a.length();
		System.out.println(length);
		
	 boolean contains = a.contains("Briyani");
	 System.out.println(contains);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		
	   String replaceAll = a.replaceAll("Briyani","parota" );
	   System.out.println(replaceAll );
	   
	   String substring = a.substring(18);
	   System.out.println(substring);
	   
	   String substring2 = a.substring(8,16);
	   System.out.println( substring2);
	   
	
	
}
}
