package Two;

public class day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CanaraX cax= new CanaraX();
cax.loan(12);
cax.save(14);
cax.discount(16);

PBI pb=new PBI();
pb.loan(1);
pb.save(2);
pb.discount(3);
	}

}
//interface
//example of one interface implemented by multiple classes
interface Worldbankrules{
	public void loan(int x); //in interface, the method is abstract even if written or not
	public void save(int y);
	public void discount(int z);
}
class CanaraX implements Worldbankrules{
	
	public void loan(int x) {
System.out.println("Canara loan method "+ x);
	}
	public void save(int y) {
System.out.println("Canara save method "+ y);
	}
	public void discount(int z) {
System.out.println("Canara discount method "+z);	
	}
	
}

class PBI implements Worldbankrules{
	public void loan(int x) {
		System.out.println("PBI loan method " + x);
			}
			public void save(int y) {
		System.out.println("PBI save method "+ y);
			}
			public void discount(int z) {
		System.out.println("PBI discount method "+ z);	
			}
			
}