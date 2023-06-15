package Two;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OOPs concept (inheritance,polymorphism,abstraction,encapsulation)
		//encapsulation: it is nothing but defining a class itself
		
		//inheritance: reference variable on child class have access to all the properties and methods of all parents too (not just itself)
		GrandFather ratna= new GrandFather ("ratna","thapa");
		System.out.println(ratna.firstname);
		System.out.println(ratna.lastname);
		ratna.displayGname();

		Father lok = new Father ("ratna","thapa","lok");
		System.out.println(lok.fFirstname);
		System.out.println(lok.firstname);
		System.out.println(lok.lastname);
		
		lok.displayFname();
		lok.displayGname();
		
		Son kushal= new Son("ratna","thapa","lok","kushal");
		System.out.println(kushal.firstname);
		System.out.println(kushal.lastname);
		System.out.println(kushal.fFirstname);
		System.out.println(kushal.sfirstname);
		kushal.displaySname();
		kushal.displayFname();
		kushal.displayGname();
		
	}

}

class GrandFather{
	String firstname;
	String lastname;
	public GrandFather(String fn, String ln) {
		this.firstname=fn;
		this.lastname=ln;
	}
	public void displayGname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Father extends GrandFather{
	String fFirstname;
	public Father(String fn, String ln, String ffn) {
		super(fn,ln); //directing to (or calling the) parent constructor
		this.fFirstname=ffn; 
	}
	void displayFname() {
		System.out.println(this.fFirstname + this.lastname);
	}
}
class Son extends Father{
	String sfirstname;
	public Son(String fn, String ln, String ffn, String sfn) {
		super(fn,ln, ffn); //the order of the value should be same as in the parent constructor or else it will print output in the order we write
		//super (ffn, fn, ln); will give result for three methods in line 26,27,28 as kushalratna, thaparatna, lokratna
		this.sfirstname=sfn;
	}
	void displaySname(){
		System.out.println(this.sfirstname + this.lastname);
	}
	}

