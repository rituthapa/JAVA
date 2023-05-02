package three;

public class day25exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		System.out.println("hello");
		//System.out.println(10/0); //arithmetic exception 
		System.out.println("bye"); //because of above statement; even 'bye' wont be printed
		
		//how to handle that exception so you can have normal flow for rest of the program
		//this is done by exception handling
		//try catch block
		//finally block
		//throw and throws keywords
		
		//try and catch block
		try {
			//try block: something that can raise an exception
		System.out.println(10/0);
			//System.out.println(10/5); //prints 2 and finally block statements
		}
		catch(ArithmeticException e) {
			//this always follows after the try block
			//catch handles the exception by the statements from catch block and allows normal flow of program
			System.out.println("Exception handled: incorrect input");
		}
		finally {
			//statements inside finally block runs whether try block passes or fails
			//anything important eg: like closing the program should happen even if exception occurs or not; then that should be written in finally block
			System.out.println("Print me even if previous code expected or not");
		}
		
	}

}
