


import java.util.Scanner;

public class TicGame {

	
	public static char move ='X';
	public static char player2= 'O';
	public static int row, column;
	public static char boardGame [][] = new char [3][3];
	public static Scanner  scan = new Scanner(System.in);
	
	
	// main class 
	public static void main(String[] args) {
			
		for (int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3; j++) {
			
				boardGame[i][j]= '_';
			}
		}
			play();
				printBoardGame();
		
		
	}

	

	
	
	
	// Method  of start playing 
	public static void play() {
		boolean startPlayibng= true;
		printBoardGame () ;
		
		while(startPlayibng) {
			System.out.println(" Please enter the number of row and cloumn");
			
			row= scan.nextInt() -1;
			
			column= scan.nextInt() -1 ;
			
			boardGame[row][column]= move;
			
			if(endofthegame(row,column))
					{
				startPlayibng= false;
				System.out.println(" The game is over" + move + " is the winer");
				
			}
			
			printBoardGame () ;
			
			if (move == 'X') {
				move='O';
			}
			else {
				move ='X';
			}
					
		
		
	}
	}
	
	
	// method to show boardgame
	public static void printBoardGame () {
		
		System.out.println(" Tic Tac Toe Game  "); 
		
		// loop for creating rows and coloums
		
		for(int i = 0 ;  i < 3; i++) {
			System.out.println();
			for(int j = 0 ; j < 3 ; j++) {
			System.out.print(boardGame[i][j] + " | ");
			}
		}
		
		System.out.println();
	}
	
	
	public static boolean endofthegame(int play1move, int play2move) {
		
		//vertical line
		
		if(boardGame[0][play2move] == boardGame[1][play2move] 
				&& boardGame[0][play2move]==boardGame[0][play2move])
			return true;
		if(boardGame[play1move][0] == boardGame[play1move][1]
				&& boardGame[play1move][0] == boardGame[play1move][2])
						return true;
		
		// diagonal line
		
		
		if(boardGame[0][0]== boardGame[1][1] &&
				boardGame[0][0]==boardGame[2][2] && boardGame[1][1] !='_')
						return true;
		if( boardGame[0][2]== boardGame[1][1] &&
				boardGame[0][2]== boardGame[2][2] && boardGame[1][1] !='_')
			return true;
		
		return false;
	}
	
}
