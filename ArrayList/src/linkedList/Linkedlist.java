package linkedList;

import java.util.LinkedList;

public class Linkedlist {

			public static void main(String[] args) {
				
				LinkedList ll = new LinkedList();
				ll.add(500);
				ll.add("abcd");
				ll.add('W');
				ll.add(1030);
				ll.add(null);
				ll.add(null);
				System.out.println(ll);
				//get the size
				System.out.println(ll.size());
				//printing vllue at a particular index
				System.out.println(ll.get(2));
				//set a vllue at a particular index
				ll.set(1, "XYZ");
				System.out.println(ll);
				//remove a vllue at a particular index
				ll.remove(4);
				System.out.println(ll);
				//to check a value
				System.out.println(ll.contains("XYZ"));
				//to check if it is empty for not
				System.out.println(ll.isEmpty());
				// to delete lll records
				ll.clear();
				System.out.println(ll);
				}

	}


