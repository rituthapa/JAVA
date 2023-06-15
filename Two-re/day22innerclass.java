package Two;

public class day22innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grocery gr= new Grocery();
System.out.println(gr.price);
//to create object on inner class
Grocery.Fruits fr= gr.new Fruits(); //outerclass.innerclass givereferencenamefor-inner = reference-for-outer.new innerclass()
System.out.println(fr.supplier);
System.out.println(fr.vendor);
fr.City();
Grocery.Vegetables veg= gr.new Vegetables();
System.out.println(veg.supplier);
System.out.println(veg.vendor);
veg.City2();
	}

}

//creating class inside class where outer class is Grocery and inner class are fruits and vegetables
// creating two different nested classes(Fruits and vegetables) inside a class Grocery
class Grocery{
	int price=12;
	class Fruits{
		String supplier = "abc";
		String vendor = "ABC";
		
		public void City() {
			System.out.println("Supplier from pune");
		}
	}
	protected class Vegetables{
		String supplier = "xyz";
		String vendor="XYZ";
		
		public void City2() {
			System.out.println("Vendor from madras");
		}
	}
}