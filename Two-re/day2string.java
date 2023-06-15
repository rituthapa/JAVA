package Two;

public class day2string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// index starts from 0
		// so basically index is length-1
		String city7 = "dallas";
		int len = city7.length();
		System.out.println(len);
		
		char x=city7.charAt(1);
		System.out.println(x);

		for (int i = 0; i < len; i++) {
			System.out.println(city7.charAt(i));
		}

		// reverse string

		String city8 = "austin";
		int len2 = city8.length();
		System.out.println(len2);

		for (int i = len2 - 1; i >= 0; i--) {
			System.out.println(city8.charAt(i));
		}
		
	//startswith(reference), endswith("char of string"), gives boolean value as output(true or false)
		
		String fruit = "orange";
		String fruit2 = "apple";
		boolean f=fruit.startsWith("o");
		boolean f2=fruit2.startsWith("o");
		System.out.println(f);
		System.out.println(f2);
		boolean fr=fruit.endsWith("e");
		System.out.println(fr);
		
		//contains
		String s="i am learning java";
		boolean y=s.contains("learning");
		System.out.println(y);
		
		//escape character - to escape write backslash before that character; here \ befor both "" inside the string so, it doesnt give error for "" and will actually print the "" too
		//String example = "Best quote "Try try but donot cry"";
				String example = "Best quote \"Try try but donot cry\"";
				System.out.println(example);
		
				
				//replace
				String text=" I am learning java and java is fun";
				String txt= text.replace('j', 'k'); //replaces all j with k
				System.out.println(txt);
				
				String txt1=text.replaceAll("java","javascript"); //replaces all java with javascript
				//String txta=text.replace("java","javascript"); //prints the same output as above
				System.out.println(txt1);
				
				String txt2=text.replaceFirst("java","python"); //only replace java that comes first with python
				System.out.println(txt2);
				
			//equals
				//contains
				//both data type is boolean
	}

}
