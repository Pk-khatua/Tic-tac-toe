package Board;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Board {
		public static List<String> BoardPositions = Arrays.asList("11","12","13","21","22","23","31","32","33");
	public static List<List<String>> winPosibilities()
	{
		List<List<String>> winPosibilities = new ArrayList<>();
		winPosibilities.add(Arrays.asList("11","12","13"));
		winPosibilities.add(Arrays.asList("21","22","23"));
		winPosibilities.add(Arrays.asList("31","32","33"));
		winPosibilities.add(Arrays.asList("11","21","31"));
		winPosibilities.add(Arrays.asList("12","22","32"));
		winPosibilities.add(Arrays.asList("13","23","33"));
		winPosibilities.add(Arrays.asList("11","22","33"));
		winPosibilities.add(Arrays.asList("13","22","31"));
		return winPosibilities;	
	}
	public static void printBoard(List<String> p1Positions,List<String> p2Positions){	
		System.out.println("------------Board---------------");
		for (int i=0;i<BoardPositions.size();i++)
		{
			if(p1Positions.contains(BoardPositions.get(i)))
				System.out.print(" X ");
			else if(p2Positions.contains(BoardPositions.get(i)))
				System.out.print(" O ");
			else
				System.out.print(BoardPositions.get(i)+" ");
			if((i+1)%3==0) 
				System.out.println();
		}
		System.out.println("--------------------------------");
	}
}
