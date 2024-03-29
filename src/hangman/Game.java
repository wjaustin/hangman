/**
 * Instance of game logic.
 */
package hangman;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jordan Johnson, Wesley Austin
 *
 */
public class Game {
	String[] wordList = {"coding", "networking", "hangman", "superman", "batman", "software", "jordan", "random", "engineer", "wesley"};
	Random random;
	String theWord;
	char[] display;
	ArrayList<Character> guesses;
	Screen2 screen;
	int tries;

	/**
	 * Constructor.  Initializes Hangman game.
	 */
	public Game(Screen2 screen){
		theWord = pickWord(wordList);
		this.screen = screen;
		tries = 0;
		guesses = new ArrayList<Character>();
		display = new char[theWord.length()];
		for (int i = 0; i < theWord.length(); i++){
			display[i] = '_';
		}
		
		printWord(display);
		printTries(0);
	}
	/**
	 * Gets called when the user presses a letter as a guess.
	 * Performs the needed operations to process the user's input.
	 * @param guess the letter the player has guessed
	 */
	public void runHangman(char guess){
		if (!hasWon()){
			if (!guesses.contains(guess)){
				guesses.add(guess);
				tries++;
				checkForLetter(guess);
				printWord(display);
				printTries(tries);
			}
		}
		
	}
	
	/**
	 * Checks for the letter in the chosen word.  If it contains it, it saves the guess to an ArrayList and
	 * sets up the letter to be displayed to the user.
	 * @param guess the character to search for in the word
	 * @return true if the character occurs at least once, false if it doesn't.
	 */
	private void checkForLetter(char guess) {
		String input = Character.toString(guess);
		if (theWord.contains(input)){
			for (int i = 0; i < theWord.length(); i++){
				if (theWord.substring(i, i+1).equals(input)){
					display[i] = guess;
				}
			}
		}
	}
	/**
	 * Tests the cases in which a player will have won the game,
	 * and returns true if the player has won.
	 * @return true if the player has won, false otherwise.
	 */
	private boolean hasWon(){
		for (int i = 0; i < display.length; i++){
			if (display[i] == '_'){
				return false;
			}
		}
		return true;
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
	
	/**
	 * Turns the character array containing the spaces and correctly guessed letters into an exportable format
	 * and then sends it to the Screen2 class to be displayed.
	 * @param word the array containing spaces for unguessed letters and correctly guessed letters
	 */
	public void printWord(char[] word){
		String output = "";
		for (int i = 0; i < word.length; i++){
			output = output + word[i];
		}
		screen.printWord(output);
	}
	
	/**
	 * Prints the number of tries to the appropriate label in the GUI
	 * @param tries the number of attempts
	 */
	public void printTries(int tries){
		screen.printTries(tries);
	}
	
}
