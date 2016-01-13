/**
 * 
 */
package hangman;

import java.util.Random;

/**
 * @author wjaau_000
 *
 */
public class Game {
	//TODO initialize variables
	String[] wordList = {"coding", "networking", "hangman", "superman", "batman", "software", "jordan", "random", "engineer", "wesley"};
	Random random;

	/**
	 * Constructor.  Initializes Hangman game.
	 */
	public Game(){
		//TODO
	}
	/**
	 * Main loop that will run the game of Hangman.
	 * The loop will end and the game put into an end state
	 * when the user wins or presses the Stop Game button.
	 */
	public void runHangman(){
		
	}
	
	/**
	 * Tests the cases in which a player will have won the game,
	 * and returns true if the player has won.
	 * @return true if the player has won, false otherwise.
	 */
	private boolean hasWon(){
		
		return false;
	}
	
	/**
	 * Uses a random number picker to select a random word from
	 * the provided string of words.
	 * @param words an array containing all the selectable words
	 * @return a string from words selected at random.
	 */
	private String pickWord(String[] words){
		random = new Random();
		return words[random.nextInt(words.length)];
	}
	
	public void printWord(){
		
	}
	
	/**
	 * Prints the number of tries to the appropriate label in the GUI
	 * @param tries the number of attempts
	 */
	public void printTries(int tries){
		
	}
	
	

}
