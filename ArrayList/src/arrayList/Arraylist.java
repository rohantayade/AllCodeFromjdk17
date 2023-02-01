package arrayList;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	
	ArrayList a1=new ArrayList();
	a1.add(100);
	a1.add("abc");
	a1.add("d");
	a1.add(100);
	a1.add(null);
	a1.add(null);
	
	
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.get(3));
	a1.set(1, "xyz");
	System.out.println(a1);
	a1.remove(4);
	System.out.println(a1);
	System.out.println(a1.contains("xyz"));
	System.out.println(a1.isEmpty());
	a1.clear();
	System.out.println(a1);
	
	
	

	}

}
