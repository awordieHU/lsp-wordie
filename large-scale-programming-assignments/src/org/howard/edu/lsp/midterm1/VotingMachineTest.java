package org.howard.edu.lsp.midterm1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VotingMachineTest {

	

	@Test
	@DisplayName("Test cases for getVotes")
	public void collecTheVotes() {
		
		
		VotingMachine newBallot = new VotingMachine();
		
		newBallot.addCandidate("Trump"); 
		newBallot.addCandidate("Harris"); 
		newBallot.addCandidate("Biden"); 
		newBallot.castVotes("Trump", 30);
		newBallot.castVotes("Harris", 50);
		newBallot.castVotes("Biden", 40);
		@assertTrue(40, newBallot.getVotes("Biden")); 
	}
	
	
	@Test
	@DisplayName("Test cases for sum")
	public void totalOfVotes() {
		
		
		VotingMachine newBallot = new VotingMachine();
		
		newBallot.addCandidate("Trump"); 
		newBallot.addCandidate("Harris"); 
		newBallot.addCandidate("Biden"); 
		newBallot.castVotes("Trump", 30);
		newBallot.castVotes("Harris", 50);
		newBallot.castVotes("Biden", 40);
		@assertTrue(120, newBallot.sum()); 
	}
	

}
