package three;

public class day25C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a= 8;
		int b=0;
		System.out.println("hey there");
		try {
			System.out.println("in try"); 
			System.out.println(a/b); //something that might raise an exception is written in try block
		}
		//something that handles exception written in catch block
		//ie; something that can bypass that exception-causing statement and continue the normal flow of program
		catch(ArithmeticException e) {  //here ArithmeticExpression is a class; so e is the object created of datatype ArithmeticException
			System.out.println("in catch");
			e.printStackTrace(); // the object 'e' can have properties and methods too;
			//above, printstacktrace() method gives information about the type of exception
			 
			//also, you can write method to change the exception-message to string
			String s= e.toString();
			System.out.println(s);
			System.out.println("Incorrect input: Exception handled");
		}
		finally {
			System.out.println("This prints no matter what");
		}
		
		System.out.println("byebye");
	}

}

