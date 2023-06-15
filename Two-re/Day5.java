package Two;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// index always starts with 0, so length-1 is total index; index is the position of character
		// 01234
		// apple
		// String fruit= "applee";
		// int x = fruit.indexOf('e');// gives the index position number of 'e' ie;4
		// which is an integer
		// System.out.println(x);
		// note that indexof give indexvalue of always the first occurrence of the
		// requested character
		// System.out.println(fruit.indexOf('l'));//output is 3
		// System.out.println(fruit.indexOf('u')); //output is -1
		// anytime the character requested is not present in the string, it doesnt have
		// index, so no index gives -1 as output

		// another way to see indexof a character of string is by writing a position
		// number after the character
		String color = "purple";
		// 012345
		// purple
		// System.out.println(color.indexOf('p',1)); //3
		// here it shows the index of first occurrence p after position 1 which is 3
		// even if you write 2 or 3 instead of 1; it will still output as 3 for p
		// System.out.println(color.indexOf('p',0));
		// here it starts from position 0, and since first occurrence p is at 0 itself,
		// output is 0
		// System.out.println(color.indexOf('p',5));
		// output is -1; anytime there is no character that's requested after your
		// position number, you get -1 as output

		// now if you want to print indexof p at 0 and at 3, then for loop
		for (int i = 0; i < color.length(); i++) {
			if (color.charAt(i) == 'p') {
				System.out.println(i); // why output is 0 and 0 twice instead of 0 and 3, how to print 0 and 3
			}
		}

		System.out.println("indexOfexample2");

		String fruit2 = "banana";
		int i1 = fruit2.indexOf('a');// 1
		System.out.println(i1);

		// to see how many a is present in the given string ie, total a in banana which
		// is 3
		int count = 0;
		for (int i = 0; i < fruit2.length(); i++) {
			if (fruit2.charAt(i) == 'a') {
				count = count + 1;
				System.out.println(i); // 1 3 5 //index of every a position, sysout inside if
			}
		}
		System.out.println("total a in banana");
		System.out.println(count); // 3 //sysout outside for loop for total count of a //0+1+1+1=3

		// array [] a data type that stores elements of a similar data type in the memory

		// The key difference between Java's length variable and Java's length() method
		// is that the Java length variable describes the size of an array, while Java's
		// length() method tells you how many characters a text String contains.
		// 0 1 2 3
		int[] age = { 1, 23, 25, 97 };
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

		// in array [], each index value holds an element
		// 0 1 2
		String fruit[] = { "apple", "grapes", "orange" };
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]); // so it will print Fruit of i
		}
		// 0 1 2 3 4
		char[] a = { 'a', 'p', 'p', 'l', 'e' };
		for (int i = 0; i < a.length; i++) {
			// System.out.println(i);
			System.out.println(a[i]);
		}
		// program 1
		String[] cities = new String[3];
		cities[0] = "dallas";
		cities[1] = "austin";
		cities[2] = "houston";

		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);

		// OR use for loop so you print once but it loops to print all values

		for (int i = 0; i < cities.length; i++) {
			System.out.println(i);
			System.out.println(cities[i]);
		}
		// program 2
		int num[] = new int[4];
		num[0] = 34;
		num[1] = 44;
		num[2] = 54;
		num[3] = 64;

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);

		// or using for loop

		for (int i = 0; i < num.length; i++) {
			System.out.println(i);
			System.out.println(num[i]);
		}

		// split //splitting string to separate elements
		String text = "I am learning java";
		String[] x = text.split(" ");

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		String txt = "hello to the universe";
		String[] txt1 = txt.split(" ");
		String[] txt2 = txt.split("e");
		for (int i = 0; i < txt1.length; i++) {
			System.out.println(txt1[i]);
		}
		for (int i = 0; i < txt2.length; i++) {
			System.out.println(txt2[i]);
		}

		// separating text to different characters using chararray

		String name = "Evansh";
		char[] name1 = name.toCharArray();
		for (int i = 0; i < name1.length; i++) {
			System.out.println(name1[i]);
		}

		//
		int[] numbers= new int[4]; //here 4 is size of array; so, 4 elements, so elements at  0, 1,2,3 positions, ie total of 4 positions
		numbers[0]= 11;
		numbers[1]=22;
		numbers[2]=33;
		numbers[3]=44;
	
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		String msg="my name is ritu thapa";
		String [] msgA=msg.split(" "); //[my,name,is,ritu,thapa]
		for (int i=0;i<msgA.length;i++) {
			System.out.println(msgA[i]);
		}
		
	}
}

