
package javaPractice1;

public class oopsexamplesSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //  Write an example of Super keyword with variable 
		//do this by defining constant property(eg: age=100) and use super.age inside method 
		
		//super keyword can be used in constructor; in method(in overriding, if save method, super.save(x) can be defined inside method)or in variable
		  Sonn son1= new Sonn("sanjok","kunwar","Evansh");
		  son1.displaySonname();
		  son1.displayfathername();
	}

}
class Fatherr{
	  String firstname;
	  String lastname;
	  int age = 100;

	      public Fatherr(String fn,String ln){
	        this.firstname=fn;
	        this.lastname=ln;
	      }

	      public void displayfathername(){
	        System.out.println(this.firstname+this.lastname);
	      }

	}
	class Sonn extends Fatherr{
	  String sonFirstname;
	    public Sonn(String fn, String ln, String sfn){
	      super(fn,ln);
	      this.sonFirstname=sfn;
	    }
	     public void displaySonname(){
	      System.out.println(this.sonFirstname + this.lastname +super.age);
	     }
	}
