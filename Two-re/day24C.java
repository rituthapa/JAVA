package Two;

public class day24C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//to get all values of enum; use values method on enum datatype 
		//then, use for each loop to print all values
		
	TrafficColor [] tf= TrafficColor.values();	
	for (TrafficColor tfcl:tf) {
		//System.out.println(tfcl); // output: red,green,yellow
		System.out.println(tfcl.ordinal()); //output: 0,1,2
		System.out.println(tfcl.getAction()); //output: stop,go,yield
	}
		
	TrafficColor t1 = TrafficColor.RED;
	System.out.println(t1.getAction()); //stop
	System.out.println(t1.ordinal()); //0
	System.out.println(t1); //RED	
	
		
//		TrafficColor t1= TrafficColor.RED;
//		t1.displayAction();
//		System.out.println(t1.ordinal());
//		System.out.println(t1);
//		
//		TrafficColor [] tf= TrafficColor.values();
//		for(TrafficColor tff:tf) {
//			System.out.println(tff);
//			tff.displayAction();
//		}
		
	}
}

enum TrafficColor{
	RED("Stop"),
	GREEN("Go"),
	YELLOW("Yield");
	
	String action;
	private TrafficColor(String act) {
		this.action=act;
	}
	public String getAction() {
		return this.action;
	}
}
//enum TrafficColor{
//	RED("Stop"),
//	YELLOW ("yield"),
//	GREEN("Go");
//	
//	String action;
//
//private TrafficColor(String act) {
//	this.action=act;
//}
//	public void displayAction() {
//		System.out.println(this.action);
//	}
//	
//}