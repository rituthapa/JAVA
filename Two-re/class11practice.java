package Two;

public class class11practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 objects in array
		Vehicle1 cars[] = {
				new Vehicle1("red","honda","crv"),
				new Vehicle1("black","toyota","corola"),
				new Vehicle1("blue","nissan","rogue")
				}; 
	for (int i=0; i<cars.length; i++) {
		System.out.println(cars[i].color);
		System.out.println(cars[i].make);
		System.out.println(cars[i].model);
	}
	
	for (Vehicle1 j:cars) {
		j.displaycardetails();
		System.out.println(j.color);
	}
	
	PersonX ritu = new PersonX("ritu", "thapa", 28);
	PersonX sanjok = new PersonX("sanjok", "kunwar", 32);
	PersonX evansh = new PersonX("evansh", "kunwar", 1);
	
	ritu.lastname="kunwar";
	
	PersonX [] family= {ritu,sanjok,evansh};
	for (PersonX i:family) {
		i.fullname();
		System.out.println(i.firstname);
		System.out.println(i.lastname);
		System.out.println(i.age);
	}
	}

}

class Vehicle1 {
	String color;
	String make;
	String model;
	
	public Vehicle1(String clr, String make, String mdl) {
		this.color= clr;
		this.make= make;
		this.model= mdl;
	}
	public void displaycardetails() {
		System.out.println(this.color + this.make + this.model);
	}
}
	
class PersonX{
	String firstname;
	String lastname;
	int age;
	public PersonX(String fn,String ln, int age) {
		this.firstname=fn;
		this.lastname=ln;
		this.age=age;
	}
	public void fullname() {
		System.out.println(this.firstname+this.lastname);
	}
}