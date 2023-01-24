package Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Board.Board;


public class Player {
	public String pName;
	public boolean winStatus= false;
	public Player(String pName)
	{
		this.pName= pName;
	}	
	public List<String> pickedPosition=new ArrayList<>();

	public boolean play(Player otherPlayer)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(this.pName+" pic your position");
		String pic = sc.next();
		while (this.pickedPosition.contains(pic)||otherPlayer.pickedPosition.contains(pic)
				|| !Board.BoardPositions.contains(pic)) {
			System.out.println("Wrong Picking...pic Again");
			pic = sc.next();
		}
		this.pickedPosition.add(pic);
		if(this.pickedPosition.size()>=3)
			if(isWin()) 
				return true;
			else
				return false;
		else
			return false;
	}
	public boolean isWin()
	{
		List<List<String>> winPosibilities = Board.winPosibilities();
		for(List<String> oneOfPosibilities : winPosibilities)
		{
			if(this.pickedPosition.containsAll(oneOfPosibilities))
				return true;
		}
		return false;
	}
	
}
