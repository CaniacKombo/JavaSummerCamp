import java.util.Scanner;

public class PokemonBattle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon firstPokemon = new Pokemon(" Typhlosion ", 1600, " Fire " , " Healthy " , "Scratch" , "Bite" , "Fire Blast", 300 , 375 , 450);
		 Pokemon secondPokemon = new Pokemon(" Snorlax ", 1300, " Normal " , " Healthy " , "Body Slam" , "Sleep" , "Swallow", 500 , 100 , 200);
		 System.out.println (firstPokemon.name + firstPokemon.health + firstPokemon.type + firstPokemon.status );
		 System.out.println (secondPokemon.name + secondPokemon.health + secondPokemon.type + secondPokemon.status );
		 Scanner myObj = new Scanner(System.in);
		
		 
		 System.out.println( "P1 Turn. Enter number for corresponding attack! " );
		 System.out.println( " 1(" + firstPokemon.pAttack1 +")"+ " 2(" + firstPokemon.pAttack2 +")"+ " 3(" + firstPokemon.pAttack3 +")" );
		 String battleCommand = myObj.nextLine();
		 System.out.println (battleCommand);
		 if (battleCommand.charAt(0) == '1') {
			 System.out.println (firstPokemon.pAttack1);
		 }
		 else if (battleCommand.charAt(0) == '2') {
			 System.out.println (firstPokemon.pAttack2);
		 }
		 else if (battleCommand.charAt(0) == '3') {
			 System.out.println (firstPokemon.pAttack3);
		 }
		 else {
			 System.out.println("Please enter the correct number.");
		 }
	}

}
