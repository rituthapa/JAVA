package Two;

public class day20interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r= new Rectangle();
		r.getarea(10,11);
		
		Zorba payment= new Zorba();
		payment.deposit();
		payment.withdrawal();
		payment.saving();
		payment.UPI();
	}

}
interface Polygon{
	public void getarea(int length, int breadth);
}
class Rectangle implements Polygon{
	//int breadth;
	//int length;
	

	public void getarea(int length, int breadth) {
		System.out.println("The area of rectangle is " + (length*breadth));
		
	}
	
}

interface creditcard{
	public void withdrawal();
	public void deposit();
}
interface debitcard{
	public void saving();
}
interface walletpay{
	public void UPI();
}
class Zorba implements creditcard,debitcard,walletpay{

	@Override
	public void UPI() {
		System.out.println("UPI added from wallet");
		
	}

	@Override
	public void saving() {
		System.out.println("saving interest");
		
	}

	@Override
	public void withdrawal() {
		System.out.println("ways to withdraw");
		
	}

	@Override
	public void deposit() {
		System.out.println("ways to deposit");
	}
	
}