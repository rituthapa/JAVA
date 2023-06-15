package Two;

public class day1String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a string
		// program 1

		String text = "I am learning Java";
		String text2 = "I am learning QA class";
		System.out.println(text);
		System.out.println(text2);

		// program 2
		// string + int = string; int + int= int; int+str=str; str+str=str

		System.out.println("20" + 2); // 202
		System.out.println("2" + 2); // 22
		System.out.println(2 + 2); // 4
		System.out.println(2 + "02"); // 202
		System.out.println(2 + "20"); // 220

		// program 3
		// chaining
		String a = "i am learning";
		String b = "java";
		System.out.println(a + b);
		System.out.println(a + " " + b);

		// program 4: concat; joining/chaining

		System.out.println(a.concat(a));

		String c = a.concat(b);
		System.out.println(c);

		String first = "hello";
		String second = " world";
		String third = first.concat(second);
		System.out.println(third);

		// program 5: length() of string
		System.out.println(a.length()); // 13 characters including the spaces in "I am learning"
		int x = second.length();
		System.out.println(x); // 6 (space + world)
		System.out.println("x"); // prints x only because x is only a value of string within ""

		// program 6: creating a new object
		String city = new String("dallas");
		System.out.println(city);

		// program 7

		System.out.println(city.toUpperCase()); // DALLAS
		String cityU = city.toUpperCase();
		System.out.println(cityU); // DALLAS

		// several methods can be chained together if we know what type the previous
		// method return
		String day = "Sunday";
		int daycheck = day.toUpperCase().toLowerCase().length(); // only return output from the lastmethod // here
																	// integer
		System.out.println(daycheck);
		String daycase = day.toLowerCase().toUpperCase().toLowerCase(); // only return last method output which is
																		// string
		System.out.println(daycase);

	}

}
