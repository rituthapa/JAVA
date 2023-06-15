package Two;

public class interfaceexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digits dig= new Digits();
		dig.negetive();
		dig.zero();
		dig.four();
		dig.one();
	}
}
interface Integers{
	public void one();
	default void zero() {
		System.out.println("all integers start with 0");
	}
}
interface Numbers{
	public void two();
	default void negetive() {
		System.out.println("no negetive numbers included");
	}
}
abstract class Figures {
	abstract public void three();
	public void four() {
		System.out.println("four included");
	}
}
class Digits extends Figures implements Integers,Numbers{

	
	public void two() {
		System.out.println("two included");
		
	}
	public void one() {
System.out.println("one included");
		
	}

	public void three() {
		System.out.println("three included");
	}
}


