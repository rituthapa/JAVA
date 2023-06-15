package Two;

public class day20C {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dd d=new Dd();
		d.one();
		d.two();
		d.three();
		d.four();
		d.five();
		d.six();
		d.seven();
		d.eight();
		d.nine();
	}

}
interface Aa{
	public void one();
	public void two();
	public void three();
}
interface Bb{
	public void four();
	public void five();
	public void six();
}
interface Cc extends Aa, Bb{ //one interface can extend other single or multiple interfaces
	public void seven(); //this extending interface is done if you need the same method in your interface like in other interface but you dont want to duplicate writing the methods
	public void eight();//so with extending interface Cc can access all methods of Aa and Bb
	public void nine();
}
class Dd implements Cc{ // now when you implement Cc in your class, you need to define body for not only the 3 abstract methods of Cc, but also from its parent interfaces Aa and Bb, so additional 6;
	                    // so its mandatory that body be given for total of 9 methods in this class or whichever class implements Cc

	@Override
	public void one() {
	System.out.println("one");
	}

	@Override
	public void two() {
		System.out.println("two");
	}

	@Override
	public void three() {
	System.out.println("three");
	}

	@Override
	public void four() {
	System.out.println("four");
	}

	@Override
	public void five() {
	System.out.println("five");
	}

	@Override
	public void six() {
	System.out.println("six");
	}

	@Override
	public void seven() {
	System.out.println("seven");
	}

	@Override
	public void eight() {
		System.out.println("eight");
	}

	@Override
	public void nine() {
		System.out.println("nine");
	}
	
}