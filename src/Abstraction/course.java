package Abstraction;

public class course extends college {
	@Override
	public void collegecode() {
	System.out.println("collegecde:979");
	}
	public static void main(String[] args) {
		course c = new course();
		c.collegename();
		c.collegebranch();
		c.collegecode();
	}

		
	}



