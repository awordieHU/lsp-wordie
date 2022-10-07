package org.howard.edu.lsp.assignment5.implementation;

/**
* @author  awordieHU
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections; 

public class IntegerSet {
	
	// Hint: probably best to use an array list.  You will need to do a little research
		private List<Integer> iset = new ArrayList<>();

		// Default Constructor
		public IntegerSet() {
		}

		// Clears the internal representation of the set
	public void clear() { 
		iset.clear();
	};


	// Returns the length of the set
	public int length() {
		return iset.size(); 
	}; // returns the length

	
	
	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	
	
	public boolean equals(IntegerSet b) {
		
		
		if (b.size() == iset.size()){

			int total = iset.size(); 
			ArrayList<Integer> grouping = new ArrayList<Integer>();
			for (int i = 0; i <= total; i++) {
				if intSetb.contains(i) == true && iset.contains(i) == true {
					grouping.add(b[i]); 
				}
			}
			if (grouping.size() == iset.size()) {
				return true;
			}
		else {
			return false; 
		}

	}; 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if (iset.contains(value) == true) {
			return true;
		}
		else{
			return false; 
		}
	};    

	
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest(iset)  {
		
		if iset.IsEmpty() == true {
			
			throw new IntegerSetException
		}
		else {
			int theLargest = Collections.max(iset);
			return theLargest; 
		}
			
	}; 
		
		
/**
		@throws IntegerSetException 
		Throws a IntegerSetException if the set is empty for finding the largest element

**/
	
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	
	public int smallest(iset)  {
		if iset.IsEmpty() == true {
			throw new IntegerSetException
		}
		else {
		
		int theSmallest = Collections.min(iset);
		return theSmallest; 
		
		}
	};
	
	
/**
	@throws IntegerSetException 
	Throws a IntegerSetException if the set is empty for finding the smallest element

**/
	


		// Adds an item to the set or does nothing it already there	 no duplicates
	 	public void add(int item) {
	 		
	 		if  (iset.IsEmpty() == false) {
	 			
	 			return iset.add(item);
	 		}
	 		
	 		
	 	}; // adds item to the set or does nothing if it is in set

	 	/**
	 	 * 
	 	 * 
	 	 * @param item   specific element in question to be added with ad method 
	 	 * 				 or to be removed with the remove method
	 	 */
	 
	 	
	 	
		// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		iset.remove(item);
	}; 

	
	
	// Set union
	public void union(IntegerSet intSetb) {
		iset = iset.addAll(inSetb);
		
	};

	// Set intersection
	public void intersect(IntegerSet intSetb) {
		
		int total = iset.size(); 
		ArrayList<Integer> intersects = new ArrayList<Integer>();
		for (int i = 0; i <= total; i++) {
			if intSetb.contains(i) == true && iset.contains(i)==true{
				intersects.add(intSetb[i]);
			}
		}
		iset = intersects;
	}; 

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb); // set difference, i.e. s1 - s2

		int total = iset.size(); 
		ArrayList<Integer> diffs = new ArrayList<Integer>();
		for (int i = 0; i <= total; i++) {
			int num = iset[i] - intSetb[i];
			diffs.add(num);
		}
		iset =  diffs;
	};
		
	// Returns true if the set is empty, false otherwise
	boolean isEmpty(); 

	// Return String representation of your set
	public String toString() {
		
		iset.toString();
	
		};	
	
	

}
