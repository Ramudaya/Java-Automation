package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class additionalmethods {
	public static void main(String[] args) {
		 List<Integer> lt = new ArrayList<>();
				 List<Object> o = new Vector<>();
				 
				 o.add(9899);
				 o.add(97878);
				 o.add(998);
				 o.add("ram" );
				 o.add(8676.76f);
				 o.add(null);
				 o.add(500);
				 System.out.println(o);
				 
				 lt.add(98);
				 lt.add(87);
				 lt.add(809);
				System.out.println(lt);
				 
				o.addAll(lt);
				System.out.println(o);
				
				o.retainAll(lt);
				System.out.println(o);
				
				o.removeAll(lt);
				System.out.println(o);
				
				 
				 
	}

}
