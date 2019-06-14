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
			System.out.println("CPU Chose Rock.");
			return ("You Tied.");
		}
		else if(rando == 2) {
			loss++;
			System.out.println("CPU Chose Paper.");
			return ("You Lost.");
		}
		else win++; 
		System.out.println("CPU Chose Scissors.");
			return ("You Won");
	 }
	 else if (input.equals( "2" )) {
		System.out.println("You Chose Paper!");
		if(rando == 1 ) {
			win++;
			System.out.println("CPU Chose Rock.");
		return ("You Won.");
		}
		else if(rando == 2) {
			tie++;
			System.out.println("CPU Chose Paper.");
			return ("You Tied.");
		}
		else loss++;
		System.out.println("CPU Chose Scissors.");
		return ("You Lost");
	 
	 }
	 else   {
			System.out.println("You Chose Scissors!");
			if(rando == 1 ) {
				loss++;
				System.out.println("CPU Chose Rock.");
			return ("You Lost.");
			}
			else if(rando == 2) {
				win++;
				System.out.println("CPU Chose Paper.");
				return ("You Won.");
			}
			else tie++;
			System.out.println("CPU Chose Scissors.");
			return ("You Tied");
		 
		 }
	

}

public static String[] bestOfThree() {
	String[] wins = new String[25];
	for(int i=0; i<25; i++) {
		
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
		System.out.println( "Game Results.");
		for(int i = 0 + 1; i < plays.length +1 ; i++ ) {
		System.out.println( "["+ i +"] " + plays[i -1]);
		}
		System.out.println("Wins: "+win);
		System.out.println("Losses: "+loss);
		System.out.println("Ties: "+tie);
		
	}
}