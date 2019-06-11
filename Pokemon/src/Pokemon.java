

public class Pokemon {
	String name ;
	int health ;
	String type ;
	String status ;
	String pAttack1;
	String pAttack2;
	String pAttack3;
	int pAttack1Damage;
	int pAttack2Damage;
	int pAttack3Damage;
	
	public Pokemon() {
		name = "";
		health = 0;
		type = "";
		status = "";
		pAttack1 = "";
		pAttack2 = "";
		pAttack3 = "";
		pAttack1Damage = 0;
		pAttack2Damage = 0;
		pAttack3Damage = 0;
		
	}
	
	Pokemon (String name, int health, String type, String status, String pAttack1 , String pAttack2 , String pAttack3, int pAttack1Damage, int pAttack2Damage, int pAttack3Damage ){
		this.name = name;
		this.health = health;
		this.type = type;
		this.status = status;
		this.pAttack1 = pAttack1;
		this.pAttack2 = pAttack2;
		this.pAttack3 = pAttack3;
		this.pAttack1Damage = pAttack1Damage;
		this.pAttack2Damage = pAttack2Damage;
		this.pAttack3Damage = pAttack3Damage;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
//	 Pokemon firstPokemon = new Pokemon(" Typhlosion ", 1600, " Fire " , " Healthy " , "Scratch" , "Bite" , "Fier Blast");
//	 Pokemon secondPokemon = new Pokemon(" Snorlax ", 1300, " Normal " , " Healthy " , "Body Slam" , "Sleep" , "Swallow");
//	 System.out.println (firstPokemon.name + firstPokemon.health + firstPokemon.type + firstPokemon.status );
//	 System.out.println (secondPokemon.name + secondPokemon.health + secondPokemon.type + secondPokemon.status );
	}

}
