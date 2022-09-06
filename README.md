# Hangman ReadMe

1. Hangman.java
- In the public class hangman, I initiated private global variables such as an array that stores the wrong letters guessed by the user, booleans for the while conditions, and an int counter. 
- In my selectGameWord method, it randomly retrieves and returns a random word from the list of words provided for the player to guess. It then changes the word to uppercase.
- In my setCurrentWord method, it takes in the parameter of the character ‘letter.’ It runs through the dispArr and checks if the letter imputed by the user matches an index/indices of the word. 
- The method getCurrentWord returns the letter into a string that was correctly guessed by the user and turns it into an uppercase letter. 
- The setIncorrectGuesses take in the parameter of the character ‘letter.’ A counter integer variable is then initialized to zero and keeps count of when an index of the game word array matches with the letter character. If there is a match, then the counter increases by one every time. If the counter is equal to zero, then the letter the user guessed is stored into the wrongArr and the wrongCounter increases by one. Then, a new part of the hangman is shown after printing the incorrect statement. However, if the counter is greater than zero, then there was a match with the letter and an index. The correct statement is printed and the hangman is shown as it previously was printed. 
- In the getWrongCounter method, we return the number of times a wrong guess was made. 
- The getIncorrectGuesses method returns in upper case the letter that was incorrectly guessed in the wrongArr and turns it into a string. 
- The method setPlays takes in a boolean value and gives plays a value.
- The method getPlays returns the value of plays.
- The setInnerPlays method sets the boolean value for innerPlay. 
- The getInnerPlays returns the value of innerPlay. 

2. HangmanDriver.java
- In the main method, while plays (our boolean) is true, we create a new hangman so the game can reset when the player chooses to play again. We then call our method setDefaultWords from our hangman class and create our chosenWord after calling our selectGameWord from the hangman class. Here, the code is randomly choosing a word and setting that word to be the game word. The word is then chosen, but shown in dashes, and the hangman is drawn starting at part 0. In our inner while loop, while our boolean method getInnerPlay is true and getWrongCounter is less than 10 (meaning the player guesses wrong less than 10 times), then an updated version of the incorrect attempts appears. We then call our getChoice method (which I will explain later) and turn the user input to uppercase. If the user chooses ‘L,’ then we call our getGuessL method (which I will explain later as well). The letterGuess takes in the wordGuess string and accesses the first index to turn it into a character. The setCurrentWord then takes in letterGuess as its parameter, thus replacing a dash with the letter if the letter was guessed correctly (as stated in the setCurrentWord method in my hangman class). The setIncorrectGuesses takes in the letterGuess as the parameter and checks through the setIncorrectGuesses method in the hangman class. The letter is then printed if the guess matches an index. Once all of the letters are guessed and it matches the chosen word, then the player wins and breaks from the inner loop. If the player guesses incorrectly for more or equal to 10 times, then the player loses and breaks from the inner loop. However, if the user chooses to guess the whole word, we call the getGuessW method (explained later) and if the words match, then the player wins and the game breaks from the inner loop. If the words do not match, then the player loses and the game breaks from the inner loop. Outside of the nested while loop, the user is asked if they want to play again and their response is then turned to uppercase. If the player chooses “Y,” then the game restarts from the first while loop. If the player chooses “N,” then the game ends. 
- The method getChoice asks the player to guess a letter or the entire word and returns their pick. 
- The method getGuessL prompts the player to guess a letter and then returns their response and changes it to uppercase. 
- The method getGuessW asks the player to guess a word and returns it and changes it to uppercase.
