package Two;

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalculatorA a= new CalculatorA();
CalculatorA b=new CalculatorA(1);
CalculatorA c=new CalculatorA(1,2);
CalculatorA d=new CalculatorA(1,2,3);

Calculator x= new Calculator();
x.addition(1,2);
x.addition(3,4,5);
x.addition(5,6,7,8);

WorldBank wb= new WorldBank("dallas",1);
wb.loan(5);
wb.save(6);
Citibank cc =new Citibank("dallas",1,11); //do we have to write same value as parent in child parameter or canbe anything?
cc.loan(12);
cc.save(7);
BOA ba= new BOA("austin",2,21);
ba.loan(22);
ba.save(5);

	}
}
//Polymorphism: same thing has many forms
//overloading
//same class
//same method name
//different signature(parameter)
//real example: search engine on Amazon: same function for all paramters ie, search, but different signature,ie, different iphones 
//iphone search displays iphone, iphone 6 displays 6 serached, iphone 6S displays 6S searched

//method overloading
class Calculator{
	public void addition(int x,int y) {
		System.out.println(x+y);
	}
	public void addition(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public void addition(int x, int y, int z, int a) {
		System.out.println(x+y+z+a);
	}
}

//constructor overloading

class CalculatorA{
	public CalculatorA() {
		System.out.println("default constructor");
	}
	public CalculatorA(int x) {
	System.out.println("one parameter");
	}
	public CalculatorA(int x, int y) {
		System.out.println("two parameter");
	}
	public CalculatorA(int x, int y, int z) {
		System.out.println("three parameter");
}
}

//overriding
// same method name, same signature/parameter; but in different class so inheritance required for overiding

class WorldBank{
	String city;
	int pincode;
	public WorldBank(String city, int pn) {
		this.city=city;
		this.pincode=pn;
		
	}
	
	public void loan(int x) {
		System.out.println("Worldbank has loan rate of " + x);
	}
	public void save(int y) {
		System.out.println("Worldbank has saving rate of "+ y);
	}
}
class Citibank extends WorldBank{
int code;
	public Citibank(String city, int pn, int code) {
		super(city, pn);
		this.code=code;
	}
	//now, here you can write same methodname and paramter as parentclass worldbank but you want to use your own bank's loan and save(not worldbank)
	//so you can override their methodbody and write the methodbody for your bank instead of parent worldbank,so body of method can be changed; which is overriding)
	public void loan(int x) {
		System.out.println("Citibank has loan rate of " + x);
	}
	public void save(int y) {
		System.out.println("Citibank has saving rate of "+ y);
	}
}
class BOA extends WorldBank{
int code2;
	public BOA(String city, int pn,int code2) {
		super(city, pn);
		this.code2=code2;
	}
	public void loan(int x) {
		System.out.println("BOA has loan rate of " + x);
		super.loan(x); //you can still access parent method using super keyword(super.methodname()) inside your method
	}
	public void save(int y) {
		System.out.println("BOA has saving rate of "+ y);
		super.save(99); //how to actually access rate of parent without hardcoding value
		//just pass any value super.save(y) or super.save(y-2)
		// or super.save(this.loan) but to write this in parameter, you have to define property in worldbank as int loan and constructor parametr(along with others, add int loan too)and define this.loan=loan and on child constructor parameter too 
	}
}