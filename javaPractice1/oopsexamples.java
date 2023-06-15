package javaPractice1;

public class oopsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method overloading - 
		// Rules -> 1. Method name must be same but parameter must be different
//		       para rules -> a. either number of parameter must be different
//							   b. either type of parameter must be different
//		 					   c. either Sequence of parameter must be different
		//  2. Access specifier of overloaded method can be anything
		//  3. Return type of overloaded method can be anything
		//  4. Exception thrown can be anything.
			 
			        // Calling method by passing
			        // input as in arguments
			        System.out.println(Helper.Multiply(2, 4));
			        System.out.println(Helper.Multiply(5.5, 6.3));
			        System.out.println(Helper.Multiply(2, 4, 8));
			        System.out.println(Helper.Multiply(5.5, 6));
			        System.out.println(Helper.Multiply(6, 5.5));
			    }
			}
			class Helper {
			  public static int Multiply(int x, int y){
			    return x*y;
			  }
			   // Method with 2 integer parameters
			  public static double Multiply(double x, double y){
			    return x*y;
			  }
			    public static int Multiply(int x, int y, int z){
			        return x*y*z;
			      }
			    public static double Multiply(double x, int y){
			        return x*y;
			      }

	}


