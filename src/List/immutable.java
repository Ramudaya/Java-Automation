package List;

public class immutable {
	public static void main(String[] args) {
		
		String s = "life of ram";
		String s1 = "life of ud";
		String s3 = "life of ram";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s1));
		
		System.out.println("after concat");
		String s2 = s.concat(s1);
		System.out.println(System.identityHashCode(s2));

	}

}
