package Two;

public class day24B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Color c1= Color.BLACK;
System.out.println(c1);
c1.displayColor();
	}

}
enum Color{
	BLACK,
	WHITE,
	RED,
	ORANGE;
	
	// defining constructor inside enum
	// even when an object for one constant of enum is called; constructor will be called for all 4 constants
	
	private Color() {
		System.out.println("constructor called");
	}
	//defining method inside enum
	public void displayColor() {
		System.out.println("Colordisplay method called");
	}
}
