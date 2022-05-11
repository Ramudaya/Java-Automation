package Oopspractice;

public class overloading {
	
		public void hdfc(String branch) {
			System.out.println("bank branch:" + branch);
		}

		public void hdfc(String name, int no) {
			System.out.println("bank ifsc:" + name + "," + no);
		}

		public void hdfc(long acc) {
			System.out.println("acc no:" + acc);
		}

		public void hdfc(String name, char initial) {
			System.out.println("cus name:" + name + "," + initial);
		}

		public void hdfc(float value) {
			System.out.println("bank balance:" + value);
		}

		public void hdfc(double credit) {
			System.out.println("deposit:" + credit);
		}

	public static void main(String[] args) {
	overloading sr = new overloading();
	sr.hdfc("labbaikudikadu");
	sr.hdfc("sbn", 0);
	sr.hdfc(23244);
	sr.hdfc("udaya", 's');
	sr.hdfc(75687.65f);
	sr.hdfc(877565879);
				
	}
	}

