package Two;

public class day20E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangular rr= new Rectangular();
rr.getArea(12,11);
rr.getcoordinated();
rr.getcoordinated(12,14);
	}

}
//from Java 8 version and onwards, interface can have regular methods as well not only abstract methods
//but it's mandatory to use "default" keyword for regular methods inside interface
//with these default method, you can do both overloading and overriding

interface Plot{
	public void getArea(int len,int wid);
	default void getcoordinated() {
		System.out.println("X is x and Y is y");
	}
	default void getcoordinated(int x,int y) { //this is overloading //here you are adding parameters for same interface, and same method, only different signature
		System.out.println("X is x and Y is y");
	}
}
class Rectangular implements Plot{

	@Override
	public void getArea(int len, int wid) {
	System.out.println("Area is " + (len*wid));
	}
	public void getcoordinated(int x, int y) { //this is overiding //here we are overiding body of getcordinated(x,y) method by giving our own body instead of usiing theirs //we are at different class(here at class instead of interface), same method, same signature; now methodbody cane be changed
		System.out.println("rectangle has length as x and width as y");
	}
}