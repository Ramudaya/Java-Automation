package Abstraction;

import java.security.DomainCombiner;

public class desktop implements software,hardware {
	@Override
	public void earphone() {
	System.out.println("ear price:686");	
	}
	@Override
	public void laptop() {
		System.out.println("laptop name:dell");
	}
	@Override
	public void mobile() {
	System.out.println("mobile launch:usa");
	}
@Override
public void machine() {
System.out.println("machine name:bosch");
}
@Override
public void paint() {
System.out.println("paint name:nippon");	
}
@Override
public void tools() {
System.out.println("tool model:2022");
	
}
public static void main(String[] args) {
	desktop d = new desktop();
	d.earphone();
	d.laptop();
	d.mobile();
	d.machine();
	d.paint();
	d.tools();
	
}
}
