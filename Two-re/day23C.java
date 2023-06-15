package Two;


enum Cartype{
	SUV,SEDAN,COUPE
}
public class day23C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testcars cc= new Testcars(Cartype.SEDAN);
		cc.getCarName();

	}

}
class Testcars{
	Cartype size;
	public Testcars(Cartype siz) {
		this.size=siz;
	}
	
//	public void getCarName() {
//		switch (size){
//		case SUV:
//			System.out.println("AudiQ6");
//			break;
//		case SEDAN:
//			System.out.println("BMW");
//			break;
//		case COUPE:
//			System.out.println("Ferarri");
//			break;
//		}
//	}
	//both above and below method gives same output but difference is
	//above method doesn't return value; below returns the value
	
	public String getCarName(){
		switch (size){
		case SUV:
			System.out.println("AudiQ6");
			return "AudiQ6";
		case SEDAN:
			System.out.println("BMW");
			return "BMW";
		case COUPE:
			System.out.println("Ferarri");
			return "Ferarri";
			default:
				System.out.println("dont have this sizetype");
				return "dont have this sizetype";
		}
	}
	
}
