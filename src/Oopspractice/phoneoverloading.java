package Oopspractice;

public class phoneoverloading {
public void phone(String model) {
System.out.println("phone name:" +model);	
}
public void phone(Integer modelno,long num) {
System.out.println("numb :"+modelno+","+num);
}
public void phone(float value,int no) {
System.out.println("val:" +value +", "+no);
}
public void phone(char initial,String name) {
System.out.println("ini:"+initial +","+name);
	
}
public static void main(String[] args) {
phoneoverloading s = new phoneoverloading();
s.phone("iphone");
s.phone(13, 88090L);
s.phone(56.34f,87);
s.phone('s', "ram");



	
}

}
