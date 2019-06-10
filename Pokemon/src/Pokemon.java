

public class Pokemon {
	String name ;
	int health ;
	String type ;
	String status ;
	
	public Pokemon() {
		name = "";
		health = 0;
		type = "";
		status = "";
	}
	
	Pokemon (String name, int health, String type, String status){
		this.name = name;
		this.health = health;
		this.type = type;
		this.status = status;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	 Pokemon firstPokemon = new Pokemon(" Typhlosion ", 160, " Fire " , " Healthy " );
	 Pokemon secondPokemon = new Pokemon(" Snorlax ", 130, " Normal " , " Healthy " );
	 System.out.println (firstPokemon.name + firstPokemon.health + firstPokemon.type + firstPokemon.status );
	 System.out.println (secondPokemon.name + secondPokemon.health + secondPokemon.type + secondPokemon.status );
	}

}
