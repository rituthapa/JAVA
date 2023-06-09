package three;

public class day25D {

public static void main(String[] args) {
	
	String [] name = new String[3];
	name[0]="ritu";
	name[1]="kushal";
	name[2]="sanjok";
	
	int we[] = new int[3];
	we[0]=2;
	we[1]=3;
	we[2]=4;
	
	System.out.println(we); //will give reference only
	for (int j=0;j<we.length;j++) {
		System.out.println(we[j]);
	}
	
	int [] num= new int[3];
	num[0]=11;
	num[1]=22;
	num[2]=33;
	
	//now use try-catch block to handle the exception
	
	try {
		for (int i=0;i<=num.length; i++) {
			System.out.println(num[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("continue with rest of the execution");
		e.printStackTrace();
		String s2= e.toString();
		System.out.println(s2);
	}
	finally {
		System.out.println("Exception occurs or not; I will run no matter what");
	}
	System.out.println("signing off now");
	
	
	try {
		int [] nm = new int [2];
		nm[0]=100;
		nm[1]=200;
		
		for (int i=0; i<3; i++) {
			System.out.println(nm[i]);
		}
	}
	catch(Exception e){ //here, if you don't know the exception name; just name a general exception class ie; Exception e
		System.out.println(e.getMessage()); //getMessage() method of e object gives you just an exception message in simple sentence
		e.printStackTrace(); //this method already has print in it so, directly prints, sysoutprintln not done(this throws an eror)
	}
	
	
}
}
