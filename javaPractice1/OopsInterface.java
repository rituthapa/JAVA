package javaPractice1;

public class OopsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
XYZ banking = new XYZ("Dallas","USA",76005);
banking.displaycountry();
banking.zzzz();
banking.loan(3);
banking.save(4);
banking.homeloanRepo(5);
banking.homesaveRepo(6);
banking.interfaceBankName();
banking.interface2Name();
banking.whatAmi();

//here in above actions, banking instance of XYZ class have total of 9 methods to access; 3 from 1st interface(2 abstract,1 regular); 3 from 2nd(2 abstract,1 regular);2 from abstract class(1 abstract,1 regular), and 1 is its own method
	}

}

//interface: it's work is to impose rules,
//like abstraction class, you can't create object of interface 
//will give you methods and parameters; and it's mandatory you have to write body for it;
//you can implement more than one interfaces; unlike class where you cannot extend multiple classes(ie; you dont have multiple parent for child class), 
//you Extend a class(be it is abstract or regular class); but you Implement an Interface
//in abstract class, you write abstract keyword infront of umimplemented methods but it's opposite in interface; writing abstract infront is optional for unimplemented methods; but it's mandatory to use default keyword for reg methods here
//one interface can extend another one or more interface //eg at Java/Two/day20C
//example of interface //ITestListeners in TestNG
interface WorldBankRules{
	public void loan(int x);
	public void save(int y);
	default public void interfaceBankName() {
		System.out.println("Rules from WorldBank");
	}
} 
interface HomeLoanRules{
	public void homeloanRepo(int x);
	public void homesaveRepo(int y);
	default public void interface2Name() {
		System.out.println("Rules from HomeLoanCompany");
	}
}
abstract class ABCBank {
	String city;
	String country;
	public ABCBank(String ct,String cntry) {
		this.city=ct;
		this.country=cntry;
	}
	abstract public void zzzz();
	
	public void displaycountry() {
		System.out.println("USA");
	}
}
class XYZ extends ABCBank implements WorldBankRules, HomeLoanRules{
int pincode;
	public XYZ(String ct, String cntry, int pn) {
		super(ct, cntry);
		this.pincode=pn;
	}

	@Override
	public void homeloanRepo(int x) {
		System.out.println("home loan interest is " + x);
		
	}

	@Override
	public void homesaveRepo(int y) {
		// TODO Auto-generated method stub
		System.out.println("home save interest is "+ y);
	}

	@Override
	public void loan(int x) {
		// TODO Auto-generated method stub
		System.out.println("loan interest is " + x);
	}

	@Override
	public void save(int y) {
		// TODO Auto-generated method stub
		System.out.println("save interest is "+y);
	}

	@Override
	public void zzzz() {
		// TODO Auto-generated method stub
		System.out.println("XYZ uses zzz from ABCbank");
	}
	public void whatAmi() {
		System.out.println("I am XYZ bank");
	}
}