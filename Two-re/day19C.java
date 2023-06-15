package Two;

public class day19C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIz z = new SBIz("delhi", 123, "malvinagar");
//you can call 3 properties(2 from parent class) and 6 methods(5 from two interfaces and 1 from parent class)

		System.out.println(z.city);
		System.out.println(z.pincode);
		System.out.println(z.branchname);

		z.loan(1);
		z.save(2);
		z.discount(3);
		z.homeLoanRepo();
		z.plotLoanRepo();
		z.displayCityname();
	}

}

interface WorldbankRules2 {
	public void loan(int x);

	public void save(int y);

	public void discount(int z);
}

interface RBIrules2 {
	public void homeLoanRepo();

	public void plotLoanRepo();
}

class SBIy {
	String city;
	int pincode;

	public SBIy(String ct, int pn) {
		this.city = ct;
		this.pincode = pn;
	}

	public void displayCityname() {
		System.out.println("Delhi");
	}
}

class SBIz extends SBIy implements WorldbankRules2, RBIrules2 {
	String branchname;

	public SBIz(String ct, int pn, String br) {
		super(ct, pn);
		this.branchname = br;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void homeLoanRepo() {
		System.out.println("SBIz homeloanrepo");
		// TODO Auto-generated method stub

	}

	@Override
	public void plotLoanRepo() {
		System.out.println("SBIz plotloanrepo");
		// TODO Auto-generated method stub

	}

	@Override
	public void loan(int x) {
		System.out.println("SBIz loan" + x);
		// TODO Auto-generated method stub

	}

	@Override
	public void save(int y) {
		System.out.println("SBIz save" + y);
		// TODO Auto-generated method stub

	}

	@Override
	public void discount(int z) {
		System.out.println("SBIz discount" + z);
		// TODO Auto-generated method stub

	}

}