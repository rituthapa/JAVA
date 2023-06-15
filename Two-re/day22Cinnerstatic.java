package Two;

public class day22Cinnerstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object of outer class
Company c= new Company();

//object of inner class // synatx: outer.innerclass reference= outerreference.new inncerclass()
Company.Branch b1= c.new Branch();
b1.displaybranchname();

//object of static inner class (same as normal/outer class) classname ref= new classname

Company.Branch2 b2= new Company.Branch2(); //syntax: outer.innerclass ref= new outer.innerclass()
b2.displaybranchname(); 

		
	}

}

class Company {
	String name = "TATA";

	class Branch {
		public void displaybranchname() {
			System.out.println("BranchDelhi");
		}
	}

	static class Branch2 {
		public void displaybranchname() {
			System.out.println("BranchPune");
		}
	}
}
