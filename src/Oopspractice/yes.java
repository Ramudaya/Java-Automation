package Oopspractice;

public class yes extends overriding {
@Override
public void name() {
	super.name();
	System.out.println("loan  :70%");
}
public static void main(String[] args) {
	yes y = new yes();
	y.name();
}

}
