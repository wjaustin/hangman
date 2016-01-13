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
	Screen2 screen;

	/**
	 * Constructor.  Initializes Hangman game.
	 */
	public Game(Screen2 screen){
		theWord = pickWord(wordList);
		this.screen = screen;
	}
	/**
	 * Gets called when the user presses a letter as a guess.
	 * The guess is sent over as the char guess, and this method
	 * then calls all required methods to complete the turn.
	 * @param guess the letter the player has guessed
	 */
	public void runHangman(char guess){
		System.out.println(guess);
		boolean found = checkForLetter(guess);
		if (found){
			//TODO the character exists
		}else{
			//TODO the character does not exist
		}
	}
	
	/**
	 * Checks for the letter in the chosen word.
	 * @param guess the character to search for in the word
	 * @return true if the character occurs at least once, false if it doesn't.
	 */
	private boolean checkForLetter(char guess) {
		// TODO Auto-generated method stub
		return false;
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
		screen.printWord(word);
	}
	
	/**
	 * Prints the number of tries to the appropriate label in the GUI
	 * @param tries the number of attempts
	 */
	public void printTries(int tries){
		screen.printTries(tries);
	}
	
	

}
