package Keyword;

public class array1 extends array{
	 
	int d = 878; // current class reference
	public void stdname() {
		int e = 878; // local variable
		System.out.println(e);
		System.out.println("id;"+this.d);
		System.out.println("com:"+super.i);
	}
public static void main(String[] args) {
	array1 a = new array1();
	a.stdname();
}
}
