package game;
import java.util.Scanner;

import Board.Board;
import Player.Player;

public class GAme {

	
	public static void game(Player p1,Player p2)
	{
		while(true)
		{
			Board.printBoard(p1.pickedPosition, p2.pickedPosition);
			p1.winStatus = p1.play(p2);
			if(p1.winStatus) {
				Board.printBoard(p1.pickedPosition, p2.pickedPosition);
				System.out.println(p1.pName+" WON the MATCH");
				break;
			}
			Board.printBoard(p1.pickedPosition, p2.pickedPosition);
			p2.winStatus =p2.play(p1);
			if(p2.winStatus) {
				Board.printBoard(p1.pickedPosition, p2.pickedPosition);
				System.out.println(p2.pName+" WON the MATCH");
				break;
			}
			if(p2.pickedPosition.size()==4)
			{
				Board.printBoard(p1.pickedPosition, p2.pickedPosition);
				System.out.println("match draw");
				break;
			}
		}

	}
	public static void main(String[] args) {

		System.out.println("*******************************************************************");
		System.out.println("*********************** #  TIC-TAC-TOE  # *************************");
		System.out.println("*******************************************************************");
		Scanner sc= new Scanner(System.in);
		System.out.println("\nenter player one name");
		Player p1 = new Player(sc.next());
		System.out.println("\nenter player two name");
		Player p2 = new Player(sc.next());
		System.out.println("\n"+p1.pName+" is your Icon is: "+ "X");
		System.out.println("\n"+p2.pName+" is your Icon is: "+ "O");
		game(p1, p2);
		sc.close();
	}
}
