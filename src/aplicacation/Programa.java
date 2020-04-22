package aplicacation;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[][] hash = new char[3][3];

		System.out.println("Player one = X");
		System.out.println("Player two = O");

		boolean win = false;
		int move = 1;
		char signal;
		int line = 0, column = 0;

		while (win != true) {

			if (move % 2 == 1) { // player one
				System.out.println("\nFirst player turn. Choose line and a column!(1-3)");
				signal = 'X';
			}

			else {
				System.out.println("\nSecond player turn. Choose line and columm! (1-3)");
				signal = 'O';

			}

			boolean validLine = false;
			while (!validLine) {
				System.out.println("Inform a valid Line (1 , 2 or 3)");
				line = input.nextInt();
				if (line >= 1 && line <= 3) {
					validLine = true;
				} else {
					System.out.println("Invalid line, try again. Choose a value between 1, 2 or 3");
				}
			}

			boolean validColumn = false;

			while (!validColumn) {
				System.out.println("Infor a valid column (1, 2, or 3)");
				column = input.nextInt();
				if (column >= 1 && column <= 3) {
					validColumn = true;
				} else {
					System.out.println("Invalid column, try again. Choose a value between 1, 2 or 3");

				}
			}
			//matrix start line =0 and column=0
			
			line--;
			column--;
			
			if (hash [line][column] =='X' || hash [line][column] =='O') {
				System.out.println("Position already use, try again!");
			} else { //valid move
				hash [line][column] = signal;
				move++;
			}
			
			//print board
			
			for (int i=0; i < hash.length ; i++) {
				for ( int j=0; j<hash[i].length; j++) {
					System.out.print(hash[i][j] + " | ");
				}
				System.out.println();
			}
			
			//check if there is a winner
			
			
		}
		
		input.close();

	}

}
