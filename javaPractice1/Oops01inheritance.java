package javaPractice1;

public class Oops01inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GrandFather gf=new GrandFather("ratna","thapa");
	Father f=new Father("ratna","thapa","lok");
		Son s= new Son("ratna","thapa","lok","kushal");
		Daughter d= new Daughter("ratna","thapa","lok","ritu");
		
		gf.grandpafullName();
		f.grandpafullName();
		f.fatherName();
		d.fatherName();
		d.grandpafullName();
		d.daughterName();
		s.grandpafullName();
		s.fatherName();
		s.sonName();
	}

}
//singlelevelinheritance one parent,one child
//multilevelinheritance; one parent, then one child; then child of that 1st child 
//example: Grandfather class; classFather extends GrandFather; classSon extends Father ---- 1;2 extends 1; 3 extends 2
//hierarchialinheritance oneparent; two child; ie; two classes inheriting same parent class
//example: classMother; classSon extends Mother; classDaughter extends Mother

//multipleinheritance ie;multiparent is not possible in java

class GrandFather{
	String Gfirstname;
	String lastname;
	public GrandFather(String Gfn, String ln) {
		this.Gfirstname=Gfn;
		this.lastname=ln;
	}
	public void grandpafullName() {
		System.out.println(this.Gfirstname + this.lastname);
	}
}
class Father extends GrandFather{
	String Ffirstname;
	public Father(String Gfn, String ln, String Ffn) {
		super(Gfn, ln);
		this.Ffirstname= Ffn;
	}
	public void fatherName() {
		System.out.println(this.Ffirstname + this.lastname);
	}
}
class Son extends Father{
	String Sfirstname;
	public Son(String Gfn, String ln, String Ffn, String Sfn) {
		super(Gfn, ln, Ffn);
		this.Sfirstname=Sfn;
	}
	public void sonName() {
		System.out.println(this.Sfirstname + this.Ffirstname + this.lastname);
	}
}
class Daughter extends Father{
String Dfirstname;
	public Daughter(String Gfn, String ln, String Ffn, String Dfn) {
		super(Gfn, ln, Ffn);
		this.Dfirstname=Dfn;
	}
	public void daughterName() {
		System.out.println(this.Dfirstname +this.Ffirstname + this.lastname);
	}
}