import java.util.concurrent.ThreadLocalRandom;

//Honor Code: I have neither given nor received unauthorized aid on this assignment.


public class Hangman {

	private int numwords = 10;
	private String[] words = new String[numwords];
	private String gameWord;
	private char[] dispArr = {'-','-','-','-','-','-','-'}; 
	private char[] wrongArr = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	private int wrongCounter = 0;
	private boolean plays = true; 
	private boolean innerPlay = true;
	

	//Note that since no constructor is defined, there is 
	//a default empty constructor

	/*Method to display the hangman given the number of body parts to show
	 * Player gets at most 10 turns. */
	public void showMan(int numParts)
	{

		if (numParts == 0){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 1){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 2){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 3){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|      __|");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 4){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 5){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 6){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 7){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       /");
			System.out.println("|      /  ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 8){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 9){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|    O/    ");
			System.out.println("|");
			System.out.println("____");

		}
		if (numParts == 10){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|    O/     \\O");
			System.out.println("|");
			System.out.println("____");
		}

	}

	/**
	  Sets the list of candidate words for the player to guess
	 **/
	public void setDefaultWords()
	{

		this.words[0] = "notions";
		this.words[1] = "measure";
		this.words[2] = "product";
		this.words[3] = "foliage";
		this.words[4] = "garbage";
		this.words[5] = "minutes";
		this.words[6] = "chowder";
		this.words[7] = "recital";
		this.words[8] = "concoct";
		this.words[9] = "brownie";		
	}


	/*********************************************************
	 * Below are the setter and getter methods for this class. 
	 * You may not need to use all the methods but they are included
	 * since it is good practice to have them.
	 *********************************************************/

	/*
	 * Sets the number of words
	 */
	public void setNumWords(int num)
	{
		this.numwords = num;
	}


	/*
	 * Returns the number of words
	 */
	public int getNumWords()
	{
		return this.numwords;
	}


	/*
	 * Sets words array
	 */
	public void setWords(String[] w)
	{
		this.words = w;
	}

	/*
	 * Returns the array of words
	 */
	public String[] getWords()
	{
		return this.words;
	}

	
	/*
	 * Selects the game word
	 */
	public String selectGameWord() //retrieves and returns a random word from the list of words for the player to guess
	{
		int chosenNum = ThreadLocalRandom.current().nextInt(0, this.getNumWords());
		String chosenWord = this.words[chosenNum];
		return chosenWord.toUpperCase();
		
	}

	/*
	 * Sets the game word
	 */
	public void setGameWord(String w)
	{
		this.gameWord = w;
		
	}


	/*
	 * Returns the game word
	 */
	public String getGameWord()
	{
		return this.gameWord;
	}

	
	/*
	 * Sets dispArr
	 */
	public void setDispArr(char[] dA)
	{
		this.dispArr = dA;
	}


	/*
	 * Returns dispArr
	 */
	public char[] getDispArr()
	{
		return this.dispArr;
	}
	
	
	
	/*
	 * Sets the game letter that has been
	 * correctly guessed
	 */
	public void setCurrentWord(char letter) {
 	
	 	for (int i = 0; i < gameWord.length(); i++) 
	 		if(gameWord.charAt(i) == letter)
	 			dispArr[i] = letter;
	}
	
	
	/*
	 * Returns the game letter that has been
	 * correctly guessed
	 */
	public String getCurrentWord() {
		String strArr = new String(dispArr);
	 	return strArr.toUpperCase();
	}
	
	
	/*
	 * Sets the game letter that has been
	 * incorrectly guessed
	 */
	public void setIncorrectGuesses(char letter)
	{
		int counter = (0); //it is the index of the array
		for (int i = 0; i < gameWord.length(); i++) {
	 		if(gameWord.charAt(i) == letter) 
	 			counter++;  
		}
		
	 	if (counter == 0) {
	 		wrongArr[wrongCounter] = letter; 
	 		wrongCounter++; //counter increases when the index of the array is 0, meaning no matches between the user input and the array were found
	 		System.out.println("Incorrect");
	 		showMan(wrongCounter); //adds a portion of the hangman after an incorrect guess
	 	}
	 	
	 	if (counter > 0) {
			System.out.println("Correct!");
			showMan(wrongCounter); 

	 	}
	}
	
	/*
	 * Returns the (int) number of times 
	 * a wrong guess has been made
	 */
	public int getWrongCounter() 
	{
		return wrongCounter;
	}
	 
	
	/*
	 * Returns the game letter that has been
	 * incorrectly guessed
	 */
	public String getIncorrectGuesses()
	{
		 String wrongStr = new String (wrongArr);
		 return wrongStr.toUpperCase();
	}
	
	/*
	 * Sets the boolean for the condition
	 * in the main while loop for the driver
	 */
	public void setPlays(boolean val)
	{
		this.plays = val;
	}
	
	/*
	 * Returns the boolean for the main while loop in the driver
	 */
	public boolean getPlays()
	{
		return plays;
	}
	
	/*
	 * Sets the boolean for the 
	 * condition of the inner while loop in the driver
	 */
	public void setInnerPlay(boolean val)
	{
		this.innerPlay = val;
	}
	
	/*
	 * Returns the boolean for the inner while loop in the driver
	 */
	public boolean getInnerPlay()
	{
		return innerPlay;
	}

}