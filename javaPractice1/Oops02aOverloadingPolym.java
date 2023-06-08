package javaPractice1;

public class Oops02aOverloadingPolym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorr add = new Calculatorr();
		System.out.println(add.addition(1, 2));
		System.out.println(add.addition(1, 2, 3));
		System.out.println(add.addition(1, 2, 3, 4));
		
		Calculatorrr calc= new Calculatorrr();
		Calculatorrr calc1=new Calculatorrr(1);
		Calculatorrr calc2=new Calculatorrr(1,2);
		Calculatorrr calc3=new Calculatorrr(1,2,3);
		
		Select sel=new Select();
		sel.selbyindex(0);
		sel.selbytext("text");
		sel.selbyattriValue("value");
		
		Iframe frm = new Iframe();
		frm.frame(1);
		frm.frame("Element");
		frm.frame("ele", "elem");
	}

}
//Polymorphism: one thing; many forms; overloading and overriding
//overloading: same class, same method name, different parameters(can give slightly different methodname for understanding; still overloading if method body is same and parameters differs
//in selenium, select class and frame method both uses overloading concepts

//method overloading
class Calculatorr{
	public int addition(int x,int y) {
		return x+y;
	}
	public int addition(int x,int y, int z) {
		return x+y+z;
	}
	public int addition(int x, int y, int z, int a) {
		return x+y+z+a;	
	}
}
//constructor overloading
class Calculatorrr{
	public Calculatorrr(){
		System.out.println("default constructor with no parameter called");
	}
	public Calculatorrr(int x){
		System.out.println("constructor with one parameter called");
	}
	public Calculatorrr(int x, int y){
		System.out.println("constructor with two parameters called");
	}
	public Calculatorrr(int x, int y, int z){
		System.out.println("constructor with three parameters called");
	}
	
}
class Select{
	public void selbytext(String x) {
		System.out.println("no matter the way of selecting, it selects something");
	}
	public void selbyindex(int y) {
		System.out.println("no matter the way of selecting, it selects something");
	}
	public void selbyattriValue(String z) {
		System.out.println("no matter the way of selecting, it selects something");
	}
}
class Iframe{
	public void frame(int index) {
		System.out.println("switches to an iframe");
	}
	public void frame(String webelement) {
		System.out.println("switches to an iframe");
	}
	public void frame(String id, String name) { //actual frame method needs webelement datatype not string//here just practicing overloading concept
		System.out.println("switches to an iframe");
	}
}