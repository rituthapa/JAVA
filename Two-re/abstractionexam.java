package Two;

public class abstractionexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
KFCfranchise restro= new KFCfranchise("euless",76040,"nuggets");
restro.displayCity();
restro.displayfood();


	}

}
abstract class KFC{
	String city;
	int zipcode;

	public KFC (String ct, int zp) {
		this.city=ct;
		this.zipcode=zp;
		
	}
abstract public void displayCity();
public void displayfood() {
	System.out.println("all food contains chicken");
}
}
class KFCfranchise extends KFC{
	String fooditem;
	public KFCfranchise(String ct, int zp, String food) {
		super(ct, zp);
		this.fooditem=food;
	}

	@Override
	public void displayCity() {
		System.out.println("this branch is in Euless");
	}
	
}

//interface integers{
//	public void one();
//	default void zero() {
//		System.out.println("all integers start with 0");
//	}
//}
//interface numbers{
//	public void two();
//	default void negetive() {
//		System.out.println("no negetive numbers included");
//	}
//}
//abstract class Xyz {
//	abstract public void three();
//	public void four() {
//		System.out.println("four included");
//	}
//class Rrr extends Xyz implements integers,numbers{
//
//	
//	public void two() {
//		System.out.println("two included");
//		
//	}
//	public void one() {
//System.out.println("one included");
//		
//	}
//
//	public void three() {
//		System.out.println("three included");
//	}
//	
//	}
//}