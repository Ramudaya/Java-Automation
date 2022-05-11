package Variables;

public class classvariable {
	int a = 54;
	
	public void collegecode() {
		int i = 333;
		System.out.println(a);
		System.out.println(i);
	}
		
		public  boolean vengat() {
			int a= 5;
			int b= 6;
			boolean value;
			
			
			if(a<b) {
			System.out.println(a);
			value=true;
			}else
				value =false;
			
			
return value;

		}
		
	
	public static void main(String[] args) {
		classvariable cv = new classvariable();
		cv.collegecode();
		System.out.println(cv.a);
		cv.vengat("sathya123");
	
		
	}

}
