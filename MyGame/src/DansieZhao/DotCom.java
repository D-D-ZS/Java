package DansieZhao;

import java.util.ArrayList;

public class DotCom {

	int numOfHit = 0;
	int[] dotComCell;
	
	//判断用户是否击中DotCom
	public String checkYourself(String userGuess){
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		
		for (int cell : dotComCell ){
			if (guess == cell){
				numOfHit++;
				result = "hit";
				break;
			}
		}
		
		if (numOfHit == dotComCell.length){
			result = "kill";
		}
		
		System.out.println(result);
		return result;	
	}
	
//	设置DotCom的位置
	public int[] setLocationCells(int[] loc){
		if (loc == null){
			int randomNum = (int)(Math.random()*5);
			dotComCell = new int[]{randomNum,randomNum+1,randomNum+2};
		}
		else {
			dotComCell = loc;
		}
		return dotComCell;
	}
	
}
