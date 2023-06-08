package javaPractice1;

public class Oops03Abstraction {
       
	public static void main(String[] args) {
	
	Chasee bank1 = new Chasee(20000, "dallas", "euless");
	bank1.displayBranch();
	bank1.loan(6);
	bank1.save(5);
	bank1.displayCity();

	BOA bank2 = new BOA (40000,"dallas", "arlington");
	bank2.loan(4);
	bank2.save(3);
	bank2.displayBranch();
	bank2.displayCity();
  }
}

//Abstraction:
//to enforce rules and to be implemented by inherited classes in their own way
//hide their methodbody; only gives methodname parameters and its mandatory that extended class has to give their own methodbody
//you CANNOT create Object from an abstract class 
//abstract class constructor and methods  and properties are accessible only through the extended class
//if something is common across all classes, you can write regular methods too inside abstract class and call it via extended class

abstract class WorldBankk{
	int acc;
	String city;
	public WorldBankk(int acc,String cty) {
		this.acc=acc;
		this.city=cty;
	}
	abstract public void loan(int x) ;
	abstract public void save(int y);
	
	public void displayCity() {
		System.out.println("WorldBank located in Dallas");
	}
}
class Chasee extends WorldBankk{
	String branch;
	public Chasee(int bal, String ct, String br) {
		super(bal, ct);
		this.branch=br;
	}
	public void loan(int x) {
		System.out.println(this.acc + " loanrate for chase is "+ x);
	}
	public void save(int y) {
		System.out.println(this.acc + " save rate for chase is " + y);
	}
	public void displayBranch() {
		System.out.println("chase whose branch is in "+ this.branch);
	}
	
}
class BOA extends WorldBankk{
	
	String branch;
	public BOA(int bal, String ct, String br) {
		super(bal, ct);
		this.branch=br;
	}
	public void loan(int x) {
		System.out.println("loanrate for BOA is "+ x);
	}
	public void save(int y) {
		System.out.println("saverate for BOA is " + y);
	}
	public void displayBranch() {
		System.out.println("BOA whose branch is in "+ this.branch);
	}
}