package DansieZhao;

public class DotComGame {

	public static void main(String[] args) {
		DotCom ndot = new DotCom();
		int numOfGuesses = 0;
		int[] dotComCell = ndot.setLocationCells(null);
		boolean isAlive = true;
		GetUserInput userInput = new GetUserInput();
		while (isAlive == true){
			String userGuess = userInput.getUserInput("Please enter a number between 0~6");
			String result = ndot.checkYourself(userGuess);
				numOfGuesses++;
			if (result == "kill"){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " steps");
			}
		}
	}

}
