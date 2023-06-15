package Two;

public class day21B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5 objects of class Studentte
		//print no of objects created(ie, count of objects created); ie; how to print 5 as output here
		Studentte aa= new Studentte("ritu thapa",27);
		Studentte bb= new Studentte("kushal thapa",25);
		Studentte cc= new Studentte("garima thapa",26);
		Studentte dd= new Studentte("gaurav thapa",24);
		Studentte ee= new Studentte("saurav thapa",22);
	
		
		//System.out.println(Studentte.increasecount()); //ERROR
		//this is not possible sysout on the method because method has sysout already inside it
		//since we cant print output for increasecount method, define a field(property) increasecount
		
		System.out.println(Studentte.count); //output 5
		Studentte.objectcount(); // output 5
		Studentte.increasecount();  //output 6 (bcoz count = 5 also +1 inside the method; so 6
		
		
		int x=Studentte.increasecount1(); //method for this is line 48,49
		System.out.println(x); 
		//the above will only give count=0+1=1 so output as 1 only;
		//but we want looping 5 times and to get 5 as output
		
	}

}
class Studentte{
	String fullname;
	int age;
	static int count=0;
	public Studentte(String fn, int age) {
		this.fullname=fn;
		this.age=age;
		Studentte.count=Studentte.count + 1;
		//Studentte.increasecount();
	}
	
	public static void objectcount() {
		System.out.println(Studentte.count);
	}
	//or another way
	public static int increasecount1() {
		return Studentte.count=Studentte.count+1;
	}
	//below will add +1 to the total count // or else sysout(studentte.count-1) to get the count //really bad and hard way to write
	public static void increasecount() {
		Studentte.count=Studentte.count+1;
		System.out.println(Studentte.count); 
	}
}