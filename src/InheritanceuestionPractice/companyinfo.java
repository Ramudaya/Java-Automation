package InheritanceuestionPractice;

public class companyinfo extends employe {
	public void companyname() {
		System.out.println("name:greens");
		}
		public void companyphone() {
		System.out.println("phone:978754535");	
		}
		public void companyaddressl() {
		System.out.println("company add:adayar");	
		}
		public void companybranch() {
		System.out.println("bramch:3");
		}		
		public static void main(String[] args) {
		companyinfo f = new companyinfo();
		f.companyname();
		f.companybranch();
		f.companyphone();
		f.companyaddressl();
		f.empId();
		f.empmail();
		f.empname();
		f.empphone();
		
		}
}



