package Two;

public class day19B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CanaraBank cb= new CanaraBank();
		cb.homeLoanRepo();
		cb.plotLoanRepo();
		cb.loan(9);
		cb.save(8);
		cb.discount(7);
	}

}
//multiple interface rules can be implemented in a single class

interface WorldbankRulesx{
	public void loan(int x);
	public void save(int y);
	public void discount(int z);
}
interface RBI{
	public void homeLoanRepo();
	public void plotLoanRepo();
}
class CanaraBank implements WorldbankRulesx, RBI{

	public void homeLoanRepo() {
	System.out.println("CanaraB homeloanRepo");
		
	}
	public void plotLoanRepo() {
		System.out.println("CanaraB plotloanRepo");
	}
	public void loan(int x) {
		System.out.println("Canara loan" + x);
	}

	@Override
	public void save(int y) {
		System.out.println("Canara save" + y);
	}

	@Override
	public void discount(int z) {
		System.out.println("Canara discount" + z);
	}
	
}