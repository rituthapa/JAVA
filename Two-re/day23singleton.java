package Two;

public class day23singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//VehicleX v1= new VehicleX();
//VehicleX v2= new VehicleX();
//VehicleX v3= new VehicleX();
	
		VehicleX.createInstance();
		VehicleX.createInstance();
		VehicleX.createInstance();
		VehicleX.createInstance();
		// when you call this method any number of times, it's printing you value only once
		//This is called Singleton Pattern where object can be created once only
		
		//VehicleX.createObject2(); this 2nd method even if you call; you will get only hello as the output
		
		XX.createObject();
	}

}
class VehicleX{
	static VehicleX v1; //static used  in property because method is static
	private VehicleX() { //why this??
		
	}
	public static void createInstance() { //static keyword used to call method on class name (not reference name)
		if (v1==null) {
			System.out.println("hello");
			v1= new VehicleX();
		}
	}
	//if you want to return the object to use it later: use return key instead of void like below
//	public static VehicleX createObject2() {
//		if (v1==null) {
//			System.out.println("hi");
//			v1 = new VehicleX();
//		}
//		return v1;
//	}
}

class XX{
	static XX x1;
	private XX() {
	
	}
	public static XX createObject() {
		if (x1==null){
			System.out.println("hi");
			x1=new XX();
		}
		return x1;
	}
	
}
 