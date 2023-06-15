package Two;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicl1[] car = { new Vehicl1("sedan", "white"), new Vehicl1("SUV", "red"), new Vehicl1("coupe", "brown") };

		for (Vehicl1 c : car) {
			c.vehicleStart();
			c.vehicleStop();
		}
		
		Student ritu = new Student("chinmay deshpande","java",100000);
		
	}
}

class Vehicl1 {
	String type;
	private String color;

	public Vehicl1(String type, String color) {
		this.type = type;
		this.color = color;
	}

	public void vehicleStart() {
		System.out.println(this.color + this.type + "started");
	}

	public void vehicleStop() {
		System.out.println(this.color + this.type + "stopped");
	}
}
//write a single inheritance class

class Teacher {
	String fullname;
	String subject;

	public Teacher(String fn, String sub) {
		this.fullname = fn;
		this.subject = sub;
	}
}

class Student extends Teacher{
	int salary;
	public Student(String fn, String sub, int sal) {
		super(fn, sub);
		this.salary=sal;
	}


	
}