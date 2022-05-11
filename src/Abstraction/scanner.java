package Abstraction;

import java.io.InputStream;
import java.util.Scanner;


public class scanner {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter ur fav place");
		String name = scan.nextLine();
		System.out.println("ur fav place:" + name);
		
	System.out.println("enter ur fav no");
	int num = scan.nextInt();
	System.out.println("ur fav no:" +num);
	
	System.out.println("enter ur fav food");
	String food = scan.next();
	System.out.println("ur fav food:" + food);
	
	System.out.println("food cooking time");
	float ft = scan.nextFloat();
	System.out.println("time:" +ft);
	
	
				
	}
}
	
