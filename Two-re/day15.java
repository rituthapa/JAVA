package Two;

public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Student ritu= new Student("ritu thapa",27,"dallas");
//ritu.displayName();
//
//Teacher chinmay= new Teacher("chinmay deshpande",32,"pune",1000000);
//chinmay.displayBonus();
//  //chinmay.displayName();

		StudentA ritu1= new StudentA("ritu thapa",27);
		TeacherA chinmay1= new TeacherA("kchinmay deshpande",32,100000);
		ProfessorA sanjok= new ProfessorA("sanjok kunwar",31,110000,"maths");
		
		System.out.println(sanjok.fullname);
		System.out.println(sanjok.age);
		System.out.println(sanjok.salary);
		System.out.println(sanjok.spec);
				
	ritu1.displayName();
	chinmay1.displayAge();
	sanjok.displayAge();
	chinmay1.displayName();
	chinmay1.displaySalary();
	sanjok.displayName();
	sanjok.displayAge();
	sanjok.displaySalary();
	sanjok.displaySpec();
	
		Mother madhu= new Mother("madhu","thapa");
		System.out.println(madhu.firstname);
		System.out.println(madhu.lastname);
		
		madhu.displayMname();
		
		Daughter ritu= new Daughter("madhu","thapa","ritu");
		System.out.println(ritu.firstname);
		System.out.println(ritu.lastname);
		System.out.println(ritu.Dname);
		
		ritu.displayDname();
		ritu.displayMname();
		
		SonA kushal= new SonA("madhu","thapa","kushal");
		System.out.println(kushal.firstname);
		System.out.println(kushal.lastname);
		System.out.println(kushal.Sname);
		
		kushal.displayMname();
		kushal.displaySname();
	}

}
//Single Inheritance
//class Student{
//	String fullname;
//	int age;
//	String city;
//	public Student(String fn, int age, String cty) {
//		this.fullname=fn;
//		this.age=age;
//		this.city=cty;
//	}
//	void displayName() {
//		System.out.println(this.fullname);
//	}
//}
//class Teacher extends Student {
//	int salary;
//	public Teacher(String fn, int age, String cty, int salary) {
//		super(fn,age,cty);
//		this.salary=salary;
//	}
//	void displayBonus() {
//		this.displayName();
//		System.out.println(1000);
//}
//}

//Multi-level inheritance

class StudentA{
	protected String fullname;
	protected int age;
	
	public StudentA(String fn,int age) {
		this.fullname=fn;
		this.age=age;
	}
	void displayName() {
		System.out.println(this.fullname);
	}
	
}
class TeacherA extends StudentA{
int salary;
	public TeacherA(String fn, int age, int salary) {
		super(fn, age);
		this.salary=salary;
	}
	void displayAge() {
		System.out.println(this.age);
	}
	void displaySalary() {
		System.out.println(this.salary);
	}
}
class ProfessorA extends TeacherA{
String spec;
	public ProfessorA(String fn, int age, int salary, String spec) {
		super(fn, age, salary);
		this.spec=spec;
	}
	void displaySpec() {
		System.out.println(this.spec);
	}
}
//Hierarchical

class Mother{
	String firstname;
	String lastname;
	public Mother(String fn, String ln){
		this.firstname=fn;
		this.lastname=ln;
	}
	void displayMname() {
		System.out.println(this.firstname + this.lastname);
	}
}
class Daughter extends Mother{
	String Dname;
	public Daughter(String fn, String ln, String dn) {
		super(fn, ln);
		this.Dname=dn;
	}
	void displayDname() {
		System.out.println(this.Dname + this.firstname+this.lastname);
	}
}
class SonA extends Mother{
String Sname;
	public SonA(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname=sn;
	}
	void displaySname() {
		System.out.println(this.Sname + this.firstname +this.lastname);
	}
}