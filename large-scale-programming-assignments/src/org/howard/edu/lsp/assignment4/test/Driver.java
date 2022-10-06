package org.howard.edu.lsp.assignment4.test;
package org.howard.edu.lsp.assignment5.implementation;


public class Driver {
	
	public static void main(ArrayList ArrayList) {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		
		// smallest and largest check for set 1
		System.out.println(“Smallest element of Set1 is:” + set1.smallest());
		System.out.println(“Largest element of Set1 is:” + set1.largest());

		//set1 length
		System.out.println(“Length  of Set1 is:” + set1.length());
		
		System.out.println(“Value of Set1 is:” + set1.toString());
		System.out.println(“Smallest value in Set1 is:” + set1.smallest());
		System.out.println(“Largest value in Set1 is:” + set1.largest());

		//adding a new elements to a set 
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(6);

		System.out.println(“Union of Set1 and Set2”);
		System.out.println(“Value of Set1 is:” + set1.toString());
		System.out.println(“Value of Set2 is:” + set2.toString());
		
		//set2 length
		System.out.println(“Length  of Set2 is:” + set2.length());
				
		
		// smallest and largest check for set 2
		System.out.println(“Smallest element of Set2 is:” + set2.smallest());
		System.out.println(“Largest element of Set2 is:” + set2.largest());

		
		//union trials
		set1.union(set2);	// union of set1 and set2
		System.out.println(“Result of union of Set1 and Set2”);
		set1.toString();	// result of union of set1 and set2
		
		//equals set checks
		set2.clear()
		System.out.println(“Set1 and set2 should not be equal.” + set1.equals(set2));
		
		//equals but the same set checks
		set1.clear()
		set2.clear()
		System.out.println(“Set1 and set2 should not be equal.” + set1.equals(set2));

		
	}
	

}

