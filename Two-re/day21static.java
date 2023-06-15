package Two;

public class day21static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(Math.PI);
		System.out.println(Math.abs(-90.90)); //(abs gives absolute value without negetive sign)
		System.out.println(Math.abs(90));
		System.out.println(Math.abs(90.00));
		//in above scenario, Math is a java class and PI propety gives pi=3.14...
		//also abs is method for absolute value ie, no negetive value as output
		
		
		
		//how to call methods and properties without creating object
		//we do it by calling it in class level which is possible using static keyword
		//we do this if something we want same or constant or common across the whole class
		
		//calling static property country on class level(not by creating objects)
			System.out.println(Studente.country);	
			
			//calling the static method on class level without the reference variable(ie, not creating object)
		Studente.displayCountry();
		
	}

}

class Studente{
	String fullname;
	int age;
	static String country="USA"; // this static property u don't have to define in constructor
		public Studente(String fullname, int age) {
		this.fullname=fullname;
		this.age=age;
		}
	//basic method
	public void displayName() {
		System.out.println(this.fullname);
	}
	//static method
	//if a property defined is a common/constant info across the class for any object; use keyword static
	//if static keyword used on such scenario, you can create static method for it and call the method on class level
	//that means instead of creating object in main method and calling the common property/method on reference(this), you call it on class, so class.methodname()
	
	public static void displayCountry() {
	System.out.println(Studente.country);
	}
}
