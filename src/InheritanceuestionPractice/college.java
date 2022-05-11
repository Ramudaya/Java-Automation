package InheritanceuestionPractice;

public class college extends multilevel{
public void collegename() {
System.out.println("name : sathak");		
}
public void collegecode() {
System.out.println("code: 080");
	
}
public void collegerank() {
System.out.println("rank : 125");	
}
public static void main(String[] args) {
college c = new college();
c.collegename();
c.collegecode();
c.collegerank();
c.name();
c.nativename();
c.petname();
}


}
