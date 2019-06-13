
public class StringJumble {
	static String word ;
	static int max  ;
    static int min ;
	static double x ;
	static int rando1;
	static int rando2;
	static int rando3;
	static String result ;
	public static String Jumble(String word) {
		int max = word.length() - 1 ;
	    int min = 0;
		double x = (Math.random()*((max-min)+1))+min;
		double y = (Math.random()*((max-min)+1))+min;
		double z = (Math.random()*((max-min)+1))+min;
		rando1 = (int) x;
		rando2 = (int) y;
		rando3 = (int) z;
		StringJumble name = new StringJumble();
		int random1 = name.rando1;
		int random2 = name.rando2;
		int random3 = name.rando3;
		result  = word.substring(random1) + word.substring(random2) + word.substring(random3);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Jumble("apple"));
	}

}
