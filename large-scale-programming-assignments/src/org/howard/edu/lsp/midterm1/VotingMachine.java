package org.howard.edu.lsp.midterm1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @author : awordieHU
 * @version 1.0
* 	@since   2022-10-27 
 */

public class VotingMachine {
	// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.

	Map<String, Integer> ballot = new HashMap<String, Integer>(); 
	
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		ballot.put(name, 0);
	} 

	
	
	public void castVotes(String name, int votes) {
		// Cast votes to the candidate with the given name
		ballot.put(name, ballot.get(name) + votes);
	}

	public int getVotes(String name) throws UnknownCandidateException {
		// Return the number of votes for a given candidate.  Throws
// UnknownCandidateException if name not present.  Make this a 
// checked exception.
		
		if (ballot.containsKey(name) == false)  {
			throw new UnknownCandidateException(); 
		}
		int votes = ballot.get(name); 
		return votes; 
		
	
	}



	public int sum() {
		// Return the total number of votes for all candidates.	
		
		int total = 0; 
		for (int val : ballot.values()) {
		    total += val;
		}
		return total;
	}
}

/**
 * 
 * @return total of all votes for all candidates
 */
