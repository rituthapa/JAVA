package Two;

enum Cartypes{
	//enum can have constants, and also properties,constructor and methods too
	//enum constants calling with constructor
	SEDAN("BMW"),
	COUPE("Ferrari"),
	SUV("AudiQ6");
	
	private final String carname; //defining properties inside enum
	
	private Cartypes(String name) { //defining constructor
		this.carname=name;
	}
	
	public String getcarName() {
		return this.carname;
	}
}

public class day23D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cartypes ccc= Cartypes.SEDAN;
		System.out.println(ccc);
		System.out.println(ccc.getcarName());
		
		Cartypes [] ct= Cartypes.values();
	for (Cartypes c:ct) {
		//System.out.println(c); //output: sedan, coupe, suv
		//System.out.println(c.ordinal()); // output: 0,1,2
		System.out.println(c.getcarName()); // output: BMW, Ferrari, AudiQ6
	}
	
	}
}
