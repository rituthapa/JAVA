package Two;

enum Colors{
	RED,
	GREEN,
	BLUE
}

//ON THE BACKGROUND, for each constant(ie, RED, or BLUE, or GREEN) WHAT'S Happening is:
//class Colors{
// public static final Colors RED= new Colors();
// public static final Colors GREEN= new Colors();
// public static final Colors BLUE= new Colors();
//}

enum Days{
	SUN,
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT;
}
class Week{
	Days day;
	
	public Week(Days d) {
		this.day=d;
	}
	public void getWeekday() {
		switch(day) {
		case SUN:
			System.out.println("Python");
			break;
		case MON:
			System.out.println("java");
			break;
		case TUE:
			System.out.println("javascript");
			break;
		case WED:
			System.out.println("Excel");
			break;
		case THU:
			System.out.println("SQL");
			break;
		case FRI:
			System.out.println("Css");
			break;
		case SAT:
			System.out.println("C++");
			break;
		}
		 //OR using if else
		if (Days.SUN == day) {
			System.out.println("Python");
		}
		else if (Days.MON == day) {
			System.out.println("java");
		}
		else if (Days.TUE == day) {
			System.out.println("javascript");
		}
		else if (Days.WED == day) {
			System.out.println("Excel");
		}
		else if (Days.THU == day) {
			System.out.println("SQL");
		}
		else if (Days.FRI == day) {
			System.out.println("Css");
		}
		else if (Days.SAT == day) {
			System.out.println("C++");
		}
	}
}



public class day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(Colors.RED);
 System.out.println(Colors.BLUE);
 System.out.println(Colors.GREEN);
 
 //or
 Colors c1 = Colors.RED;
 Colors c2= Colors.BLUE;
 Colors c3= Colors.GREEN;
 System.out.println(c1);
 System.out.println(c2);
 System.out.println(c3);
 
 Week w= new Week(Days.SUN);
 w.getWeekday();
 
Days[] all = Days.values();
System.out.println(all); //gives reference only; need to use for each loop
for (Days dd:all) {
System.out.println(dd); //gives you all the values of 'Days' enum
System.out.println(dd.ordinal()); //ordinal gives you the index/position
	}
	}
}


