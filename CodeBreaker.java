// Name - Gurvansh Singh  StuId = 300311376

//Purpose of this class is to take input from user that will be compared to the random code.
import java.util.Scanner;

public class CodeBreaker {
	// A member variable of Code to store the guess code.
	private Code guessCode;
	
	// default constructor.
	public CodeBreaker() {
		//First thing called when object of CodeBreaker is created.
		//Need to create object of Code class to use methods.
		guessCode = new Code();
	}

	// getter of guessCode - needed to access private members of the class.
	public Code getGuessCode() {
		return guessCode;
	}

	// setter of guessCode - needed to set private members of the class.
	public void setGuessCode(Code guessCode) {
		this.guessCode = guessCode;
	}
	
	// This is a method to get the guess code from the player, and store // the input to guessCode.
	public void getGuessCodeInput() {
		//Need to take four integer input from user and set values of 4 pegs.
		//Setting default value 0 if anything goes wrong.
		int peg1 = 0,
			peg2 = 0,
			peg3 = 0,
			peg4 = 0;
		
		//Need to use Scanner class for inputs.
		Scanner sc = new Scanner(System.in);
		
		//Using nextInt assuming user is putting valid input.
		peg1 = sc.nextInt();
		peg2 = sc.nextInt();
		peg3 = sc.nextInt();
		peg4 = sc.nextInt();
		
		//Using setPegs method to set value of all 4 pegs to be compared with system generated code.
		guessCode.setPegs(peg1, peg2, peg3, peg4);
		
		//guessCode is set and can be accessed using getter.
	}
}
