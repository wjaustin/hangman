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
	String theWord;
	
	static Screen1 sc1;
	static Screen2 sc2;

	/**
	 * Constructor.  Initializes Hangman game.
	 */
	public static void main(String[]args){
		//TODO
		sc1 = new Screen1();
		sc2 = new Screen2();
		sc1.setVisible(true);
	}
	/**
	 * Main loop that will run the game of Hangman.
	 * The loop will end and the game put into an end state
	 * when the user wins or presses the Stop Game button.
	 */
	public void runHangman(){
		theWord = pickWord(wordList);
		printWord(theWord);
		
		while (!hasWon()){
			//TODO
		}
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
	
	public void printWord(String word){
		
	}
	
	/**
	 * Prints the number of tries to the appropriate label in the GUI
	 * @param tries the number of attempts
	 */
	public void printTries(int tries){
		
	}
	
	

}
