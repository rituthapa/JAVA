package three;

public class day25B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throw keyword throws a customized exception instead of using general exception from java

		Testclass.dividedbyZeroException();
		System.out.println(10/0);
	}

}
class Testclass{
	public static void dividedbyZeroException(){
		throw new ArithmeticException("Trying to divide by zero");
	}
}
