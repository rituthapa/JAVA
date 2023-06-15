package Two;

public class day17abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s=new SBI();
		s.loan();
		s.save();
		s.displayCountryname();
		s.Branchname();

		StudentX rits= new StudentX("ritu","thapa",28);
		rits.displayName();
		rits.displayCity();
	}

}

//Abstract class : can have abstract methods that has same method name and signature but no body because the class wants to hide their rules
//and can also have regular methods with body that's common to access across all classes that inherits
// in abstraction methods, rules are enforced but implemented differently in different class
abstract class WorldbankA{
	abstract public void loan();
	abstract public void save();
	
	public void displayCountryname() {
		System.out.println("USA");
		
		//you cannot create object from abstract class
	}
}
class SBI extends WorldbankA{

	public void loan() {
		System.out.println("SBI loan method");	
	}
	public void save() {
		System.out.println("SBI save method");
	}
	
	public void Branchname() {
		System.out.println("SBI branch");
	}
}

//you can also have a constructor in abstract class but can be only called through inherited class
//abstract class with constructor 
abstract class Information{
	String firstname;
	String lastname;
	
	public Information(String fn, String ln) {
		this.firstname=fn;
		this.lastname=ln;
	}
	abstract public void displayName();
	
	}

class StudentX extends Information{
int rollNo;
	public StudentX(String fn, String ln, int rn) {
		super(fn, ln);
		this.rollNo=rn;
	}
	public void displayName() { //giving body to abstract method from abstract class Information
	System.out.println(this.firstname + " " + this.lastname);
	}
	public void displayCity() { //own method of studentX class
		System.out.println("Dallas");
	}

	
	
}