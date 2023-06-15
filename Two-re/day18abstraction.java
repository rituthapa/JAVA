package Two;

public class day18abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBIx sb= new SBIx("dallas","USA",76005);
		sb.loan(12);
		sb.save(15);
		sb.displaycountry();
		
		Canara ca= new Canara("austin","USA",76040);
		ca.loan(10);
		ca.save(8);
	}

}
abstract class WorldBankX{
	String city;
	String country;
	
	public WorldBankX(String cty, String cntry) {
		this.city=cty;
		this.country=cntry;
	}
	abstract public void loan(int x);
	abstract public void save(int y);
	
	public void displaycountry() {
		System.out.println("USA");
	}
}
class SBIx extends WorldBankX{
int pincode;
	public SBIx(String cty, String cntry, int pn) {
		super(cty, cntry);
		this.pincode=pn;
	}
	public void loan(int x) {
		System.out.println("SBI loan is "+x);
		//Error: super.loan(99); this is NOT Possible because cant invoke abstract method for worldbank class
	}
	public void save(int y) {
		System.out.println("SBI save is "+y);
	}
}
class Canara extends WorldBankX{
	int pincode;
	public Canara(String cty, String cntry, int pn) {
		super(cty, cntry);
		this.pincode=pn;
	}
	public void loan(int x) {
		System.out.println("Canara loan is "+x);
	}

	@Override
	public void save(int y) {
		System.out.println("Canara save is "+y);
	}
}
//worldbank by giving abstract method is Hiding their own body of the method and wants every class to implement the method with their own body: 
//for any number of extended class(example : SBI or Canara or PBI), it's mandatory that every class has to define body to all abstract(unimplemented) methods
//can't define for one abstract method only (like define one method in one child class and another method in another class is not possible; that doesnt make sense too)