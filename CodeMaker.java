// Name - Gurvansh Singh  StuId = 300311376

//Purpose of this class is to generate a random 4 digit code with no duplicates.

public class CodeMaker {

	// A member variable of Code to store the secret code.
	private Code secretCode;
	
	// default constructor.
	public CodeMaker() {
		//First thing called when an object of this class is created.
		//Need to create object of Code class to use methods.
		secretCode = new Code();
	}

	// getter of secretCode - needed to access private members of the class.
	public Code getSecretCode() {
		return secretCode;
	}

	// setter of secretCode - needed to set private members of the class.
	public void setSecretCode(Code secretCode) {
		this.secretCode = secretCode;
	}
	
	// this method generate the secret code and store the secret code
	// in the member variable secretCode. The secret code generated will // not have duplicated pegs. For example, it is not allowed to have // the secret code "1 2 2 4" because "2" is a duplicate.
	public void genSecretCode() {
		//While this code has duplicate records, keep on generating random code.
		while(secretCode.hasDuplicatedPegs() == true) {
			secretCode.genRandomCode();
		}
		//This secret code will be returned using getter.
	}
	
}
