package Two;

public class innerclassexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//inner class inside a class
		Cosmetics c=new Cosmetics(42,"Stila");
		Cosmetics.Makeup m= c.new Makeup();
		m.makeupBrand();
		c.brandInfo();
		
		//overiding class's object
		Abc ritu= new Abc(10000,"Dallas");
		ritu.deposit(200);
		ritu.withdrawl(50);
		Xyz ritu2= new Xyz(10000, "Dallas", "Euless");
		ritu2.deposit(20);
		ritu2.withdrawl(100);
		
		//overloading 
		Calculato a1= new Calculato();
		System.out.println(a1.addition(10,20));
		System.out.println(a1.addition(10,20,30));
		System.out.println(a1.addition(10,20,30,40));
		
		
		
		// write program to reverse string "nepal"	
				String rev="";
		 String ctry="nepal";
		 
		 for (int i=ctry.length()-1;i>=0;i--) {
			 rev=rev + ctry.charAt(i);
		 }
		 System.out.println(rev);
		 
		 //write program to count number of objects
		 int count =0;
		 String [] fruits= {"apples", "oranges", "grapes", "bananas"};
		 for (int i=0; i<fruits.length; i++) {
			 count=count+1;
		 }
		 System.out.println(count);
		 
		 //class inside class example 2
		 Family f= new Family();
		 System.out.println(f.lastname);
		 Family.Children ch= f.new Children("ritu");
		 ch.getfullname();
		 
	}
 
}

//write an innerclass inside a class and access properties of outerclass from inside innerclass
class Cosmetics {
	int price;
	String brand;

	public Cosmetics(int p, String br) {
		this.price = p;
		this.brand = br;
	}

	public void brandInfo() {
		System.out.println("These brands are USA based");
	}

	class Makeup {
		String foundation;
		String eyeliner;

	public void makeupBrand() {
	 if (Cosmetics.this.brand == "EsteeLauder") {
		 System.out.println("Bestseller brand for foundation");
	 }
	 else if (Cosmetics.this.brand.equals("Stila")) {
		 System.out.println("Bestseller brand for eyeliner");
	 }
}
	}
}

//write program for overloading and overriding

//overriding
class Abc{
	int accountbalance;
	String city;
	
	public Abc(int ac,String ct) {
		this.accountbalance=ac;
		this.city=ct;
	}
	public void deposit(int x) {
		System.out.println("Depsited amount is "+x);
	}
	public void withdrawl(int y) {
		System.out.println("withdrawn amount is "+y);
}
}
class Xyz extends Abc{
	String branch;
	public Xyz(int ac, String ct, String brh) {
		super(ac, ct);
		this.branch=brh;
		// TODO Auto-generated constructor stub
		}
	
	public void deposit(int x) {
		System.out.println("Depsited amount for this branch is "+x);
	}
	public void withdrawl(int y) {
		System.out.println("withdrawn amount for this branch is "+y);
		super.withdrawl(this.accountbalance-y);
}
	}
	
//overloading
class Calculato{
	public int addition(int x, int y) {
		return (x+y);
	}
	public int addition(int x, int y, int z) {
		return (x+y+z);
	}
	public int addition(int x, int y, int z, int q) {
		return (x+y+z+q);
	}
	
}

class Family{
	String lastname="thapa";
	class Children{
		String firstname;
		public Children(String fn) {
			this.firstname=fn;
		}
		
		public void getfullname() {
		System.out.println(this.firstname + " " + Family.this.lastname );
		}
	}
	
}
