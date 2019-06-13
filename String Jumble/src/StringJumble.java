
public class StringJumble {
	int max = 10;
    int min = 1;
	double x = (Math.random()*((max-min)+1))+min;
	int rando = (int) x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJumble name = new StringJumble();
		
		System.out.println(name.rando);
	}

}
