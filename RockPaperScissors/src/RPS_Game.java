import java.util.Scanner;
public class RPS_Game {
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
		return ("CPU Chose Rock. \n You Tied.");
		}
		else if(rando == 2) {
			return ("CPU Chose Paper. \n You Lost.");
		}
		else return ("CPU Chose Scissors. \n You Won");
	 }
	 else if (input.equals( "2" )) {
		System.out.println("You Chose Paper!");
		if(rando == 1 ) {
		
		return ("CPU Chose Rock. \n You Won.");
		}
		else if(rando == 2) {
			return ("CPU Chose Paper. \n You Tied.");
		}
		else return ("CPU Chose Scissors. \n You Lost");
	 
	 }
	 else   {
			System.out.println("You Chose Scissors!");
			if(rando == 1 ) {
			return ("CPU Chose Rock. \n You Lost.");
			}
			else if(rando == 2) {
				return ("CPU Chose Paper. \n You Won.");
			}
			else return ("CPU Chose Scissors. \n You Tied");
		 
		 }

}

public static String[] bestOfThree() {
	String[] wins = new String[3];
	for(int i=0; i<3; i++) {
		
	String games= game();
	System.out.println(games);
	wins[i]=games;
	}
	
	return wins;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(game());
		System.out.println(bestOfThree());
	}
}