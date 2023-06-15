package Two;

public class day20D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D d=new D("dallas",76005,"USA");
d.displaycity();
d.displaycountry();
d.one();
d.two();
d.three();
d.four();
	}

}
interface A{
	public void one();
	public void two();
}
interface B{
	public void three();
	public void four();
}
abstract class C{
	String city;
	int zipcode;
	public C(String city, int zp) {
		this.city=city;
		this.zipcode=zp;
	}
	public void displaycity() {
		System.out.println(this.city);
		
	}
}
//example of class extending another abstract class and implementing methods from multiple interfaces
class D extends C implements A,B{
String country;
	public D(String city, int zp, String cntry) {
		super(city, zp);
		this.country=cntry;
	}
	public void displaycountry() {
		System.out.println(this.country);
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
	public void one() {
		System.out.println("one");	
	}

	@Override
	public void two() {
		System.out.println("two");
	}
}