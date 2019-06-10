
public class Person {
String name;
private int age;
private int height;
private double weight;
private String nationality;
private String birthday;


public Person() {
	name = "";
	age = 0;
	height = 0;
	weight = 0;
	nationality = "";
	birthday = "";
			
}
	
	Person(String name, int age, int height,double weight, String nationality, String birthday) {
		this.name = name; 
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.nationality = nationality;
		this.birthday = birthday;


	}
	
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	String speak() {
		return "Hello, bruh, my name is " + this.name;
	} 
	
	String speak(String phrase) {
		return "Hello, " + phrase + ", my name is " + name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person firstPerson = new Person();
		Person secondPerson = new Person("Neal" , 15 , 72 , 110 , "Indian" , "12/5/2003");
		System.out.println (firstPerson.getAge());	
		System.out.println (secondPerson.age);
		System.out.println (secondPerson.speak("how you doing"));
		
		System.out.println (firstPerson.speak());
		System.out.println (secondPerson.speak());
	}

}
