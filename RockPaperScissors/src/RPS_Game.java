import java.util.Scanner;
public class RPS_Game {
	static int tie = 0;
	static int win = 0;
	static int loss = 0;
public static String game () {
	 
	 System.out.println( "Player Turn. Enter number for corresponding action. " );
	 System.out.println( " 1(ROCK) "+ " 2(PAPER) "+ " 3(SCISSORS) " );
	 Scanner myObj = new Scanner(System.in);
	 String input = myObj.nextLine();

	 int max = 3;
	 int min = 1;
	 double x = (Math.random()*((max-min)+1))+min;
	 int rando = (int) x;
	 if (input.equals( "1" )) {
		System.out.println("You Chose Rock!");
		if(rando == 1 ) {
			tie++;
		return ("CPU Chose Rock. \n You Tied.");
		}
		else if(rando == 2) {
			loss++;
			return ("CPU Chose Paper. \n You Lost.");
		}
		else win++; 
			return ("CPU Chose Scissors. \n You Won");
	 }
	 else if (input.equals( "2" )) {
		System.out.println("You Chose Paper!");
		if(rando == 1 ) {
			win++;
		return ("CPU Chose Rock. \n You Won.");
		}
		else if(rando == 2) {
			tie++;
			return ("CPU Chose Paper. \n You Tied.");
		}
		else loss++;
		return ("CPU Chose Scissors. \n You Lost");
	 
	 }
	 else   {
			System.out.println("You Chose Scissors!");
			if(rando == 1 ) {
				loss++;
			return ("CPU Chose Rock. \n You Lost.");
			}
			else if(rando == 2) {
				win++;
				return ("CPU Chose Paper. \n You Won.");
			}
			else tie++;
			return ("CPU Chose Scissors. \n You Tied");
		 
		 }
	

}

public static String[] bestOfThree() {
	String[] wins = new String[5];
	for(int i=0; i<5; i++) {
		
	String games= game();
	System.out.println(games);
	wins[i]=games;
	}
	
	return wins;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(game());
		
		String[] plays = bestOfThree();
		System.out.println(" \n"+ plays[0]+ " \n" + plays[1] + " \n" + plays[2]);
		System.out.println("Wins: "+win);
		System.out.println("Losses: "+loss);
		System.out.println("Ties: "+tie);
		
	}
}