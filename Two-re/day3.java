package Two;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1
		String month = "august";
		for (int i = 0; i < month.length(); i++) {
			System.out.println(month.charAt(i));
		}
		// program 2 print august together
		String mnth = "";
		for (int i = 0; i < month.length(); i++) {
			mnth = mnth + month.charAt(i);
		}
		System.out.println(mnth);

		// program 3; print august together in reverse ie, tsugus
		String mnth1 = "";
		for (int i = 0; i < month.length(); i++) {
			mnth1 = month.charAt(i) + mnth1;
		}
		System.out.println(mnth1);

		// print toyota together in reverse; another way
		String car = "toyota";
		String rev = "";
		for (int i = car.length() - 1; i >= 0; i--) {
			System.out.println(car.charAt(i));
			rev = rev + car.charAt(i);
		}
		System.out.println(rev);

		// pragram 4 only vowels from the given string
		int count = 0;
		for (int i = 0; i < car.length(); i++) {
			if (car.charAt(i) == 'a' || car.charAt(i) == 'e' || car.charAt(i) == 'i' || car.charAt(i) == 'o'
					|| car.charAt(i) == 'u') {
				count = count + 1;
			}
		}
		System.out.println(count);

		// program 5 contains

		String subject = "maths accounting computer biology";
		String input = "biology";
		if (subject.contains(input)) {
			System.out.println("Science student");
		} else {
			System.out.println("Not a science student");
		}

		String statement = "I am from Pokhara Nepal";
		String city = "Kathmandu";
		if (statement.contains(city)) {
			System.out.println("city is valid");
		} else {
			System.out.println("city invalid");
		}

		String fruits = "apples oranges banana grapes";
		String shopitem = "banana";
		if (fruits.contains(shopitem)) {
			System.out.println("fruit available");
		} else {
			System.out.println("fruit not available");
		}
		
		String mnt="december";
		String rev2="";
		for (int i2=mnt.length()-1; i2>=0; i2--) {
			char m = mnt.charAt(i2);
			rev2 = rev2+m;
		}
		System.out.println(rev2);
		
		String name="rituthapa";
		String rev3="";
		for (int i=0; i<name.length();i++) {
			rev3=name.charAt(i)+rev;
		}
		System.out.println(rev3);
		
		
		//count of vowels
		String line="I am learning java";
		int countt = 0;
		for (int i=0; i<line.length(); i++) {
			if(line.charAt(i)=='a' || line.charAt(i)=='e' ||line.charAt(i)=='i' || line.charAt(i)=='o' || line.charAt(i)=='u') {
				countt = countt + 1;
			}
		}
		System.out.println(countt);
	}
}
