package Two;

public class day22Bnestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car a= new Car("honda","SUV");
// a.getCar(); //?? why private?? how can we use it doing privates
Car.TypeEngine b = a.new TypeEngine();
b.Typebased(); //prints type as SUV
b.Size(); //nothing printed as output because this on itself returns this.engine but doesnt print in output
b.displayEngine(); //this prints "bigger" as output after b.Size() is run first
//if displayengine method called without calling Size method; null is printed; because size method not called this.engine doesn't return value based on the condition so, null prints
	}

}
// how to access outer class properties inside inner class
class Car {
	String make;
	String type;
	public Car(String mk, String typ) {
		this.make=mk;
		this.type=typ;
	}
	private void getCar() {
		System.out.println(this.make);
	}
	class TypeEngine{
		String engine;
		
		public String Typebased() {
			System.out.println(Car.this.type);
			return Car.this.type;
		}
		
		public String Size() {
			if (Car.this.type.equals("SUV")) {
//				System.out.println("bigger");
				this.engine="bigger";
			}
			else if (Car.this.type.equals("Sedane")) {
//				System.out.println("smaller");
				this.engine="smaller";
			}
			else {
//				System.out.println("default");
				this.engine="default";
			}
			return this.engine;
		}
		public void displayEngine() {
			System.out.println(this.engine);
		}
	}
}