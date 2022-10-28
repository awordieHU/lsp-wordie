package org.howard.edu.lsp.midterm.problem2;
package org.howard.edu.lsp.midterm.problem2;

public class PersonDriver {
	
	Person p1 = new Person(“Carl”, “111-11-1111”,9);
	Person p2 = new Person(“Dave”, “111-11-1111”, 11);
	
	if (p1.equals(p2)) {
	    System.out.println(“These are the same!”);	// in this case, they would be the same
	} else {
	    System.out.println(“Not the same!”);
	}
	
	
	
	Person p1 = new Person(“Carl”, “111-12-1111”,9);
	Person p2 = new Person(“Dave”, “111-11-1111”, 11);
	
	if (p1.equals(p2)) {
	    System.out.println(“These are the same!”);	// in this case, they would be the same
	} else {
	    System.out.println(“Not the same!”);
	}
}
}
