package javaPractice1;

public class Oops02bOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WorldBank wb= new WorldBank(20000,"fortworth");
wb.loan(5);
wb.save(7);
Chase bank1= new Chase(10000,"dallas","euless");
bank1.displaybranch();
bank1.loan(6);
bank1.save(8);
	}

}

//overriding: same methodname, same parameters, different class (connected by inheritance); overriding means to overide the given methodbody by parent class and writing their own methodBody
class WorldBank{
	int balance;
	String city;
	public WorldBank(int bal, String ct) {
		this.balance=bal;
		this.city=ct;
	}
	public void loan(int x) {
		System.out.println("the WBloan rate is "+x);
	}
	public void save(int y) {
		System.out.println("the WBsave rate is "+y);
	}
}
class Chase extends WorldBank{
	String branch;
	public Chase(int bal, String ct, String br) {
		super(bal, ct);
		this.branch=br;
	}
public void displaybranch() {
	System.out.println("our branch is in Euless");
}
public void loan(int x) { //if put 6
	System.out.println("the loan rate for Chasebank is "+x);
	super.loan(9);
	super.loan(x); //6 value with method body of WB //will output x value called on thisclass's method; ie; whatever x value put for Chase class(not WorldBank class's x value)
}
public void save(int y) {
	System.out.println("the save rate for Chasebank is "+y);
	super.save(this.balance-y);
}
	
}