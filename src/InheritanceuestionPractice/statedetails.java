package InheritanceuestionPractice;

public class statedetails{
public void statename() {
System.out.println("tamil:tamilnadu");
}
public void staname() {
System.out.println("malayalam :kerala");
}
public void statname() {
System.out.println("hindi:karnataka");	
}
public static void main(String[] args) {
statedetails sd = new statedetails();
languageinfo l = new languageinfo();
sd.staname();
sd.statename();
sd.statname();
l.laname();
l.langname();
l.laname();


}

	

	
}

