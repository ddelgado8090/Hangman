import java.util.Scanner;

//Honor Code: I have neither given nor received unauthorized aid on this assignment.

public class HangmanDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		boolean plays = true;
		
		while (plays) {
			
			Hangman HM1 = new Hangman (); //resets the game when we come back to it

			HM1.setDefaultWords();
			String chosenWord = HM1.selectGameWord();
			HM1.setGameWord(chosenWord); //sets the game word chosen randomly by computer
			//System.out.println(chosenWord);
			
			System.out.println("Welcome to Hangman! \nGenerating a secrete word...\nHere is your Word:");
			
			System.out.println(HM1.getCurrentWord());
			
			HM1.showMan(0); //starts the hangman drawing at 0
			
				while (HM1.getInnerPlay() && HM1.getWrongCounter() < 10) { //loops while the innerPlay is true and the wrong guess counter is less than 10

					System.out.println("Incorrect Guesses: " + HM1.getIncorrectGuesses()); //prints the incorrect guesses inputed by user
					
					String choiceStr = getChoice().toUpperCase(); //changes getChoice return to upper case
					
					if (choiceStr.equals("L")) {
						String wordGuess = getGuessL(); //calling our getGuess method
						char letterGuess = wordGuess.charAt(0); //accessing the fist index of the string which is the character
						HM1.setCurrentWord(letterGuess); //setting the setCurrentWord from our Hangman class and putting the letterGuess character as the parameter
						HM1.setIncorrectGuesses(letterGuess); //setting the setIncorrectGuesses from the Hangman class and putting letterGuess as the parameter
						String newLetter = HM1.getCurrentWord(); //calling our getCurrentWord from the Hangman class
						System.out.println(newLetter);	
						
						if (newLetter.equals(chosenWord)) {
							System.out.println("Correct! \nYou win!");
							break;
						}
						else if (HM1.getWrongCounter() >= 10) {
							System.out.println("You lost! \nThe correct word was: " + chosenWord.toLowerCase());
							break;
						}
					}
					
					else if (choiceStr.equals("W")) {
						String userGuess = getGuessW();  
						
						if (userGuess.equals(chosenWord)) { //if word inputed by user and the word chosen by computer match, player wins
							System.out.println("Correct! \nYou win!");
							break;
						
						}
						
						else { //if words do not match, player loses
							System.out.println("You guessed incorrectly! \nYou lost! \nThe correct word was: " + chosenWord.toLowerCase());
							break;
							
						}
					}
					
					
				} //nested while
				
				System.out.println("Play again: Yes (Y) or No (N)");
				String playAgain = scan.nextLine().toUpperCase(); //changes the user input to upper case
 
				if (playAgain.equals("Y")) {
					HM1.setPlays(true); //restarts the game form the first loop
					}
				
				else if (playAgain.equals("N")) {
					System.out.println ("Goodbye!");
					HM1.setInnerPlay(false);
					plays = false;
					scan.close();
					//ends game
				}
				
		} //first while
		

	}
	
	public static String getChoice() {
		//asks the player to choose to guess a letter or the entire word and returns their response
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Type L to guess a letter or W to guess a word:");
		String letterGame = scan.next(); 
//		scan.close();
		return letterGame;
	}
	
		
	public static String getGuessL() { 
		//prompts the player to guess a letter
		Scanner scan = new Scanner (System.in);
		
			System.out.println("Enter your guess (as a single letter):");
			String wordGuess = scan.nextLine(); 
//			scan.close();

		return wordGuess.toUpperCase();
		
	}


	public static String getGuessW() { 
		//prompts the player to guess a word
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your guess (as a word):");
		String userGuess = scan.nextLine(); 
//		scan.close();

		return userGuess.toUpperCase();
		
	}
	
	
	

}
