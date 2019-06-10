
public class AccessTest {
	
	Person firstPerson = new Person();
	Person secondPerson = new Person("Neal" , 15 , 72 , 110 , "Indian" , "12/5/2003");
	System.out.println (firstPerson.age);	
	System.out.println (secondPerson.age);
	System.out.println (secondPerson.Speak("how you doing"));
	System.out.println (firstPerson.Speak());
	System.out.println (secondPerson.Speak());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
