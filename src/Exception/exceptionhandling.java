package Exception;

public class exceptionhandling {
	public static void main(String[] args)throws Throwable {
		
		System.out.println("goodbye");
	    Thread.sleep(2000);
		try {
			System.out.println(888/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.sleep(5000);
		
		}finally {
			System.out.println("new begining");
		}
		
		
	}

}
