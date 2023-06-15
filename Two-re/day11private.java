package Two;

public class day11private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logger log= new Logger();
log.message();

LoggerB logB= new LoggerB();
//logB.displayfirstname(); //this private method cannot be called here in main method; because can't be called outside class
logB.displayfirstname2();

Place set= new Place();
set.city="nagpur";
System.out.println(set.city);

PlaceB set2= new PlaceB();

//System.out.println(set2.city);  cant result because private

String updatedcity= set2.getcityname();
System.out.println(updatedcity); //this will get you dallas as output; visible now
//now if we set new value
set2.setcityname("austin");
System.out.println(set2.getcityname()); //output is austin, not dallas

PlaceC set3= new PlaceC("sanantonio");
String updatedcity3= set3.getcity();
System.out.println(updatedcity3); //sanantonio as output
//or if you dont store in new variable; you can directly write 
System.out.println(set3.getcity()); //sanantonio as output

set3.setcity("newyork");
System.out.println(set3.getcity()); //newyork as output
//System.out.println(updatedcity3); //sanantanio as output because evenifupdated but updatedcity3 variable name stores the previous value only
//give new variable name for new updated value
	String updatedcity4= set3.getcity();
			System.out.println(updatedcity4); //newyork as output
	
	}
}

class Logger{
void message()
{System.out.println("hello");
	
}
}

class LoggerB{
	private String firstname = "ritu";
	private void displayfirstname() {
		System.out.println(this.firstname);
	}
		void displayfirstname2() {
			this.displayfirstname();
		}
	}

class Place{
	String city="pune";
}

// hard-coded value in class; no constructor

class PlaceB{
	private String city="dallas";
	//set the new value: setter
	void setcityname(String cN) {
		this.city=cN;
	}
	
	//get the new value: getter
	public String getcityname() {
		return this.city;
	}
}

//using constructor for value (writeparameters)(give value at the time of object creation)
class PlaceC{
	private String city;
	public PlaceC(String ct) {
		this.city=ct;
	}
	
	//update the city
	void setcity(String cty) {
		this.city= cty;
	}
	//get the city
	 String getcity() { //if not writing anything infront; its default method or you can write public too
		return this.city;
	}
}