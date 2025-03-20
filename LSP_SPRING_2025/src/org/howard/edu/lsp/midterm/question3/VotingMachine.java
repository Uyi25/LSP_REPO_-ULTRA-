package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents an electronic voting machine for an election.
 */
public class VotingMachine {
    private Map<String, Integer> votes = new HashMap<>();

    /**
     * Adds a candidate to the election.
     *
     * @param name The name of the candidate to add.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public void addCandidate(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Candidate name cannot be null or empty.");
        }
        votes.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for a candidate.
     *
     * @param name The name of the candidate to vote for.
     * @return true if the vote was successfully cast, false otherwise.
     */
    public boolean castVote(String name) {
        if (votes.containsKey(name)) {
            votes.put(name, votes.get(name) + 1);
            return true;
        }
        return false;
    }

    /**
     * Returns the winner of the election.
     *
     * @return A string describing the winner and their vote count.
     *         If no votes were cast, returns "No votes cast."
     */
    public String getWinner() {
        return votes.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> entry.getKey() + " WINS with " + entry.getValue() + " votes!!")
                .orElse("No votes cast.");
    }

    /**
     * Returns a map of all candidates and their vote counts.
     *
     * @return A map where keys are candidate names and values are vote counts.
     */
    public Map<String, Integer> getVoteCounts() {
        return new HashMap<>(votes); // Return a copy to prevent external modification
    }
}

/**
 * Driver class to test the VotingMachine implementation.
 */
class VotingMachineTest {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        // Add candidates
        vm.addCandidate("Alice");
        vm.addCandidate("Bob");
        vm.addCandidate("Charlie");

        // Cast votes
        vm.castVote("Alice");
        vm.castVote("Alice");
        vm.castVote("Bob");
        vm.castVote("Charlie");
        vm.castVote("Charlie");
        vm.castVote("Charlie");

        // Attempt to vote for a non-existent candidate
        System.out.println("Vote for Eve successful? " + vm.castVote("Eve"));

        // Display election results
        System.out.println("Winner: " + vm.getWinner());

        // Display all candidates and their vote counts
        System.out.println("Vote Counts: " + vm.getVoteCounts());
    }
}

