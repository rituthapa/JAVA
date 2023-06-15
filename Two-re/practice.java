package Two;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //multidimensional array
		int digits[][][]= {
				{{1,2,3},{11,22,33},{44,55,66}}
		};
		for (int[][] i:digits) {
			for (int[]j:i) {
				for (int k:j) {
					System.out.println(k);
				}
			}
		}
		

		// create a object/memory/instance/ (it will have same properties and method as
		// the class)
		
		//where there's no constructor, it'll print the hard-coded value from the defined class even if you create new object
		PersonB amol = new PersonB();
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.age);

		PersonB sumit = new PersonB();
		System.out.println(sumit.firstName);
		System.out.println(sumit.lastName);
		System.out.println(sumit.age);
		
		//when you update the value and then print; then prints updated value, not before that

		amol.age = 34;
		amol.firstName = "amol";
		amol.lastName = "rao";
	
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.age);

		Vehicle car1 = new Vehicle("white", "toyota", "camry");
		System.out.println(car1.color);
		System.out.println(car1.make);
		System.out.println(car1.model);

		car1.displayColor();
		car1.displayname();
		
		

		PersonA ritu = new PersonA("ritu", "thapa", 28);
		System.out.println(ritu.age);
		ritu.displayFullname(); //for method, you can just call the method here
		
		
		
		
		
	}
}

//user-defined data type is called class (always Uppercase)

class Vehicle { // creating class
	String color; // defining properties for that class
	String make;
	String model;

	// creating constructor (use same as classname)

	public Vehicle(String clr, String mke, String mdl) { // constructor with parameters
		this.color = clr; // this for now to refer to the object that will be created in main method which
							// will have same properties & method as the whole type/class
		this.make = mke; // so, this.properties= name used in parameter to pass the value
		this.model = mdl;
	}

	public void displayColor() { // creating a method; method is the activity performed on the properties
		System.out.println(this.color); // now inside main method, we can just call the method
	}

	public void displayname() { // we create the method to call it directly in main method and not having to
								// repeat function (here sysouting) everytime for everything in main method
		System.out.println(this.make + " " + this.model);
	}
}
//class without constructor

class PersonB {
	// Properties
	String firstName = "chinmay";
	String lastName = "deshpande";
	int age =32;
	// Method
	public void fullName() {
		System.out.println(this.firstName + this.lastName);
	}

}

//with constructor


class PersonA {
	String firstname;
	String lastname;
	int age;

	public PersonA(String fn, String ln, int age) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = age;
	}

	public void displayFullname() {
		System.out.println(this.firstname + this.lastname);
	}

}
