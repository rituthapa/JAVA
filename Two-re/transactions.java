package Two;

public class transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ban1 coamerica = new Ban1(70000, 104070, "rituthapa", "current");
		coamerica.deposit(1000);
		int transac[] = { 10000, 20000, 30000, 40000, 5000 }; //??
		coamerica.displaytransactions(10000); //0 ???
	}

}		

class Ban1 {
	int bal;
	int accNo;
	String accName;
	String accType;
	String country;
	int[] transactions;
	private int amount;

	public Ban1(int bal, int accNo, String accName, String accType) {
		this.bal = bal;
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.country = "USA";
		this.transactions = new int[5];
	}

	public int deposit(int amount) {
		this.bal = this.bal + amount;
		System.out.println("Deposit successful");
		return this.bal;
	}

	public int withdraw(int amount) {
		if (this.bal > amount) {
			this.bal = this.bal - amount;
			return this.bal;
		} else {
			System.out.println("insufficient Balance");
			return this.bal;
		}
	}

	//??????????????????????????
	public int displaytransactions(int amount) {
		for (int i = 0; i < 5; i++) {
			// if (amount==deposit || amount==withdraw) {
			System.out.println(this.transactions[i]);
			return this.transactions[i];
			// }
		}
		return this.amount;
	//??????????????????????????	
	}

}