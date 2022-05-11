package Exception;

public class arrayindexout {
	public static void main(String[] args) {
		
		int i[] = new int[3];
		i[0]= 98;
		i[1]= 89;
		i[2]= 79;
		i[3]= 90;
		i[4]= 989;
		
		System.out.println(i[3]);
	}

}
