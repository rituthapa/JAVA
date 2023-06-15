package Two;

public class class11part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank chase = new Bank(4000, 102030, "rituthapa", "saving");
		int newbal1 = chase.deposit(7000);
		System.out.println(newbal1);
		int newbal2 = chase.withdraw(1000);
		System.out.println(newbal2);
		chase.interestmsg();

		Bank coamerica = new Bank(70000, 104070, "rituthapa", "current");
		int updatedBal1 = coamerica.deposit(15000);
		System.out.println(updatedBal1);
		int updatedBal2 = coamerica.withdraw(75000);
		System.out.println(updatedBal2);
		// System.out.println(coamerica.withdraw(5000));
		int updatedBal3 = coamerica.withdraw(5000);
		System.out.println(updatedBal3);
		int updatedBal4 = coamerica.deposit(40000);
		System.out.println(updatedBal4);
		int updatedBal5 = coamerica.withdraw(15000);
		System.out.println(updatedBal5);
		coamerica.interestmsg();

		int[] transactions = { updatedBal1, updatedBal2, updatedBal3, updatedBal4, updatedBal5 };
		for (int i = 0; i < 5; i++) {
			System.out.println(transactions[i]);
		}
	}

}

class Bank {
	int bal;
	int accNo;
	String accName;
	String accType;
	String country;
	int[] transactions;

	public Bank(int bal, int accNo, String accName, String accType) {
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

	public void interestmsg() {
		if (this.accType == "saving") {
			int interest = (5 * bal) / 100;
			// this.bal=this.bal+interest;
			System.out.println("Account have 5% interest with current interest of " + interest);
		} else if (this.accType == "current") {
			// interest= (10*bal)/100;
			System.out.println("10% interest");
		} else {
			System.out.println("Account not eligible for interest");
		}
	}

//	public int[] transactions(int amount) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(this.transactions[i]);
//			return this.transactions;
//		}
//	}
}
