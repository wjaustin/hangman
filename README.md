# hangman
Hangman project for Software Engineering
Developed by Jordan Johnson and Wesley Austin

Running the Screen1 object will start the game.  An executable file was created that automatically handles this process.

This game uses two screens as specified, the first screen having a normal layout, but no interactive buttons.
Once Start Game is pressed, a second screen appears and the first disapears.  This second screen is fully interactable.
A random word is chosen from a bank of preset words, and the spaces are displayed to signify letters to be guessed.  The user will then press the keys to guess letters.  Tries are only counted when the user has not yet won the game (or guessed the entire word), the user has not guessed that letter previously, and if that letter is not in the word being guessed.  There is no penalty for guesses.
The game ends once the user finishes guessing the word.  To play again, pressing Stop Game will return to the first screen, and then pressing Start Game will pick a new word and restart the game.
